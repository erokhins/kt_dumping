'FacetType<KotlinFacet, KotlinFacetConfiguration>' @ [31:25] ==> public constructor FacetType<F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?), C : (FacetConfiguration..FacetConfiguration?)>(@NotNull p0: FacetTypeId<(KotlinFacet..KotlinFacet?)>, @NotNull @NonNls p1: String, @NotNull p2: String) defined in com.intellij.facet.FacetType[JavaClassConstructorDescriptor]
Inferred types:
    <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> -> KotlinFacet
    <C : (FacetConfiguration..FacetConfiguration?)> -> KotlinFacetConfiguration

'TYPE_ID' @ [31:74] ==> public final val TYPE_ID: FacetTypeId<KotlinFacet> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'ID' @ [31:83] ==> public final val ID: String defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'NAME' @ [31:87] ==> public final val NAME: String defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'FacetTypeId' @ [33:23] ==> public constructor FacetTypeId<F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)>(@NonNls p0: (String..String?)) defined in com.intellij.facet.FacetTypeId[JavaClassConstructorDescriptor]
Inferred types:
    <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> -> KotlinFacet

'getInstance' @ [38:39] ==> public open fun getInstance(): (FacetTypeRegistry..FacetTypeRegistry?) defined in com.intellij.facet.FacetTypeRegistry[JavaMethodDescriptor]

'findFacetType' @ [38:53] ==> @NotNull public abstract fun <F : (Facet<(KotlinFacetConfiguration..KotlinFacetConfiguration?)>..Facet<(KotlinFacetConfiguration..KotlinFacetConfiguration?)>?), C : (FacetConfiguration..FacetConfiguration?)> findFacetType(@NotNull p0: FacetTypeId<(KotlinFacet..KotlinFacet?)>): FacetType<(KotlinFacet..KotlinFacet?), (KotlinFacetConfiguration..KotlinFacetConfiguration?)> defined in com.intellij.facet.FacetTypeRegistry[JavaMethodDescriptor]
Inferred types:
    <F : (Facet<(C..C?)>..Facet<(C..C?)>?)> -> (org.jetbrains.kotlin.idea.facet.KotlinFacet..org.jetbrains.kotlin.idea.facet.KotlinFacet?)
    <C : (FacetConfiguration..FacetConfiguration?)> -> (org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration..org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration?)

'TYPE_ID' @ [38:67] ==> public final val TYPE_ID: FacetTypeId<KotlinFacet> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'moduleType' @ [41:68] ==> value-parameter moduleType: ModuleType<*> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.isSuitableModuleType[ValueParameterDescriptorImpl]

'SMALL_LOGO' @ [43:48] ==> public final val SMALL_LOGO: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'KotlinFacetConfiguration' @ [45:49] ==> public constructor KotlinFacetConfiguration() defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[ClassConstructorDescriptorImpl]

'KotlinFacet' @ [52:9] ==> public constructor KotlinFacet(module: Module, name: String, configuration: KotlinFacetConfiguration) defined in org.jetbrains.kotlin.idea.facet.KotlinFacet[ClassConstructorDescriptorImpl]

'module' @ [52:21] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.createFacet[ValueParameterDescriptorImpl]

'name' @ [52:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.createFacet[ValueParameterDescriptorImpl]

'configuration' @ [52:35] ==> value-parameter configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.createFacet[ValueParameterDescriptorImpl]

'MultipleKotlinFacetEditor' @ [55:13] ==> public constructor MultipleKotlinFacetEditor(project: Project, editors: Array<out FacetEditor>) defined in org.jetbrains.kotlin.idea.facet.MultipleKotlinFacetEditor[ClassConstructorDescriptorImpl]

'project' @ [55:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.createMultipleConfigurationsEditor[ValueParameterDescriptorImpl]

'editors' @ [55:48] ==> value-parameter editors: Array<out FacetEditor> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.createMultipleConfigurationsEditor[ValueParameterDescriptorImpl]

