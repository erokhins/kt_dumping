'files' @ [46:19] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'first' @ [46:25] ==> public fun <T> Iterable<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'project' @ [46:33] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'KotlinLightClassBuilderFactory' @ [49:35] ==> public constructor KotlinLightClassBuilderFactory(javaFileStub: PsiJavaFileStub) defined in org.jetbrains.kotlin.asJava.builder.KotlinLightClassBuilderFactory[ClassConstructorDescriptorImpl]

'createJavaFileStub' @ [49:66] ==> private fun createJavaFileStub(project: Project, packageFqName: FqName, files: Collection<KtFile>): PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder in file LightClassBuilder.kt[SimpleFunctionDescriptorImpl]

'project' @ [49:85] ==> val project: Project defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'packageFqName' @ [49:94] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'files' @ [49:109] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'GenerationState' @ [50:21] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'project' @ [51:17] ==> val project: Project defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'classBuilderFactory' @ [52:17] ==> val classBuilderFactory: KotlinLightClassBuilderFactory defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'context' @ [53:17] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'module' @ [53:25] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.asJava.builder.LightClassConstructionContext[PropertyDescriptorImpl]

'context' @ [54:17] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'bindingContext' @ [54:25] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.asJava.builder.LightClassConstructionContext[PropertyDescriptorImpl]

'files' @ [55:17] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'toList' @ [55:23] ==> public fun <T> Iterable<KtFile>.toList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'EMPTY' @ [56:39] ==> public final var EMPTY: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaPropertyDescriptor]

'generateClassFilter' @ [57:17] ==> value-parameter generateClassFilter: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'state' @ [60:9] ==> val state: GenerationState defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'beforeCompile' @ [60:15] ==> public final fun beforeCompile(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'invoke' @ [62:9] ==> public abstract operator fun invoke(state: @ParameterName GenerationState, files: @ParameterName Collection<KtFile>): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'state' @ [62:18] ==> val state: GenerationState defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'files' @ [62:25] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'classBuilderFactory' @ [64:28] ==> val classBuilderFactory: KotlinLightClassBuilderFactory defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'result' @ [64:48] ==> public final fun result(): PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.KotlinLightClassBuilderFactory[SimpleFunctionDescriptorImpl]

'getService' @ [66:24] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(StubComputationTracker..StubComputationTracker?)>): (StubComputationTracker..StubComputationTracker?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.asJava.builder.StubComputationTracker..org.jetbrains.kotlin.asJava.builder.StubComputationTracker?)

'project' @ [66:35] ==> val project: Project defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'java' @ [66:74] ==> public val <T> KClass<StubComputationTracker>.java: Class<StubComputationTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StubComputationTracker

'onStubComputed' @ [66:81] ==> public abstract fun onStubComputed(javaFileStub: PsiJavaFileStub, context: LightClassConstructionContext): Unit defined in org.jetbrains.kotlin.asJava.builder.StubComputationTracker[SimpleFunctionDescriptorImpl]

'javaFileStub' @ [66:96] ==> val javaFileStub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'context' @ [66:110] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'LightClassBuilderResult' @ [67:16] ==> public constructor LightClassBuilderResult(stub: PsiJavaFileStub, bindingContext: BindingContext, diagnostics: Diagnostics) defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[ClassConstructorDescriptorImpl]

'javaFileStub' @ [67:40] ==> val javaFileStub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'context' @ [67:54] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'bindingContext' @ [67:62] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.asJava.builder.LightClassConstructionContext[PropertyDescriptorImpl]

'state' @ [67:78] ==> val state: GenerationState defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'collectedExtraJvmDiagnostics' @ [67:84] ==> public final val collectedExtraJvmDiagnostics: Diagnostics defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'e' @ [70:15] ==> val e: ProcessCanceledException defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'logErrorWithOSInfo' @ [73:9] ==> private fun logErrorWithOSInfo(cause: Throwable?, fqName: FqName, virtualFile: VirtualFile?): Unit defined in org.jetbrains.kotlin.asJava.builder in file LightClassBuilder.kt[SimpleFunctionDescriptorImpl]

'e' @ [73:28] ==> val e: RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'packageFqName' @ [73:31] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[ValueParameterDescriptorImpl]

'e' @ [74:15] ==> val e: RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.asJava.builder.buildLightClass[LocalVariableDescriptor]

'PsiJavaFileStubImpl' @ [79:24] ==> public constructor PsiJavaFileStubImpl(p0: (String..String?), p1: Boolean) defined in com.intellij.psi.impl.java.stubs.impl.PsiJavaFileStubImpl[JavaClassConstructorDescriptor]

'packageFqName' @ [79:44] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[ValueParameterDescriptorImpl]

'asString' @ [79:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'javaFileStub' @ [80:5] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'psiFactory' @ [80:18] ==> public final var PsiJavaFileStubImpl.psiFactory: (StubPsiFactory..StubPsiFactory?)[MyPropertyDescriptor]

'INSTANCE' @ [80:56] ==> public final val INSTANCE: (ClsWrapperStubPsiFactory..ClsWrapperStubPsiFactory?) defined in org.jetbrains.kotlin.asJava.builder.ClsWrapperStubPsiFactory[JavaPropertyDescriptor]

'getInstance' @ [82:30] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [82:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[ValueParameterDescriptorImpl]

'getRepresentativeVirtualFile' @ [84:23] ==> private fun getRepresentativeVirtualFile(files: Collection<KtFile>): VirtualFile defined in org.jetbrains.kotlin.asJava.builder in file LightClassBuilder.kt[SimpleFunctionDescriptorImpl]

'files' @ [84:52] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[ValueParameterDescriptorImpl]

'ClsFileImpl' @ [85:29] ==> public constructor ClsFileImpl(@NotNull p0: FileViewProvider) defined in com.intellij.psi.impl.compiled.ClsFileImpl[JavaClassConstructorDescriptor]

'ClassFileViewProvider' @ [85:41] ==> public constructor ClassFileViewProvider(@NotNull p0: PsiManager, @NotNull p1: VirtualFile) defined in com.intellij.psi.ClassFileViewProvider[JavaClassConstructorDescriptor]

'manager' @ [85:63] ==> val manager: PsiManager defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'virtualFile' @ [85:72] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'javaFileStub' @ [86:34] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'packageFqName' @ [88:41] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[ValueParameterDescriptorImpl]

'asString' @ [88:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'javaFileStub' @ [93:5] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'psi' @ [93:18] ==> public final var PsiJavaFileStubImpl.psi: (PsiJavaFile..PsiJavaFile?)[MyPropertyDescriptor]

'fakeFile' @ [93:24] ==> val fakeFile: <no name provided> defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'javaFileStub' @ [94:12] ==> val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.asJava.builder.createJavaFileStub[LocalVariableDescriptor]

'files' @ [98:12] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.builder.getRepresentativeVirtualFile[ValueParameterDescriptorImpl]

'first' @ [98:18] ==> public fun <T> Iterable<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'viewProvider' @ [98:26] ==> public final val KtFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'virtualFile' @ [98:39] ==> public final val FileViewProvider.virtualFile: VirtualFile[MyPropertyDescriptor]

'if (virtualFile == null) "<null>" else virtualFile.path' @ [102:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'virtualFile' @ [102:20] ==> value-parameter virtualFile: VirtualFile? defined in org.jetbrains.kotlin.asJava.builder.logErrorWithOSInfo[ValueParameterDescriptorImpl]

'virtualFile' @ [102:55] ==> value-parameter virtualFile: VirtualFile? defined in org.jetbrains.kotlin.asJava.builder.logErrorWithOSInfo[ValueParameterDescriptorImpl]

'path' @ [102:67] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'LOG' @ [103:5] ==> private val LOG: Logger defined in org.jetbrains.kotlin.asJava.builder in file LightClassBuilder.kt[PropertyDescriptorImpl]

'error' @ [103:9] ==> public open fun error(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [104:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fqName' @ [104:49] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.asJava.builder.logErrorWithOSInfo[ValueParameterDescriptorImpl]

'path' @ [104:69] ==> val path: String defined in org.jetbrains.kotlin.asJava.builder.logErrorWithOSInfo[LocalVariableDescriptor]

'OS_NAME' @ [105:35] ==> public const final val OS_NAME: (String..String?) defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'OS_VERSION' @ [105:57] ==> public const final val OS_VERSION: (String..String?) defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'JAVA_RUNTIME_VERSION' @ [105:96] ==> public const final val JAVA_RUNTIME_VERSION: (String..String?) defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'cause' @ [106:13] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.asJava.builder.logErrorWithOSInfo[ValueParameterDescriptorImpl]

'getInstance' @ [110:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'LightClassBuilderResult' @ [110:38] ==> public constructor LightClassBuilderResult(stub: PsiJavaFileStub, bindingContext: BindingContext, diagnostics: Diagnostics) defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[ClassConstructorDescriptorImpl]

'java' @ [110:69] ==> public val <T> KClass<LightClassBuilderResult>.java: Class<LightClassBuilderResult> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LightClassBuilderResult

