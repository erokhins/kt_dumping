'KotlinFacetSettings' @ [29:20] ==> public constructor KotlinFacetSettings() defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedClassConstructorDescriptor]

'Suppress' @ [32:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'settings' @ [34:9] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'deserializeFacetSettings' @ [34:20] ==> public fun deserializeFacetSettings(element: Element): KotlinFacetSettings defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'element' @ [34:45] ==> value-parameter element: Element defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.readExternal[ValueParameterDescriptorImpl]

'Suppress' @ [37:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'settings' @ [39:9] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'serializeFacetSettings' @ [39:18] ==> public fun KotlinFacetSettings.serializeFacetSettings(element: Element): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'element' @ [39:41] ==> value-parameter element: Element defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.writeExternal[ValueParameterDescriptorImpl]

'settings' @ [46:9] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'initializeIfNeeded' @ [46:18] ==> public fun KotlinFacetSettings.initializeIfNeeded(module: Module, rootModel: ModuleRootModel?, platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'editorContext' @ [46:37] ==> value-parameter editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'module' @ [46:51] ==> public final val FacetEditorContext.module: Module[MyPropertyDescriptor]

'editorContext' @ [46:59] ==> value-parameter editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'rootModel' @ [46:73] ==> public final val FacetEditorContext.rootModel: ModuleRootModel[MyPropertyDescriptor]

'arrayListOf' @ [48:20] ==> public fun <T> arrayListOf(vararg elements: FacetEditorTab): ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FacetEditorTab

'KotlinFacetEditorGeneralTab' @ [48:48] ==> public constructor KotlinFacetEditorGeneralTab(configuration: KotlinFacetConfiguration, editorContext: FacetEditorContext, validatorsManager: FacetValidatorsManager) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetEditorGeneralTab[ClassConstructorDescriptorImpl]

'this' @ [48:76] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[LazyClassReceiverParameterDescriptor]

'editorContext' @ [48:82] ==> value-parameter editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'validatorsManager' @ [48:97] ==> value-parameter validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'KotlinFacetCompilerPluginsTab' @ [49:13] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacetCompilerPluginsTab[FakeCallableDescriptorForObject]

'parsePluginOptions' @ [49:43] ==> public final fun parsePluginOptions(configuration: KotlinFacetConfiguration): List<CliOptionValue> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetCompilerPluginsTab.Companion[SimpleFunctionDescriptorImpl]

'this' @ [49:62] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[LazyClassReceiverParameterDescriptor]

'isNotEmpty' @ [49:68] ==> @InlineOnly public inline fun <T> Collection<CliOptionValue>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOptionValue

'tabs' @ [50:13] ==> val tabs: ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[LocalVariableDescriptor]

'KotlinFacetCompilerPluginsTab' @ [50:21] ==> public constructor KotlinFacetCompilerPluginsTab(configuration: KotlinFacetConfiguration, validatorsManager: FacetValidatorsManager) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetCompilerPluginsTab[ClassConstructorDescriptorImpl]

'this' @ [50:51] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[LazyClassReceiverParameterDescriptor]

'validatorsManager' @ [50:57] ==> value-parameter validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'KotlinFacetConfigurationExtension' @ [52:9] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfigurationExtension[FakeCallableDescriptorForObject]

'EP_NAME' @ [52:43] ==> public final val EP_NAME: ExtensionPointName<KotlinFacetConfigurationExtension> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfigurationExtension.Companion[PropertyDescriptorImpl]

'extensions' @ [52:51] ==> public final val <T : (Any..Any?)> ExtensionPointName<KotlinFacetConfigurationExtension>.extensions: (Array<(KotlinFacetConfigurationExtension..KotlinFacetConfigurationExtension?)>..Array<out (KotlinFacetConfigurationExtension..KotlinFacetConfigurationExtension?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinFacetConfigurationExtension

'flatMapTo' @ [52:62] ==> public inline fun <T, R, C : MutableCollection<in FacetEditorTab>> Array<out (KotlinFacetConfigurationExtension..KotlinFacetConfigurationExtension?)>.flatMapTo(destination: ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */, transform: ((KotlinFacetConfigurationExtension..KotlinFacetConfigurationExtension?)) -> Iterable<FacetEditorTab>): ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.facet.KotlinFacetConfigurationExtension..org.jetbrains.kotlin.idea.facet.KotlinFacetConfigurationExtension?)
    <R> -> FacetEditorTab
    <C : MutableCollection<in R>> -> ArrayList<FacetEditorTab>

'tabs' @ [52:72] ==> val tabs: ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[LocalVariableDescriptor]

'it' @ [52:80] ==> value-parameter it: (KotlinFacetConfigurationExtension..KotlinFacetConfigurationExtension?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs.<anonymous>[ValueParameterDescriptorImpl]

'createEditorTabs' @ [52:83] ==> public abstract fun createEditorTabs(editorContext: FacetEditorContext, validatorsManager: FacetValidatorsManager): List<FacetEditorTab> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfigurationExtension[SimpleFunctionDescriptorImpl]

'editorContext' @ [52:100] ==> value-parameter editorContext: FacetEditorContext defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'validatorsManager' @ [52:115] ==> value-parameter validatorsManager: FacetValidatorsManager defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[ValueParameterDescriptorImpl]

'tabs' @ [53:16] ==> val tabs: ArrayList<FacetEditorTab> /* = ArrayList<FacetEditorTab> */ defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration.createEditorTabs[LocalVariableDescriptor]

'toTypedArray' @ [53:21] ==> public inline fun <reified T> Collection<FacetEditorTab>.toTypedArray(): Array<FacetEditorTab> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> FacetEditorTab

