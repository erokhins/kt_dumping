'TestCaseWithTmpdir' @ [53:57] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'DescriptorRenderer' @ [55:32] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [55:51] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [56:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'excludedAnnotationClasses' @ [57:13] ==> public abstract var excludedAnnotationClasses: Set<FqName> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'setOf' @ [57:41] ==> public fun <T> setOf(element: FqName): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'FqName' @ [58:21] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'ANNOTATION_CLASS_NAME' @ [58:51] ==> public const final val ANNOTATION_CLASS_NAME: String defined in org.jetbrains.kotlin.jvm.compiler.ExpectedLoadErrorsUtil[JavaPropertyDescriptor]

'overrideRenderingPolicy' @ [60:13] ==> public abstract var overrideRenderingPolicy: OverrideRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'RENDER_OPEN_OVERRIDE' @ [60:63] ==> enum entry RENDER_OPEN_OVERRIDE defined in org.jetbrains.kotlin.renderer.OverrideRenderingPolicy[FakeCallableDescriptorForObject]

'parameterNameRenderingPolicy' @ [61:13] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [61:73] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'includePropertyConstant' @ [62:13] ==> public abstract var includePropertyConstant: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'verbose' @ [63:13] ==> public abstract var verbose: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'annotationArgumentsRenderingPolicy' @ [64:13] ==> public abstract var annotationArgumentsRenderingPolicy: AnnotationArgumentsRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'UNLESS_EMPTY' @ [64:85] ==> enum entry UNLESS_EMPTY defined in org.jetbrains.kotlin.renderer.AnnotationArgumentsRenderingPolicy[FakeCallableDescriptorForObject]

'renderDefaultAnnotationArguments' @ [65:13] ==> public abstract var renderDefaultAnnotationArguments: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [66:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [66:25] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [66:52] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

'MOCK_JDK' @ [70:66] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'File' @ [76:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [76:25] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [77:29] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'file' @ [77:38] ==> val file: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'isDirectiveDefined' @ [79:35] ==> public open fun isDirectiveDefined(fileText: (String..String?), directive: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [79:54] ==> val text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(text, "FULL_JDK")) TestJdkKind.FULL_JDK
                else defaultJdkKind' @ [82:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TestJdkKind, elseBranch: TestJdkKind): TestJdkKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TestJdkKind

'isDirectiveDefined' @ [82:43] ==> public open fun isDirectiveDefined(fileText: (String..String?), directive: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [82:62] ==> val text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'FULL_JDK' @ [82:93] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'defaultJdkKind' @ [83:22] ==> protected open val defaultJdkKind: TestJdkKind defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[PropertyDescriptorImpl]

'compileFile' @ [85:9] ==> private final fun compileFile(file: File, text: String, jdkKind: TestJdkKind): Unit defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[SimpleFunctionDescriptorImpl]

'file' @ [85:21] ==> val file: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'text' @ [85:27] ==> val text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'jdkKind' @ [85:33] ==> val jdkKind: TestJdkKind defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'URLClassLoader' @ [87:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [87:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'tmpdir' @ [87:50] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'toURI' @ [87:57] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [87:65] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'runtimeAndReflectJarClassLoader' @ [87:97] ==> @NotNull public open fun runtimeAndReflectJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'createReflectedPackageView' @ [89:22] ==> private final fun createReflectedPackageView(classLoader: URLClassLoader, moduleName: String): AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[SimpleFunctionDescriptorImpl]

'classLoader' @ [89:49] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'TEST_MODULE_NAME' @ [89:78] ==> public final var TEST_MODULE_NAME: (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaPropertyDescriptor]

'Configuration' @ [91:39] ==> public constructor Configuration(checkPrimaryConstructors: Boolean, checkPropertyAccessors: Boolean, includeMethodsOfKotlinAny: Boolean, renderDeclarationsFromOtherModules: Boolean, recursiveFilter: (((DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean..(((DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean)?), validationStrategy: (DescriptorValidator.ValidationVisitor..DescriptorValidator.ValidationVisitor?), renderer: (DescriptorRenderer..DescriptorRenderer?)) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator.Configuration[SamAdapterClassConstructorDescriptor]

'fileName' @ [92:50] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[ValueParameterDescriptorImpl]

'endsWith' @ [92:59] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [97:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [97:34] ==> value-parameter descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'isJavaAnnotationConstructor' @ [97:47] ==> private final fun DeclarationDescriptor.isJavaAnnotationConstructor(): Boolean defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[SimpleFunctionDescriptorImpl]

'errorTypesForbidden' @ [98:17] ==> public open fun errorTypesForbidden(): (DescriptorValidator.ValidationVisitor..DescriptorValidator.ValidationVisitor?) defined in org.jetbrains.kotlin.test.util.DescriptorValidator.ValidationVisitor[JavaMethodDescriptor]

'renderer' @ [98:40] ==> private final val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.Companion[PropertyDescriptorImpl]

'replaceExtension' @ [101:51] ==> @NotNull public open fun replaceExtension(@NotNull file: File, @Nullable newExtension: String?): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'file' @ [101:68] ==> val file: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'differentResultFile' @ [102:13] ==> val differentResultFile: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'exists' @ [102:33] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'validateAndCompareDescriptorWithFile' @ [103:43] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull actual: DeclarationDescriptor, @NotNull configuration: RecursiveDescriptorComparator.Configuration, @NotNull txtFile: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'actual' @ [103:80] ==> val actual: AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'comparatorConfiguration' @ [103:88] ==> val comparatorConfiguration: RecursiveDescriptorComparator.Configuration defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'differentResultFile' @ [103:113] ==> val differentResultFile: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'loadTestPackageAndBindingContextFromJavaRoot' @ [107:43] ==> @NotNull public open fun loadTestPackageAndBindingContextFromJavaRoot(@NotNull javaRoot: File, @NotNull disposable: Disposable, @NotNull testJdkKind: TestJdkKind, @NotNull configurationKind: ConfigurationKind, isBinaryRoot: Boolean, useFastClassReading: Boolean): Pair<(PackageViewDescriptor..PackageViewDescriptor?), (BindingContext..BindingContext?)> defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'tmpdir' @ [108:17] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'testRootDisposable' @ [108:25] ==> public final val AbstractJvmRuntimeDescriptorLoaderTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'jdkKind' @ [108:45] ==> val jdkKind: TestJdkKind defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'ALL' @ [108:72] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'first' @ [109:11] ==> public final val first: (PackageViewDescriptor..PackageViewDescriptor?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'validateAndCompareDescriptors' @ [111:39] ==> public open fun validateAndCompareDescriptors(@NotNull expected: DeclarationDescriptor, @NotNull actual: DeclarationDescriptor, @NotNull configuration: RecursiveDescriptorComparator.Configuration, @Nullable txtFile: File?): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'expected' @ [111:69] ==> val expected: (PackageViewDescriptor..PackageViewDescriptor?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'actual' @ [111:79] ==> val actual: AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'comparatorConfiguration' @ [111:87] ==> val comparatorConfiguration: RecursiveDescriptorComparator.Configuration defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.doTest[LocalVariableDescriptor]

'this' @ [115:13] ==> <this> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.isJavaAnnotationConstructor[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [116:13] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [117:13] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'kind' @ [117:35] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [117:53] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'file' @ [120:24] ==> value-parameter file: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[ValueParameterDescriptorImpl]

'name' @ [120:29] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'when {
            fileName.endsWith(".java") -> {
                val sources = KotlinTestUtils.createTestFiles(fileName, text, object : TestFileFactoryNoModules<File>() {
                    override fun create(fileName: String, text: String, directives: Map<String, String>): File {
                        val targetFile = File(tmpdir, fileName)
                        targetFile.writeText(adaptJavaSource(text))
                        return targetFile
                    }
                })
                LoadDescriptorUtil.compileJavaWithAnnotationsJar(sources, tmpdir)
            }
            fileName.endsWith(".kt") -> {
                val environment = KotlinTestUtils.createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea(
                        myTestRootDisposable, ConfigurationKind.ALL, jdkKind
                )
                val ktFile = KotlinTestUtils.createFile(file.path, text, environment.project)
                GenerationUtils.compileFileTo(ktFile, environment, tmpdir)
            }
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'fileName' @ [122:13] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'endsWith' @ [122:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'createTestFiles' @ [123:47] ==> @NotNull public open fun <M : (Any..Any?), F : (Any..Any?)> createTestFiles(@Nullable testFileName: String?, expectedText: (String..String?), factory: (KotlinTestUtils.TestFileFactory<(Void..Void?), (File..File?)>..KotlinTestUtils.TestFileFactory<(Void..Void?), (File..File?)>?)): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]
Inferred types:
    <M : (Any..Any?)> -> Void
    <F : (Any..Any?)> -> File

'fileName' @ [123:63] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'text' @ [123:73] ==> value-parameter text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[ValueParameterDescriptorImpl]

'TestFileFactoryNoModules<File>' @ [123:88] ==> public constructor TestFileFactoryNoModules<F : (Any..Any?)>() defined in org.jetbrains.kotlin.test.KotlinTestUtils.TestFileFactoryNoModules[JavaClassConstructorDescriptor]
Inferred types:
    <F : (Any..Any?)> -> File

'File' @ [125:42] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [125:47] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'fileName' @ [125:55] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile.<no name provided>.create[ValueParameterDescriptorImpl]

'targetFile' @ [126:25] ==> val targetFile: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile.<no name provided>.create[LocalVariableDescriptor]

'writeText' @ [126:36] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'adaptJavaSource' @ [126:46] ==> private final fun adaptJavaSource(text: String): String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[SimpleFunctionDescriptorImpl]

'text' @ [126:62] ==> value-parameter text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile.<no name provided>.create[ValueParameterDescriptorImpl]

'targetFile' @ [127:32] ==> val targetFile: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile.<no name provided>.create[LocalVariableDescriptor]

'compileJavaWithAnnotationsJar' @ [130:36] ==> public open fun compileJavaWithAnnotationsJar(@NotNull javaFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>), @NotNull outDir: File): Unit defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'sources' @ [130:66] ==> val sources: (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'tmpdir' @ [130:75] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'fileName' @ [132:13] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'endsWith' @ [132:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea' @ [133:51] ==> @NotNull public open fun createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea(@NotNull disposable: Disposable, @NotNull configurationKind: ConfigurationKind, @NotNull jdkKind: TestJdkKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'myTestRootDisposable' @ [134:25] ==> @NotNull protected/*protected and package*/ final val myTestRootDisposable: Disposable defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'ALL' @ [134:65] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'jdkKind' @ [134:70] ==> value-parameter jdkKind: TestJdkKind defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[ValueParameterDescriptorImpl]

'createFile' @ [136:46] ==> @NotNull public open fun createFile(@NotNull @NonNls name: String, @NotNull text: String, @NotNull project: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'file' @ [136:57] ==> value-parameter file: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[ValueParameterDescriptorImpl]

'path' @ [136:62] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'text' @ [136:68] ==> value-parameter text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[ValueParameterDescriptorImpl]

'environment' @ [136:74] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'project' @ [136:86] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'GenerationUtils' @ [137:17] ==> public object GenerationUtils defined in org.jetbrains.kotlin.codegen in file GenerationUtils.kt[FakeCallableDescriptorForObject]

'compileFileTo' @ [137:33] ==> @JvmStatic public final fun compileFileTo(ktFile: KtFile, environment: KotlinCoreEnvironment, output: File): ClassFileFactory defined in org.jetbrains.kotlin.codegen.GenerationUtils[SimpleFunctionDescriptorImpl]

'ktFile' @ [137:47] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'environment' @ [137:55] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.compileFile[LocalVariableDescriptor]

'tmpdir' @ [137:68] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'RuntimeModuleData' @ [143:26] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[FakeCallableDescriptorForObject]

'create' @ [143:44] ==> public final fun create(classLoader: ClassLoader): RuntimeModuleData defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData.Companion[DeserializedSimpleFunctionDescriptor]

'classLoader' @ [143:51] ==> value-parameter classLoader: URLClassLoader defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[ValueParameterDescriptorImpl]

'moduleData' @ [144:9] ==> val moduleData: RuntimeModuleData defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'packagePartProvider' @ [144:20] ==> public final val packagePartProvider: RuntimePackagePartProvider defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[DeserializedPropertyDescriptor]

'registerModule' @ [144:40] ==> public final fun registerModule(moduleName: String): Unit defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [144:55] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[ValueParameterDescriptorImpl]

'moduleData' @ [145:22] ==> val moduleData: RuntimeModuleData defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'module' @ [145:33] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData[DeserializedPropertyDescriptor]

'File' @ [147:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [147:40] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'TEST_PACKAGE_FQNAME' @ [147:67] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'pathSegments' @ [147:87] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'single' @ [147:102] ==> public fun <T> List<(Name..Name?)>.single(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'asString' @ [147:111] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'findFilesByMask' @ [148:38] ==> @NotNull public open fun findFilesByMask(@NotNull p0: Pattern, @NotNull p1: File): (MutableList<(File..File?)>..List<(File..File?)>) defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'compile' @ [148:62] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'generatedPackageDir' @ [148:85] ==> val generatedPackageDir: File defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'arrayListOf' @ [150:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<MemberScope> /* = ArrayList<MemberScope> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope

'arrayListOf' @ [151:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'allClassFiles' @ [152:27] ==> val allClassFiles: (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'classFile' @ [153:29] ==> val classFile: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'toRelativeString' @ [153:39] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [153:56] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest[JavaPropertyDescriptor]

'substringBeforeLast' @ [153:64] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [153:94] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [153:112] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classLoader' @ [155:25] ==> value-parameter classLoader: URLClassLoader defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[ValueParameterDescriptorImpl]

'loadClass' @ [155:37] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'className' @ [155:47] ==> val className: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'sure' @ [155:58] ==> public inline fun <T : Any> Class<out (Any..Any?)>?.sure(message: () -> String): Class<out (Any..Any?)> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Class<out (kotlin.Any..kotlin.Any?)>

'className' @ [155:87] ==> val className: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'ReflectKotlinClass' @ [156:31] ==> public companion object Factory defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[FakeCallableDescriptorForObject]

'create' @ [156:50] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[DeserializedSimpleFunctionDescriptor]

'klass' @ [156:57] ==> val klass: Class<out (Any..Any?)> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'binaryClass' @ [157:26] ==> val binaryClass: ReflectKotlinClass? defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'classHeader' @ [157:39] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[DeserializedPropertyDescriptor]

'if (header?.kind == KotlinClassHeader.Kind.FILE_FACADE || header?.kind == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                val packageView = module.getPackage(LoadDescriptorUtil.TEST_PACKAGE_FQNAME)
                if (!packageScopes.contains(packageView.memberScope)) {
                    packageScopes.add(packageView.memberScope)
                }
            }
            else if (header == null || header.kind == KotlinClassHeader.Kind.CLASS) {
                // Either a normal Kotlin class or a Java class
                val classId = klass.classId
                if (!classId.isLocal) {
                    val classDescriptor = module.findClassAcrossModuleDependencies(classId).sure { "Couldn't resolve class $className" }
                    if (DescriptorUtils.isTopLevelDeclaration(classDescriptor)) {
                        classes.add(classDescriptor)
                    }
                }
            }' @ [159:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'header' @ [159:17] ==> val header: KotlinClassHeader? defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'kind' @ [159:25] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'FILE_FACADE' @ [159:56] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'header' @ [159:71] ==> val header: KotlinClassHeader? defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'kind' @ [159:79] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'MULTIFILE_CLASS' @ [159:110] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'module' @ [160:35] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'getPackage' @ [160:42] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [160:72] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'!' @ [161:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageScopes' @ [161:22] ==> val packageScopes: ArrayList<MemberScope> /* = ArrayList<MemberScope> */ defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'contains' @ [161:36] ==> public open fun contains(element: MemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'packageView' @ [161:45] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'memberScope' @ [161:57] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'packageScopes' @ [162:21] ==> val packageScopes: ArrayList<MemberScope> /* = ArrayList<MemberScope> */ defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'add' @ [162:35] ==> public open fun add(element: MemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'packageView' @ [162:39] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'memberScope' @ [162:51] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'header' @ [165:22] ==> val header: KotlinClassHeader? defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'header' @ [165:40] ==> val header: KotlinClassHeader? defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'kind' @ [165:47] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'CLASS' @ [165:78] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'klass' @ [167:31] ==> val klass: Class<out (Any..Any?)> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'classId' @ [167:37] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect[DeserializedPropertyDescriptor]

'!' @ [168:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [168:22] ==> val classId: ClassId defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'isLocal' @ [168:30] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'module' @ [169:43] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'findClassAcrossModuleDependencies' @ [169:50] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classId' @ [169:84] ==> val classId: ClassId defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'sure' @ [169:93] ==> public inline fun <T : Any> ClassDescriptor?.sure(message: () -> String): ClassDescriptor defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'className' @ [169:125] ==> val className: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'isTopLevelDeclaration' @ [170:41] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [170:63] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'classes' @ [171:25] ==> val classes: ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'add' @ [171:33] ==> public open fun add(element: ClassDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'classDescriptor' @ [171:37] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'SyntheticPackageViewForTest' @ [179:16] ==> public constructor SyntheticPackageViewForTest(module: ModuleDescriptor, packageScopes: List<MemberScope>, classes: List<ClassifierDescriptor>) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[ClassConstructorDescriptorImpl]

'module' @ [179:44] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'packageScopes' @ [179:52] ==> val packageScopes: ArrayList<MemberScope> /* = ArrayList<MemberScope> */ defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'classes' @ [179:67] ==> val classes: ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.createReflectedPackageView[LocalVariableDescriptor]

'arrayOf' @ [183:31] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'typeAnnotations' @ [184:29] ==> val typeAnnotations: Array<String> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource[LocalVariableDescriptor]

'fold' @ [184:45] ==> public inline fun <T, R> Array<out String>.fold(initial: String, operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'text' @ [184:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource[ValueParameterDescriptorImpl]

'text' @ [184:78] ==> value-parameter text: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [184:83] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotation' @ [184:94] ==> value-parameter annotation: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource.<anonymous>[ValueParameterDescriptorImpl]

'!in' @ [185:13] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'adaptedSource' @ [185:30] ==> val adaptedSource: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource[LocalVariableDescriptor]

'adaptedSource' @ [186:20] ==> val adaptedSource: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource[LocalVariableDescriptor]

'replace' @ [186:34] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'adaptedSource' @ [191:16] ==> val adaptedSource: String defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.adaptJavaSource[LocalVariableDescriptor]

'ArrayList' @ [200:24] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MemberScope

'packageScopes' @ [200:47] ==> value-parameter packageScopes: List<MemberScope> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[ValueParameterDescriptorImpl]

'size' @ [200:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'list' @ [201:13] ==> val list: ArrayList<MemberScope> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[LocalVariableDescriptor]

'add' @ [201:18] ==> public open fun add(element: MemberScope): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ScopeWithClassifiers' @ [201:22] ==> public constructor ScopeWithClassifiers(classifiers: List<ClassifierDescriptor>) defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers[ClassConstructorDescriptorImpl]

'classes' @ [201:43] ==> value-parameter classes: List<ClassifierDescriptor> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[ValueParameterDescriptorImpl]

'list' @ [202:13] ==> val list: ArrayList<MemberScope> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[LocalVariableDescriptor]

'addAll' @ [202:18] ==> public open fun addAll(elements: Collection<MemberScope>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'packageScopes' @ [202:25] ==> value-parameter packageScopes: List<MemberScope> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[ValueParameterDescriptorImpl]

'scope' @ [203:13] ==> private final val scope: MemberScope defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[PropertyDescriptorImpl]

'ChainedMemberScope' @ [203:21] ==> public constructor ChainedMemberScope(debugName: String, scopes: List<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[DeserializedClassConstructorDescriptor]

'list' @ [203:75] ==> val list: ArrayList<MemberScope> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.<init>[LocalVariableDescriptor]

'TEST_PACKAGE_FQNAME' @ [207:40] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'scope' @ [209:21] ==> private final val scope: MemberScope defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[PropertyDescriptorImpl]

'listOf' @ [210:67] ==> public fun <T> listOf(element: <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'PackageFragmentDescriptorImpl' @ [211:26] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[DeserializedClassConstructorDescriptor]

'module' @ [211:56] ==> public open val module: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[PropertyDescriptorImpl]

'fqName' @ [211:64] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[PropertyDescriptorImpl]

'scope' @ [212:66] ==> private final val scope: MemberScope defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[PropertyDescriptorImpl]

'visitor' @ [217:17] ==> value-parameter visitor: DeclarationDescriptorVisitor<R, D> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.accept[ValueParameterDescriptorImpl]

'visitPackageViewDescriptor' @ [217:25] ==> public abstract fun visitPackageViewDescriptor(p0: (PackageViewDescriptor..PackageViewDescriptor?), p1: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptorVisitor[JavaMethodDescriptor]

'this' @ [217:52] ==> <this> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest[LazyClassReceiverParameterDescriptor]

'data' @ [217:58] ==> value-parameter data: D defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.SyntheticPackageViewForTest.accept[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [220:44] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [221:93] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [222:40] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [224:27] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'MemberScopeImpl' @ [227:83] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[DeserializedClassConstructorDescriptor]

'HashMap' @ [228:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Name
    <V : (Any..Any?)> -> ClassifierDescriptor

'classifiers' @ [231:32] ==> value-parameter classifiers: List<ClassifierDescriptor> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>[ValueParameterDescriptorImpl]

'classifierMap' @ [232:17] ==> private final val classifierMap: HashMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers[PropertyDescriptorImpl]

'put' @ [232:31] ==> public open fun put(key: Name, value: ClassifierDescriptor): ClassifierDescriptor? defined in java.util.HashMap[JavaMethodDescriptor]

'classifier' @ [232:35] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>[LocalVariableDescriptor]

'name' @ [232:46] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'classifier' @ [232:52] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>[LocalVariableDescriptor]

'let' @ [232:65] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Nothing

'IllegalStateException' @ [233:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'String' @ [233:49] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [233:56] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [234:79] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [234:89] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [234:94] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>.<anonymous>[ValueParameterDescriptorImpl]

'getFqName' @ [235:79] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [235:89] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>[LocalVariableDescriptor]

'classifier' @ [235:102] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.<init>[LocalVariableDescriptor]

'classifierMap' @ [240:110] ==> private final val classifierMap: HashMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers[PropertyDescriptorImpl]

'name' @ [240:124] ==> value-parameter name: Name defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.getContributedClassifier[ValueParameterDescriptorImpl]

'classifierMap' @ [242:150] ==> private final val classifierMap: HashMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers[PropertyDescriptorImpl]

'values' @ [242:164] ==> public open val values: MutableCollection<ClassifierDescriptor> defined in java.util.HashMap[JavaPropertyDescriptor]

'p' @ [245:13] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jvm.runtime.AbstractJvmRuntimeDescriptorLoaderTest.ScopeWithClassifiers.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [245:15] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

