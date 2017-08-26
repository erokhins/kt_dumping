'ProgressIndicatorAndCompilationCanceledStatus' @ [27:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [27:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'state' @ [28:9] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.compileCorrectFiles[ValueParameterDescriptorImpl]

'beforeCompile' @ [28:15] ==> public final fun beforeCompile(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [29:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [29:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'doGenerateFiles' @ [30:9] ==> public final fun doGenerateFiles(files: Collection<KtFile>, state: GenerationState, errorHandler: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade[SimpleFunctionDescriptorImpl]

'state' @ [30:25] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.compileCorrectFiles[ValueParameterDescriptorImpl]

'files' @ [30:31] ==> public final val files: List<KtFile> defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'state' @ [30:38] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.compileCorrectFiles[ValueParameterDescriptorImpl]

'errorHandler' @ [30:45] ==> value-parameter errorHandler: CompilationErrorHandler defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.compileCorrectFiles[ValueParameterDescriptorImpl]

'Psi2IrTranslator' @ [36:22] ==> public constructor Psi2IrTranslator(configuration: Psi2IrConfiguration = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedClassConstructorDescriptor]

'psi2ir' @ [37:29] ==> val psi2ir: Psi2IrTranslator defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'createGeneratorContext' @ [37:36] ==> public final fun createGeneratorContext(moduleDescriptor: ModuleDescriptor, bindingContext: BindingContext): GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedSimpleFunctionDescriptor]

'state' @ [37:59] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'module' @ [37:65] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'state' @ [37:73] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'bindingContext' @ [37:79] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'psi2ir' @ [38:32] ==> val psi2ir: Psi2IrTranslator defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'generateModuleFragment' @ [38:39] ==> public final fun generateModuleFragment(context: GeneratorContext, ktFiles: Collection<KtFile>): IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedSimpleFunctionDescriptor]

'psi2irContext' @ [38:62] ==> val psi2irContext: GeneratorContext defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'files' @ [38:77] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'JvmBackendContext' @ [40:33] ==> public constructor JvmBackendContext(state: GenerationState, psiSourceManager: PsiSourceManager, irBuiltIns: IrBuiltIns) defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[ClassConstructorDescriptorImpl]

'state' @ [40:51] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'psi2irContext' @ [40:58] ==> val psi2irContext: GeneratorContext defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'sourceManager' @ [40:72] ==> public final val sourceManager: PsiSourceManager defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'psi2irContext' @ [40:87] ==> val psi2irContext: GeneratorContext defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'irBuiltIns' @ [40:101] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'JvmBackend' @ [41:26] ==> public constructor JvmBackend(context: JvmBackendContext) defined in org.jetbrains.kotlin.backend.jvm.JvmBackend[ClassConstructorDescriptorImpl]

'jvmBackendContext' @ [41:37] ==> val jvmBackendContext: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'irModuleFragment' @ [43:24] ==> val irModuleFragment: IrModuleFragment defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'files' @ [43:41] ==> public abstract val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[DeserializedPropertyDescriptor]

'jvmBackend' @ [45:17] ==> val jvmBackend: JvmBackend defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'generateFile' @ [45:28] ==> public final fun generateFile(irFile: IrFile): Unit defined in org.jetbrains.kotlin.backend.jvm.JvmBackend[SimpleFunctionDescriptorImpl]

'irFile' @ [45:41] ==> val irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

'state' @ [46:17] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'afterIndependentPart' @ [46:23] ==> public final fun afterIndependentPart(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'errorHandler' @ [49:17] ==> value-parameter errorHandler: CompilationErrorHandler defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[ValueParameterDescriptorImpl]

'reportException' @ [49:30] ==> public abstract fun reportException(p0: (Throwable..Throwable?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaMethodDescriptor]

'e' @ [49:46] ==> val e: Throwable defined in org.jetbrains.kotlin.backend.jvm.JvmBackendFacade.doGenerateFiles[LocalVariableDescriptor]

