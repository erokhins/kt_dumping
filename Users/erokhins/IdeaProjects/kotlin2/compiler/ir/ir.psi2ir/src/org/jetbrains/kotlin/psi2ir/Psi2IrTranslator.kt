'Psi2IrConfiguration' @ [29:65] ==> public constructor Psi2IrConfiguration(ignoreErrors: Boolean = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrConfiguration[ClassConstructorDescriptorImpl]

'SmartList' @ [34:39] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PostprocessingStep

'postprocessingSteps' @ [37:9] ==> private final val postprocessingSteps: SmartList<Psi2IrTranslator.PostprocessingStep> defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[PropertyDescriptorImpl]

'add' @ [37:29] ==> public open fun add(element: (Psi2IrTranslator.PostprocessingStep..Psi2IrTranslator.PostprocessingStep?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'step' @ [37:33] ==> value-parameter step: Psi2IrTranslator.PostprocessingStep defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.add[ValueParameterDescriptorImpl]

'createGeneratorContext' @ [41:23] ==> public final fun createGeneratorContext(moduleDescriptor: ModuleDescriptor, bindingContext: BindingContext): GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [41:46] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModule[ValueParameterDescriptorImpl]

'bindingContext' @ [41:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModule[ValueParameterDescriptorImpl]

'generateModuleFragment' @ [42:16] ==> public final fun generateModuleFragment(context: GeneratorContext, ktFiles: Collection<KtFile>): IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[SimpleFunctionDescriptorImpl]

'context' @ [42:39] ==> val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModule[LocalVariableDescriptor]

'ktFiles' @ [42:48] ==> value-parameter ktFiles: Collection<KtFile> defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModule[ValueParameterDescriptorImpl]

'GeneratorContext' @ [46:13] ==> public constructor GeneratorContext(configuration: Psi2IrConfiguration, moduleDescriptor: ModuleDescriptor, bindingContext: BindingContext) defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[ClassConstructorDescriptorImpl]

'configuration' @ [46:30] ==> public final val configuration: Psi2IrConfiguration defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[PropertyDescriptorImpl]

'moduleDescriptor' @ [46:45] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.createGeneratorContext[ValueParameterDescriptorImpl]

'bindingContext' @ [46:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.createGeneratorContext[ValueParameterDescriptorImpl]

'ModuleGenerator' @ [49:24] ==> public constructor ModuleGenerator(context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[ClassConstructorDescriptorImpl]

'context' @ [49:40] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment[ValueParameterDescriptorImpl]

'generateModuleFragment' @ [49:49] ==> public final fun generateModuleFragment(ktFiles: Collection<KtFile>): IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'ktFiles' @ [49:72] ==> value-parameter ktFiles: Collection<KtFile> defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment[ValueParameterDescriptorImpl]

'postprocess' @ [50:9] ==> private final fun postprocess(context: GeneratorContext, irElement: IrElement): Unit defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[SimpleFunctionDescriptorImpl]

'context' @ [50:21] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment[ValueParameterDescriptorImpl]

'irModule' @ [50:30] ==> val irModule: IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment[LocalVariableDescriptor]

'irModule' @ [51:16] ==> val irModule: IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment[LocalVariableDescriptor]

'insertImplicitCasts' @ [55:9] ==> public fun insertImplicitCasts(builtIns: KotlinBuiltIns, element: IrElement): Unit defined in org.jetbrains.kotlin.psi2ir.transformations in file InsertImplicitCasts.kt[SimpleFunctionDescriptorImpl]

'context' @ [55:29] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.postprocess[ValueParameterDescriptorImpl]

'builtIns' @ [55:37] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'irElement' @ [55:47] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.postprocess[ValueParameterDescriptorImpl]

'postprocessingSteps' @ [57:9] ==> private final val postprocessingSteps: SmartList<Psi2IrTranslator.PostprocessingStep> defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[PropertyDescriptorImpl]

'forEach' @ [57:29] ==> @HidesMembers public inline fun <T> Iterable<(Psi2IrTranslator.PostprocessingStep..Psi2IrTranslator.PostprocessingStep?)>.forEach(action: ((Psi2IrTranslator.PostprocessingStep..Psi2IrTranslator.PostprocessingStep?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.PostprocessingStep..org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.PostprocessingStep?)

'it' @ [57:39] ==> value-parameter it: (Psi2IrTranslator.PostprocessingStep..Psi2IrTranslator.PostprocessingStep?) defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.postprocess.<anonymous>[ValueParameterDescriptorImpl]

'postprocess' @ [57:42] ==> public abstract fun postprocess(context: GeneratorContext, irElement: IrElement): Unit defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.PostprocessingStep[SimpleFunctionDescriptorImpl]

'context' @ [57:54] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.postprocess[ValueParameterDescriptorImpl]

'irElement' @ [57:63] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.postprocess[ValueParameterDescriptorImpl]

