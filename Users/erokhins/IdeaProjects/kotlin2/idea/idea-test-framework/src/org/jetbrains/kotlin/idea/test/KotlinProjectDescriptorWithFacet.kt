'KotlinLightProjectDescriptor' @ [31:80] ==> protected/*protected and package*/ constructor KotlinLightProjectDescriptor() defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaClassConstructorDescriptor]

'configureKotlinFacet' @ [33:9] ==> public fun configureKotlinFacet(module: Module, configureCallback: KotlinFacetConfiguration.() -> Unit = ...): KotlinFacet defined in org.jetbrains.kotlin.idea.test in file KotlinProjectDescriptorWithFacet.kt[SimpleFunctionDescriptorImpl]

'module' @ [33:30] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.test.KotlinProjectDescriptorWithFacet.configureModule[ValueParameterDescriptorImpl]

'settings' @ [34:13] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[DeserializedPropertyDescriptor]

'languageLevel' @ [34:22] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageVersion' @ [34:38] ==> public final val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.test.KotlinProjectDescriptorWithFacet[PropertyDescriptorImpl]

'KotlinProjectDescriptorWithFacet' @ [39:25] ==> public constructor KotlinProjectDescriptorWithFacet(languageVersion: LanguageVersion) defined in org.jetbrains.kotlin.idea.test.KotlinProjectDescriptorWithFacet[ClassConstructorDescriptorImpl]

'KOTLIN_1_0' @ [39:74] ==> enum entry KOTLIN_1_0 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'getInstance' @ [44:37] ==> public open fun getInstance(@NotNull p0: Module): (FacetManager..FacetManager?) defined in com.intellij.facet.FacetManager[JavaMethodDescriptor]

'module' @ [44:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[ValueParameterDescriptorImpl]

'facetManager' @ [45:22] ==> val facetManager: (FacetManager..FacetManager?) defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'createModifiableModel' @ [45:35] ==> @NotNull public abstract fun createModifiableModel(): ModifiableFacetModel defined in com.intellij.facet.FacetManager[JavaMethodDescriptor]

'KotlinFacetConfiguration' @ [46:25] ==> public constructor KotlinFacetConfiguration() defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[DeserializedClassConstructorDescriptor]

'configuration' @ [47:5] ==> val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'settings' @ [47:19] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[DeserializedPropertyDescriptor]

'initializeIfNeeded' @ [47:28] ==> public fun KotlinFacetSettings.initializeIfNeeded(module: Module, rootModel: ModuleRootModel?, platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [47:47] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[ValueParameterDescriptorImpl]

'configuration' @ [48:5] ==> val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'settings' @ [48:19] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[DeserializedPropertyDescriptor]

'useProjectSettings' @ [48:28] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'configuration' @ [49:5] ==> val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'invoke' @ [49:19] ==> public abstract operator fun KotlinFacetConfiguration.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'facetManager' @ [50:17] ==> val facetManager: (FacetManager..FacetManager?) defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'createFacet' @ [50:30] ==> @NotNull public abstract fun <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?), C : (FacetConfiguration..FacetConfiguration?)> createFacet(@NotNull p0: FacetType<(KotlinFacet..KotlinFacet?), (KotlinFacetConfiguration..KotlinFacetConfiguration?)>, @NotNull p1: String, @NotNull p2: KotlinFacetConfiguration, @Nullable p3: raw (Facet<(FacetConfiguration..FacetConfiguration?)>?..Facet<*>?)): KotlinFacet defined in com.intellij.facet.FacetManager[JavaMethodDescriptor]
Inferred types:
    <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> -> (org.jetbrains.kotlin.idea.facet.KotlinFacet..org.jetbrains.kotlin.idea.facet.KotlinFacet?)
    <C : (FacetConfiguration..FacetConfiguration?)> -> (org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration..org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration?)

'INSTANCE' @ [50:58] ==> public final val INSTANCE: KotlinFacetType defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[DeserializedPropertyDescriptor]

'configuration' @ [50:78] ==> val configuration: KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'facetModel' @ [51:5] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'addFacet' @ [51:16] ==> public abstract fun addFacet(p0: raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)): Unit defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]

'facet' @ [51:25] ==> val facet: KotlinFacet defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'runInEdtAndWait' @ [52:5] ==> public fun runInEdtAndWait(runnable: () -> Unit): Unit defined in org.jetbrains.kotlin.test.testFramework[DeserializedSimpleFunctionDescriptor]

'runWriteAction' @ [53:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.test.testFramework[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'facetModel' @ [53:26] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

'commit' @ [53:37] ==> public abstract fun commit(): Unit defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]

'facet' @ [55:12] ==> val facet: KotlinFacet defined in org.jetbrains.kotlin.idea.test.configureKotlinFacet[LocalVariableDescriptor]

