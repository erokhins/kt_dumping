'getExtensions' @ [20:17] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(AnalysisHandlerExtension..AnalysisHandlerExtension?)>): (Array<(AnalysisHandlerExtension..AnalysisHandlerExtension?)>..Array<out (AnalysisHandlerExtension..AnalysisHandlerExtension?)>) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension..org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension?)

'extensionPointName' @ [20:56] ==> public final val extensionPointName: ExtensionPointName<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [21:18] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<UastAnalysisHandlerExtension> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> UastAnalysisHandlerExtension

'firstOrNull' @ [22:18] ==> public fun <T> List<UastAnalysisHandlerExtension>.firstOrNull(): UastAnalysisHandlerExtension? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UastAnalysisHandlerExtension

'element' @ [25:16] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.internal.CliKotlinUastBindingContextProviderService.getBindingContext[ValueParameterDescriptorImpl]

'project' @ [25:24] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'analysisCompletedHandler' @ [25:32] ==> public final val Project.analysisCompletedHandler: UastAnalysisHandlerExtension? defined in org.jetbrains.uast.kotlin.internal.CliKotlinUastBindingContextProviderService[PropertyDescriptorImpl]

'getBindingContext' @ [25:58] ==> public final fun getBindingContext(): BindingContext? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'EMPTY' @ [25:96] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [29:16] ==> value-parameter element: KtElement defined in org.jetbrains.uast.kotlin.internal.CliKotlinUastBindingContextProviderService.getTypeMapper[ValueParameterDescriptorImpl]

'project' @ [29:24] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'analysisCompletedHandler' @ [29:32] ==> public final val Project.analysisCompletedHandler: UastAnalysisHandlerExtension? defined in org.jetbrains.uast.kotlin.internal.CliKotlinUastBindingContextProviderService[PropertyDescriptorImpl]

'getTypeMapper' @ [29:58] ==> public final fun getTypeMapper(): KotlinTypeMapper? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[SimpleFunctionDescriptorImpl]

'context' @ [37:31] ==> private final var context: BindingContext? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'typeMapper' @ [40:13] ==> private final var typeMapper: KotlinTypeMapper? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'typeMapper' @ [40:40] ==> private final var typeMapper: KotlinTypeMapper? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'context' @ [41:30] ==> private final var context: BindingContext? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'KotlinTypeMapper' @ [43:26] ==> public constructor KotlinTypeMapper(@NotNull p0: BindingContext, @NotNull p1: ClassBuilderMode, @NotNull p2: JvmFileClassesProvider, @NotNull p3: IncompatibleClassTracker, @NotNull p4: String, p5: Boolean, p6: Boolean) defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaClassConstructorDescriptor]

'bindingContext' @ [43:43] ==> val bindingContext: BindingContext defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension.getTypeMapper[LocalVariableDescriptor]

'LIGHT_CLASSES' @ [43:76] ==> public final val LIGHT_CLASSES: (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'NoResolveFileClassesProvider' @ [43:91] ==> public object NoResolveFileClassesProvider : JvmFileClassesProvider defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'DoNothing' @ [44:68] ==> public object DoNothing : IncompatibleClassTracker defined in org.jetbrains.kotlin.codegen.state.IncompatibleClassTracker[FakeCallableDescriptorForObject]

'DEFAULT_MODULE_NAME' @ [44:86] ==> public const final val DEFAULT_MODULE_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'this' @ [45:9] ==> <this> defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[LazyClassReceiverParameterDescriptor]

'typeMapper' @ [45:14] ==> private final var typeMapper: KotlinTypeMapper? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'typeMapper' @ [45:27] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension.getTypeMapper[LocalVariableDescriptor]

'typeMapper' @ [46:16] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension.getTypeMapper[LocalVariableDescriptor]

'context' @ [55:9] ==> private final var context: BindingContext? defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension[PropertyDescriptorImpl]

'bindingTrace' @ [55:19] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.uast.kotlin.internal.UastAnalysisHandlerExtension.analysisCompleted[ValueParameterDescriptorImpl]

'bindingContext' @ [55:32] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

