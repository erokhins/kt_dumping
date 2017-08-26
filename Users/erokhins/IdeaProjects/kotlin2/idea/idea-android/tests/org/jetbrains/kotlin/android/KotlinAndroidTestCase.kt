'AndroidTestCase' @ [24:40] ==> public constructor AndroidTestCase() defined in org.jetbrains.kotlin.android.AndroidTestCase[JavaClassConstructorDescriptor]

'getHomeDirectory' @ [25:54] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'myFixture' @ [28:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[JavaPropertyDescriptor]

'copyFileToProject' @ [28:19] ==> @NotNull public abstract fun copyFileToProject(@NotNull p0: String, @NotNull p1: String): VirtualFile defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'FN_ANDROID_MANIFEST_XML' @ [28:95] ==> public const final val FN_ANDROID_MANIFEST_XML: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'File' @ [32:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [32:29] ==> value-parameter path: String defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase.copyResourceDirectoryForTest[ValueParameterDescriptorImpl]

'if (testFile.isFile) {
            myFixture.copyDirectoryToProject(testFile.parent + "/res", "res")
        } else if (testFile.isDirectory) {
            myFixture.copyDirectoryToProject(testFile.path + "/res", "res")
        }' @ [33:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'testFile' @ [33:13] ==> val testFile: File defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase.copyResourceDirectoryForTest[LocalVariableDescriptor]

'isFile' @ [33:22] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'myFixture' @ [34:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[JavaPropertyDescriptor]

'copyDirectoryToProject' @ [34:23] ==> @NotNull public abstract fun copyDirectoryToProject(@NotNull p0: String, @NotNull p1: String): VirtualFile defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testFile' @ [34:46] ==> val testFile: File defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase.copyResourceDirectoryForTest[LocalVariableDescriptor]

'parent' @ [34:55] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'testFile' @ [35:20] ==> val testFile: File defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase.copyResourceDirectoryForTest[LocalVariableDescriptor]

'isDirectory' @ [35:29] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'myFixture' @ [36:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase[JavaPropertyDescriptor]

'copyDirectoryToProject' @ [36:23] ==> @NotNull public abstract fun copyDirectoryToProject(@NotNull p0: String, @NotNull p1: String): VirtualFile defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testFile' @ [36:46] ==> val testFile: File defined in org.jetbrains.kotlin.android.KotlinAndroidTestCase.copyResourceDirectoryForTest[LocalVariableDescriptor]

'path' @ [36:55] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

