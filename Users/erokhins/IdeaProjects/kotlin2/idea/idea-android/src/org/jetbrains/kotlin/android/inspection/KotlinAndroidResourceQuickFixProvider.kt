'UnresolvedReferenceQuickFixProvider<KtSimpleNameReference>' @ [32:47] ==> public constructor UnresolvedReferenceQuickFixProvider<T : (PsiReference..PsiReference?)>() defined in com.intellij.codeInsight.quickfix.UnresolvedReferenceQuickFixProvider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiReference..PsiReference?)> -> KtSimpleNameReference

'ref' @ [35:26] ==> value-parameter ref: KtSimpleNameReference defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'expression' @ [35:30] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'?:' @ [36:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [36:40] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtil[JavaMethodDescriptor]

'expression' @ [36:64] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'?:' @ [37:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: AndroidFacet?, right: AndroidFacet): AndroidFacet[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> AndroidFacet

'getInstance' @ [37:34] ==> @Nullable public open fun getInstance(@NotNull p0: Module): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'contextModule' @ [37:46] ==> val contextModule: Module defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'facet' @ [38:24] ==> val facet: AndroidFacet defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'manifest' @ [38:30] ==> public final val AndroidFacet.manifest: Manifest?[MyPropertyDescriptor]

'manifest' @ [39:9] ==> val manifest: Manifest defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'`package`' @ [39:18] ==> public final val Manifest.`package`: (GenericAttributeValue<(String..String?)>..GenericAttributeValue<(String..String?)>?)[MyPropertyDescriptor]

'value' @ [39:28] ==> public final var <T : (Any..Any?)> GenericAttributeValue<(String..String?)>.value: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'expression' @ [40:27] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'containingFile' @ [40:38] ==> public final val KtSimpleNameExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getReferredResourceOrManifestField' @ [42:20] ==> internal fun getReferredResourceOrManifestField(facet: AndroidFacet, expression: KtSimpleNameExpression, localOnly: Boolean): AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'facet' @ [42:55] ==> val facet: AndroidFacet defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'expression' @ [42:62] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'info' @ [43:13] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'info' @ [43:29] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'isFromManifest' @ [43:34] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.isFromManifest: Boolean[MyPropertyDescriptor]

'getEnum' @ [47:41] ==> public open fun getEnum(p0: (String..String?)): (ResourceType..ResourceType?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'info' @ [47:49] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'className' @ [47:54] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.className: String[MyPropertyDescriptor]

'ALL_VALUE_RESOURCE_TYPES' @ [49:33] ==> public final val ALL_VALUE_RESOURCE_TYPES: (MutableSet<(ResourceType..ResourceType?)>..Set<(ResourceType..ResourceType?)>?) defined in org.jetbrains.android.util.AndroidResourceUtil[JavaPropertyDescriptor]

'contains' @ [49:58] ==> public abstract fun contains(element: (ResourceType..ResourceType?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'resourceType' @ [49:67] ==> val resourceType: (ResourceType..ResourceType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'registrar' @ [50:13] ==> value-parameter registrar: QuickFixActionRegistrar defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'register' @ [50:23] ==> public abstract fun register(@NotNull p0: IntentionAction): Unit defined in com.intellij.codeInsight.daemon.QuickFixActionRegistrar[JavaMethodDescriptor]

'CreateValueResourceQuickFix' @ [50:32] ==> public constructor CreateValueResourceQuickFix(@NotNull p0: AndroidFacet, @NotNull p1: ResourceType, @NotNull p2: String, @NotNull p3: PsiFile, p4: Boolean) defined in org.jetbrains.android.inspections.CreateValueResourceQuickFix[JavaClassConstructorDescriptor]

'facet' @ [50:60] ==> val facet: AndroidFacet defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'resourceType' @ [50:67] ==> val resourceType: (ResourceType..ResourceType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'info' @ [50:81] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'fieldName' @ [50:86] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.fieldName: String[MyPropertyDescriptor]

'contextFile' @ [50:97] ==> val contextFile: PsiFile defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'XML_FILE_RESOURCE_TYPES' @ [52:33] ==> public final val XML_FILE_RESOURCE_TYPES: (MutableMap<(ResourceType..ResourceType?), (ResourceFolderType..ResourceFolderType?)>..Map<(ResourceType..ResourceType?), (ResourceFolderType..ResourceFolderType?)>?) defined in org.jetbrains.android.util.AndroidResourceUtil[JavaPropertyDescriptor]

'contains' @ [52:57] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out (ResourceType..ResourceType?), (ResourceFolderType..ResourceFolderType?)>.contains(key: (ResourceType..ResourceType?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> (com.android.resources.ResourceType..com.android.resources.ResourceType?)
    <V> -> (com.android.resources.ResourceFolderType..com.android.resources.ResourceFolderType?)

'resourceType' @ [52:66] ==> val resourceType: (ResourceType..ResourceType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'getTypeByName' @ [53:57] ==> public open fun getTypeByName(p0: (String..String?)): (ResourceFolderType..ResourceFolderType?) defined in com.android.resources.ResourceFolderType[JavaMethodDescriptor]

'resourceType' @ [53:71] ==> val resourceType: (ResourceType..ResourceType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'getName' @ [53:84] ==> public open fun getName(): (String..String?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'resourceFolderType' @ [54:17] ==> val resourceFolderType: (ResourceFolderType..ResourceFolderType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'registrar' @ [55:17] ==> value-parameter registrar: QuickFixActionRegistrar defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'register' @ [55:27] ==> public abstract fun register(@NotNull p0: IntentionAction): Unit defined in com.intellij.codeInsight.daemon.QuickFixActionRegistrar[JavaMethodDescriptor]

'CreateFileResourceQuickFix' @ [55:36] ==> public constructor CreateFileResourceQuickFix(@NotNull p0: AndroidFacet, @NotNull p1: ResourceFolderType, @NotNull p2: String, @NotNull p3: PsiFile, p4: Boolean) defined in org.jetbrains.android.inspections.CreateFileResourceQuickFix[JavaClassConstructorDescriptor]

'facet' @ [55:63] ==> val facet: AndroidFacet defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'resourceFolderType' @ [55:70] ==> val resourceFolderType: (ResourceFolderType..ResourceFolderType?) defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'info' @ [55:90] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'fieldName' @ [55:95] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.fieldName: String[MyPropertyDescriptor]

'contextFile' @ [55:106] ==> val contextFile: PsiFile defined in org.jetbrains.kotlin.android.inspection.KotlinAndroidResourceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'KtSimpleNameReference' @ [60:40] ==> public constructor KtSimpleNameReference(expression: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedClassConstructorDescriptor]

'java' @ [60:69] ==> public val <T> KClass<KtSimpleNameReference>.java: Class<KtSimpleNameReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference

