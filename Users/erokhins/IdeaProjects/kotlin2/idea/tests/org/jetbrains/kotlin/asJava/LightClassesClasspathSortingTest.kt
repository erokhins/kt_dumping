'KotlinCodeInsightTestCase' @ [31:42] ==> public constructor KotlinCodeInsightTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinCodeInsightTestCase[JavaClassConstructorDescriptor]

'doTest' @ [33:9] ==> private final fun doTest(fqName: String): Unit defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[SimpleFunctionDescriptorImpl]

'doTest' @ [37:9] ==> private final fun doTest(fqName: String): Unit defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [44:23] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[JavaMethodDescriptor]

'module' @ [45:9] ==> public final val LightClassesClasspathSortingTest.module: (Module..Module?)[MyPropertyDescriptor]

'configureAs' @ [45:16] ==> public fun Module.configureAs(descriptor: KotlinLightProjectDescriptor): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'getProjectDescriptor' @ [45:28] ==> private final fun getProjectDescriptor(dir: String): JdkAndMockLibraryProjectDescriptor defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[SimpleFunctionDescriptorImpl]

'dirName' @ [45:49] ==> val dirName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[LocalVariableDescriptor]

'File' @ [47:27] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [47:32] ==> protected for synthetic extension final val LightClassesClasspathSortingTest.testDataPath: String?[MyPropertyDescriptor]

'File' @ [48:25] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDirRoot' @ [48:30] ==> val testDirRoot: File defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[LocalVariableDescriptor]

'dirName' @ [48:43] ==> val dirName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[LocalVariableDescriptor]

'listFiles' @ [48:52] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'map' @ [48:64] ==> public inline fun <T, R> Array<out (File..File?)>.map(transform: ((File..File?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> String

'it' @ [48:70] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'toRelativeString' @ [48:73] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'testDirRoot' @ [48:90] ==> val testDirRoot: File defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[LocalVariableDescriptor]

'toTypedArray' @ [48:105] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'configureByFiles' @ [49:9] ==> protected/*protected and package*/ open fun configureByFiles(@Nullable p0: String?, @NotNull vararg p1: (String..String?)): (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[JavaMethodDescriptor]

'filePaths' @ [49:33] ==> val filePaths: Array<String> defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[LocalVariableDescriptor]

'checkLightClassBeforeDecompiled' @ [51:9] ==> private final fun checkLightClassBeforeDecompiled(fqName: String): Unit defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest[SimpleFunctionDescriptorImpl]

'fqName' @ [51:41] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.doTest[ValueParameterDescriptorImpl]

'getInstance' @ [55:38] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [55:50] ==> public final val LightClassesClasspathSortingTest.project: (Project..Project?)[MyPropertyDescriptor]

'findClass' @ [55:59] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [55:69] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[ValueParameterDescriptorImpl]

'getElementResolveScope' @ [55:97] ==> @NotNull public open fun getElementResolveScope(@NotNull p0: PsiElement): GlobalSearchScope defined in com.intellij.psi.impl.ResolveScopeManager[JavaMethodDescriptor]

'file' @ [55:120] ==> public final val LightClassesClasspathSortingTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'assertNotNull' @ [57:9] ==> public fun <T : Any> assertNotNull(actual: PsiClass?, message: String? = ...): PsiClass defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'psiClass' @ [57:23] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'fqName' @ [57:56] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[ValueParameterDescriptorImpl]

'psiClass' @ [58:9] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'assert' @ [59:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [59:16] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'psiClass' @ [59:64] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'fqName' @ [59:146] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[ValueParameterDescriptorImpl]

'psiClass' @ [59:155] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'java' @ [59:171] ==> public val <T> KClass<out PsiClass>.java: Class<out PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'assert' @ [60:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [60:16] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'fqName' @ [60:109] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[ValueParameterDescriptorImpl]

'psiClass' @ [60:118] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.checkLightClassBeforeDecompiled[LocalVariableDescriptor]

'java' @ [60:134] ==> public val <T> KClass<out PsiClass>.java: Class<out PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'JdkAndMockLibraryProjectDescriptor' @ [64:13] ==> public constructor JdkAndMockLibraryProjectDescriptor(sourcesPath: (String..String?), withSources: Boolean) defined in org.jetbrains.kotlin.idea.test.JdkAndMockLibraryProjectDescriptor[JavaClassConstructorDescriptor]

'+' @ [64:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [64:67] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'dir' @ [64:123] ==> value-parameter dir: String defined in org.jetbrains.kotlin.asJava.LightClassesClasspathSortingTest.getProjectDescriptor[ValueParameterDescriptorImpl]

'+' @ [67:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [67:35] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

