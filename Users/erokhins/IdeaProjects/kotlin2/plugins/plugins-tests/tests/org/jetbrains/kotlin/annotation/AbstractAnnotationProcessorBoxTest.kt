'KotlinTestWithEnvironmentManagement' @ [31:53] ==> public constructor KotlinTestWithEnvironmentManagement() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironmentManagement[JavaClassConstructorDescriptor]

'File' @ [33:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [33:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[ValueParameterDescriptorImpl]

'testDir' @ [35:45] ==> val testDir: File defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'listFiles' @ [36:18] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'file' @ [36:38] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.filesByExtension.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [36:43] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'file' @ [36:53] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.filesByExtension.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [36:58] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'equals' @ [36:68] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ext' @ [36:75] ==> value-parameter ext: String defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.filesByExtension[ValueParameterDescriptorImpl]

'sortedBy' @ [37:18] ==> public inline fun <T, R : Comparable<String>> Array<out (File..File?)>.sortedBy(crossinline selector: ((File..File?)) -> String?): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R : Comparable<R>> -> String

'it' @ [37:29] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.filesByExtension.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [37:32] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'getTestName' @ [39:24] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest[JavaMethodDescriptor]

'filesByExtension' @ [40:23] ==> local final fun filesByExtension(ext: String): List<(File..File?)> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[SimpleFunctionDescriptorImpl]

'testName' @ [41:43] ==> val testName: (String..String?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'contains' @ [41:52] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testName' @ [42:28] ==> val testName: (String..String?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'contains' @ [42:37] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filesByExtension' @ [44:25] ==> local final fun filesByExtension(ext: String): List<(File..File?)> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[SimpleFunctionDescriptorImpl]

'if (javaFiles.isNotEmpty()) {
                    KotlinTestUtils.tmpDir("java-files").also { javaSourceRoot ->
                        javaFiles.forEach { javaFile -> javaFile.copyTo(File(javaSourceRoot, javaFile.name)) }
                    }
                }
                else null' @ [46:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'javaFiles' @ [46:21] ==> val javaFiles: List<(File..File?)> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'isNotEmpty' @ [46:31] ==> @InlineOnly public inline fun <T> Collection<(File..File?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'tmpDir' @ [47:37] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'also' @ [47:58] ==> @InlineOnly @SinceKotlin public inline fun <T> File.also(block: (File) -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'javaFiles' @ [48:25] ==> val javaFiles: List<(File..File?)> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'forEach' @ [48:35] ==> @HidesMembers public inline fun <T> Iterable<(File..File?)>.forEach(action: ((File..File?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'javaFile' @ [48:57] ==> value-parameter javaFile: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copyTo' @ [48:66] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [48:73] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaSourceRoot' @ [48:78] ==> value-parameter javaSourceRoot: File defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'javaFile' @ [48:94] ==> value-parameter javaFile: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [48:103] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'newConfiguration' @ [53:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull p2: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p3: (MutableList<(File..File?)>..List<(File..File?)>)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [54:35] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [54:52] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'listOf' @ [54:62] ==> public fun <T> listOf(element: (File..File?)): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'getAnnotationsJar' @ [54:85] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'listOfNotNull' @ [54:107] ==> public fun <T : Any> listOfNotNull(element: File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> File

'javaSourceRoot' @ [54:121] ==> val javaSourceRoot: File? defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'KotlinCoreEnvironment' @ [56:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [56:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [56:64] ==> public final val AbstractAnnotationProcessorBoxTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [56:84] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [56:122] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [57:23] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'project' @ [57:35] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'AnnotationCollectorExtensionForTests' @ [59:34] ==> public constructor AnnotationCollectorExtensionForTests(supportInheritedAnnotations: Boolean) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests[ClassConstructorDescriptorImpl]

'supportInheritedAnnotations' @ [59:71] ==> val supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'ClassBuilderInterceptorExtension' @ [60:9] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [60:42] ==> public final fun registerExtension(project: Project, extension: ClassBuilderInterceptorExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [60:60] ==> val project: Project defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'collectorExtension' @ [60:69] ==> val collectorExtension: AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'supportStubs' @ [62:13] ==> val supportStubs: Boolean defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'tmpDir' @ [63:44] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'StubProducerExtension' @ [64:41] ==> public constructor StubProducerExtension(stubsOutputDir: File, messageCollector: MessageCollector, reportOutputFiles: Boolean) defined in org.jetbrains.kotlin.annotation.StubProducerExtension[DeserializedClassConstructorDescriptor]

'stubsDir' @ [64:63] ==> val stubsDir: File defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'NONE' @ [64:90] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'AnalysisHandlerExtension' @ [65:13] ==> public companion object : ProjectExtensionDescriptor<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [65:38] ==> public final fun registerExtension(project: Project, extension: AnalysisHandlerExtension): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [65:56] ==> val project: Project defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'stubProducerExtension' @ [65:65] ==> val stubProducerExtension: StubProducerExtension defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'ktFiles' @ [68:25] ==> val ktFiles: List<(File..File?)> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'map' @ [68:33] ==> public inline fun <T, R> Iterable<(File..File?)>.map(transform: ((File..File?)) -> KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> KtFile

'createFile' @ [68:55] ==> @NotNull public open fun createFile(@NotNull @NonNls p0: String, @NotNull p1: String, @NotNull p2: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'it' @ [68:66] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:69] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'doLoadFile' @ [68:91] ==> public open fun doLoadFile(@NotNull p0: File): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'it' @ [68:102] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'environment' @ [68:107] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'project' @ [68:119] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'generateFiles' @ [70:25] ==> @NotNull public open fun generateFiles(@NotNull p0: KotlinCoreEnvironment, @NotNull p1: CodegenTestFiles): ClassFileFactory defined in org.jetbrains.kotlin.codegen.CodegenTestUtil[JavaMethodDescriptor]

'environment' @ [70:39] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'create' @ [70:69] ==> @NotNull public open fun create(@NotNull p0: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>)): CodegenTestFiles defined in org.jetbrains.kotlin.codegen.CodegenTestFiles[JavaMethodDescriptor]

'testFiles' @ [70:76] ==> val testFiles: List<KtFile> defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'collectorExtension' @ [72:33] ==> val collectorExtension: AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'stringWriter' @ [72:52] ==> public final val stringWriter: StringWriter defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests[PropertyDescriptorImpl]

'toString' @ [72:65] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'File' @ [73:39] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [73:44] ==> value-parameter path: String defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[ValueParameterDescriptorImpl]

'assertEqualsToFile' @ [75:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedAnnotationsFile' @ [75:44] ==> val expectedAnnotationsFile: File defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'actualAnnotations' @ [75:69] ==> val actualAnnotations: String defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.doTest[LocalVariableDescriptor]

'AnnotationCollectorExtensionBase' @ [80:9] ==> public constructor AnnotationCollectorExtensionBase(supportInheritedAnnotations: Boolean) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtensionBase[DeserializedClassConstructorDescriptor]

'supportInheritedAnnotations' @ [80:42] ==> value-parameter supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests.<init>[ValueParameterDescriptorImpl]

'StringWriter' @ [81:28] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'stringWriter' @ [83:62] ==> public final val stringWriter: StringWriter defined in org.jetbrains.kotlin.annotation.AbstractAnnotationProcessorBoxTest.AnnotationCollectorExtensionForTests[PropertyDescriptorImpl]

'listOf' @ [86:45] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

