# clean project
chmod +x gradlew
./gradlew clean --stacktrace

# build
if [ $buildType = 'debug' ]; then
	./gradlew assembleDebug --stacktrace
elif [ $buildType = 'release' ]; then
	./gradlew assembleRelease --stacktrace
fi

# ready expected final APK
apkFileName="app-$buildType.apk"

# check if exists, if not exit with error
if [ ! -e "app/build/outputs/apk/$buildType/$apkFileName" ]; then
    echo "ERROR: File not exists: (app/build/outputs/apk/$buildType/$apkFileName)"
    exit 1
fi

rm -r artifacts/
mkdir artifacts
cp app/build/outputs/apk/$buildType/$apkFileName artifacts/

./gradlew lint

rm -r report/
mkdir report
cp app/build/reports/lint-results.xml report/