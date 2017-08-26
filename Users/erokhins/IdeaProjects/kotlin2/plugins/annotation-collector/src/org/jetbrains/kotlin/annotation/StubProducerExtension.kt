'GenerationState' @ [46:31] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'project' @ [47:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'StubClassBuilderFactory' @ [48:17] ==> public constructor StubClassBuilderFactory() defined in org.jetbrains.kotlin.annotation.StubClassBuilderFactory[ClassConstructorDescriptorImpl]

'module' @ [49:17] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingTrace' @ [50:17] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [50:30] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'files' @ [51:17] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'toList' @ [51:23] ==> public fun <T> Iterable<KtFile>.toList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'EMPTY' @ [52:39] ==> public final var EMPTY: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaPropertyDescriptor]

'compileCorrectFiles' @ [54:29] ==> public open fun compileCorrectFiles(@NotNull p0: GenerationState, @NotNull p1: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.KotlinCodegenFacade[JavaMethodDescriptor]

'generationState' @ [54:49] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[LocalVariableDescriptor]

'THROW_EXCEPTION' @ [54:90] ==> public final val THROW_EXCEPTION: (CompilationErrorHandler..CompilationErrorHandler?) defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaPropertyDescriptor]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stubsOutputDir' @ [56:14] ==> private final val stubsOutputDir: File defined in org.jetbrains.kotlin.annotation.StubProducerExtension[PropertyDescriptorImpl]

'exists' @ [56:29] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'stubsOutputDir' @ [56:39] ==> private final val stubsOutputDir: File defined in org.jetbrains.kotlin.annotation.StubProducerExtension[PropertyDescriptorImpl]

'mkdirs' @ [56:54] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'generationState' @ [57:9] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[LocalVariableDescriptor]

'factory' @ [57:25] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'writeAll' @ [57:33] ==> public fun OutputFileCollection.writeAll(outputDir: File, messageCollector: MessageCollector, reportOutputFiles: Boolean): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils in file outputUtils.kt[SimpleFunctionDescriptorImpl]

'stubsOutputDir' @ [57:42] ==> private final val stubsOutputDir: File defined in org.jetbrains.kotlin.annotation.StubProducerExtension[PropertyDescriptorImpl]

'messageCollector' @ [57:58] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.annotation.StubProducerExtension[PropertyDescriptorImpl]

'reportOutputFiles' @ [57:76] ==> private final val reportOutputFiles: Boolean defined in org.jetbrains.kotlin.annotation.StubProducerExtension[PropertyDescriptorImpl]

'generationState' @ [59:9] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[LocalVariableDescriptor]

'destroy' @ [59:25] ==> public final fun destroy(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'AnalysisResult' @ [60:16] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [60:31] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor, shouldGenerateCode: Boolean): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [60:54] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'module' @ [60:61] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.annotation.StubProducerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'KAPT' @ [66:59] ==> public final val KAPT: (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'Concrete' @ [68:87] ==> public constructor Concrete(@NotNull p0: ClassVisitor) defined in org.jetbrains.kotlin.codegen.AbstractClassBuilder.Concrete[JavaClassConstructorDescriptor]

'ClassWriter' @ [69:13] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'or' @ [69:25] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'COMPUTE_FRAMES' @ [69:37] ==> public const final val COMPUTE_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaPropertyDescriptor]

'COMPUTE_MAXS' @ [69:67] ==> public const final val COMPUTE_MAXS: Int defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaPropertyDescriptor]

'UnsupportedOperationException' @ [71:56] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'builder' @ [74:23] ==> value-parameter builder: ClassBuilder defined in org.jetbrains.kotlin.annotation.StubClassBuilderFactory.asBytes[ValueParameterDescriptorImpl]

'visitor' @ [74:31] ==> public final val ClassBuilder.visitor: ClassVisitor[MyPropertyDescriptor]

'visitor' @ [75:16] ==> val visitor: ClassWriter defined in org.jetbrains.kotlin.annotation.StubClassBuilderFactory.asBytes[LocalVariableDescriptor]

'toByteArray' @ [75:24] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

