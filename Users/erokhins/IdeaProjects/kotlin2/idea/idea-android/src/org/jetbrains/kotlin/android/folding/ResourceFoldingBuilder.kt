'FoldingBuilderEx' @ [44:32] ==> public constructor FoldingBuilderEx() defined in com.intellij.lang.folding.FoldingBuilderEx[JavaClassConstructorDescriptor]

'compile' @ [48:38] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'getApplication' @ [51:66] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [51:83] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'listOf' @ [52:38] ==> public fun <T> listOf(vararg elements: ResourceType): List<ResourceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResourceType

'STRING' @ [52:58] ==> enum entry STRING defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'DIMEN' @ [53:58] ==> enum entry DIMEN defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'INTEGER' @ [54:58] ==> enum entry INTEGER defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'PLURALS' @ [55:58] ==> enum entry PLURALS defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'getInstance' @ [58:59] ==> public open fun getInstance(): (AndroidFoldingSettings..AndroidFoldingSettings?) defined in com.android.tools.idea.folding.AndroidFoldingSettings[JavaMethodDescriptor]

'isCollapseAndroidStrings' @ [58:73] ==> public final var AndroidFoldingSettings.isCollapseAndroidStrings: Boolean[MyPropertyDescriptor]

'when (this) {
            is UQualifiedReferenceExpression -> selector.unwrapReferenceAndGetValue(resources)
            is UCallExpression -> (valueArguments.firstOrNull() as? UReferenceExpression)?.getAndroidResourceValue(resources, this)
            else -> (this as? UReferenceExpression)?.getAndroidResourceValue(resources)
        }' @ [62:104] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'this' @ [62:110] ==> <this> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ReceiverParameterDescriptorImpl]

'selector' @ [63:49] ==> public abstract val selector: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'unwrapReferenceAndGetValue' @ [63:58] ==> local final tailrec fun UElement.unwrapReferenceAndGetValue(resources: LocalResourceRepository): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[SimpleFunctionDescriptorImpl]

'resources' @ [63:85] ==> value-parameter resources: LocalResourceRepository defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ValueParameterDescriptorImpl]

'valueArguments' @ [64:36] ==> public abstract val valueArguments: List<UExpression> defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'firstOrNull' @ [64:51] ==> public fun <T> List<UExpression>.firstOrNull(): UExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'getAndroidResourceValue' @ [64:92] ==> private final fun UReferenceExpression.getAndroidResourceValue(resources: LocalResourceRepository, call: UCallExpression? = ...): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'resources' @ [64:116] ==> value-parameter resources: LocalResourceRepository defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ValueParameterDescriptorImpl]

'this' @ [64:127] ==> <this> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ReceiverParameterDescriptorImpl]

'this' @ [65:22] ==> <this> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ReceiverParameterDescriptorImpl]

'getAndroidResourceValue' @ [65:54] ==> private final fun UReferenceExpression.getAndroidResourceValue(resources: LocalResourceRepository, call: UCallExpression? = ...): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'resources' @ [65:78] ==> value-parameter resources: LocalResourceRepository defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText.unwrapReferenceAndGetValue[ValueParameterDescriptorImpl]

'?:' @ [68:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'treeElementToPsi' @ [68:42] ==> @Nullable public open fun treeElementToPsi(@Nullable p0: ASTNode?): PsiElement? defined in com.intellij.psi.impl.source.SourceTreeToPsiMap[JavaMethodDescriptor]

'node' @ [68:59] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[ValueParameterDescriptorImpl]

'getAppResources' @ [69:28] ==> private final fun getAppResources(element: PsiElement): LocalResourceRepository? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'element' @ [69:44] ==> val element: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[LocalVariableDescriptor]

'?:' @ [70:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: UastContext?, right: UastContext): UastContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> UastContext

'getService' @ [70:42] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(UastContext..UastContext?)>): (UastContext..UastContext?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.uast.UastContext..org.jetbrains.uast.UastContext?)

'element' @ [70:53] ==> val element: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[LocalVariableDescriptor]

'project' @ [70:61] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'UastContext' @ [70:70] ==> private companion object defined in org.jetbrains.uast.UastContext[FakeCallableDescriptorForObject]

'java' @ [70:89] ==> public val <T> KClass<UastContext>.java: Class<UastContext> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UastContext

'uastContext' @ [71:16] ==> val uastContext: UastContext defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[LocalVariableDescriptor]

'convertElement' @ [71:28] ==> public open fun convertElement(element: PsiElement, parent: UElement?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.UastContext[DeserializedSimpleFunctionDescriptor]

'element' @ [71:43] ==> val element: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[LocalVariableDescriptor]

'unwrapReferenceAndGetValue' @ [71:65] ==> local final tailrec fun UElement.unwrapReferenceAndGetValue(resources: LocalResourceRepository): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[SimpleFunctionDescriptorImpl]

'appResources' @ [71:92] ==> val appResources: LocalResourceRepository defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getPlaceholderText[LocalVariableDescriptor]

'root' @ [75:13] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[ValueParameterDescriptorImpl]

'quick' @ [75:32] ==> value-parameter quick: Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[ValueParameterDescriptorImpl]

'!' @ [75:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'UNIT_TEST_MODE' @ [75:42] ==> private final val UNIT_TEST_MODE: Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

'!' @ [75:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFoldingEnabled' @ [75:61] ==> private final val isFoldingEnabled: Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[PropertyDescriptorImpl]

'==' @ [75:81] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'getInstance' @ [75:94] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'root' @ [75:106] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[ValueParameterDescriptorImpl]

'emptyArray' @ [76:20] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<FoldingDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> FoldingDescriptor

'root' @ [79:20] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[ValueParameterDescriptorImpl]

'toUElement' @ [79:25] ==> public fun PsiElement?.toUElement(): UElement? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [80:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<FoldingDescriptor> /* = ArrayList<FoldingDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FoldingDescriptor

'file' @ [81:9] ==> val file: UElement? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[LocalVariableDescriptor]

'accept' @ [81:15] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UElement[DeserializedSimpleFunctionDescriptor]

'AbstractUastVisitor' @ [81:31] ==> public constructor AbstractUastVisitor() defined in org.jetbrains.uast.visitor.AbstractUastVisitor[DeserializedClassConstructorDescriptor]

'node' @ [83:17] ==> value-parameter node: USimpleNameReferenceExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions.<no name provided>.visitSimpleNameReferenceExpression[ValueParameterDescriptorImpl]

'getFoldingDescriptor' @ [83:22] ==> private final fun UReferenceExpression.getFoldingDescriptor(): FoldingDescriptor? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'let' @ [83:46] ==> @InlineOnly public inline fun <T, R> FoldingDescriptor.let(block: (FoldingDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FoldingDescriptor
    <R> -> Boolean

'result' @ [83:52] ==> val result: ArrayList<FoldingDescriptor> /* = ArrayList<FoldingDescriptor> */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[LocalVariableDescriptor]

'add' @ [83:59] ==> public open fun add(element: FoldingDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [83:63] ==> value-parameter it: FoldingDescriptor defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions.<no name provided>.visitSimpleNameReferenceExpression.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [84:24] ==> <this> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitSimpleNameReferenceExpression' @ [84:30] ==> public open fun visitSimpleNameReferenceExpression(node: USimpleNameReferenceExpression): Boolean defined in org.jetbrains.uast.visitor.AbstractUastVisitor[DeserializedSimpleFunctionDescriptor]

'node' @ [84:65] ==> value-parameter node: USimpleNameReferenceExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions.<no name provided>.visitSimpleNameReferenceExpression[ValueParameterDescriptorImpl]

'result' @ [88:16] ==> val result: ArrayList<FoldingDescriptor> /* = ArrayList<FoldingDescriptor> */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.buildFoldRegions[LocalVariableDescriptor]

'toTypedArray' @ [88:23] ==> public inline fun <reified T> Collection<FoldingDescriptor>.toTypedArray(): Array<FoldingDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> FoldingDescriptor

'isFoldingEnabled' @ [91:65] ==> private final val isFoldingEnabled: Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[PropertyDescriptorImpl]

'resolve' @ [94:24] ==> public abstract fun resolve(): PsiElement? defined in org.jetbrains.uast.UReferenceExpression[DeserializedSimpleFunctionDescriptor]

'resolved' @ [95:28] ==> val resolved: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'getAndroidResourceType' @ [95:37] ==> private final fun PsiElement.getAndroidResourceType(): ResourceType? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'resourceType' @ [96:13] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'RESOURCE_TYPES' @ [96:30] ==> private final val RESOURCE_TYPES: List<ResourceType> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

'psi' @ [98:50] ==> public abstract val psi: PsiElement? defined in org.jetbrains.uast.UElement[DeserializedPropertyDescriptor]

'let' @ [98:55] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> FoldingDescriptor): FoldingDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> FoldingDescriptor

'setOf' @ [99:49] ==> public fun <T> setOf(element: PsiElement): Set<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'psi' @ [99:55] ==> value-parameter psi: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor.createFoldingDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'FoldingDescriptor' @ [100:13] ==> public constructor FoldingDescriptor(@NotNull p0: ASTNode, @NotNull p1: TextRange, @Nullable p2: FoldingGroup?, p3: (MutableSet<(Any..Any?)>..Set<(Any..Any?)>?)) defined in com.intellij.lang.folding.FoldingDescriptor[JavaClassConstructorDescriptor]

'psi' @ [100:31] ==> value-parameter psi: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor.createFoldingDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [100:35] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'psi' @ [100:41] ==> value-parameter psi: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor.createFoldingDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [100:45] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'dependencies' @ [100:62] ==> val dependencies: Set<PsiElement> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor.createFoldingDescriptor.<anonymous>[LocalVariableDescriptor]

'uastParent' @ [103:23] ==> public abstract val uastParent: UElement? defined in org.jetbrains.uast.UReferenceExpression[DeserializedPropertyDescriptor]

'this' @ [103:71] ==> <this> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[ReceiverParameterDescriptorImpl]

'element' @ [104:37] ==> val element: UReferenceExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'uastParent' @ [104:45] ==> public abstract val uastParent: UElement? defined in org.jetbrains.uast.UReferenceExpression[DeserializedPropertyDescriptor]

'takeIf' @ [104:78] ==> @InlineOnly @SinceKotlin public inline fun <T> UCallExpression.takeIf(predicate: (UCallExpression) -> Boolean): UCallExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UCallExpression

'it' @ [104:87] ==> value-parameter it: UCallExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'isFoldableGetResourceValueCall' @ [104:90] ==> private final fun UCallExpression.isFoldableGetResourceValueCall(): Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'getResourceValueCall' @ [105:13] ==> val getResourceValueCall: UCallExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'getResourceValueCall' @ [106:33] ==> val getResourceValueCall: UCallExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'uastParent' @ [106:54] ==> public abstract val uastParent: UElement? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'qualifiedCall' @ [107:17] ==> val qualifiedCall: UQualifiedReferenceExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'selector' @ [107:32] ==> public abstract val selector: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'getResourceValueCall' @ [107:44] ==> val getResourceValueCall: UCallExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'qualifiedCall' @ [108:24] ==> val qualifiedCall: UQualifiedReferenceExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'createFoldingDescriptor' @ [108:38] ==> local final fun UElement.createFoldingDescriptor(): FoldingDescriptor? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[SimpleFunctionDescriptorImpl]

'getResourceValueCall' @ [111:20] ==> val getResourceValueCall: UCallExpression? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'createFoldingDescriptor' @ [111:41] ==> local final fun UElement.createFoldingDescriptor(): FoldingDescriptor? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[SimpleFunctionDescriptorImpl]

'element' @ [114:16] ==> val element: UReferenceExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[LocalVariableDescriptor]

'createFoldingDescriptor' @ [114:24] ==> local final fun UElement.createFoldingDescriptor(): FoldingDescriptor? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getFoldingDescriptor[SimpleFunctionDescriptorImpl]

'methodName' @ [118:16] ==> public abstract val methodName: String? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'methodName' @ [119:16] ==> public abstract val methodName: String? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'methodName' @ [120:16] ==> public abstract val methodName: String? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'methodName' @ [121:16] ==> public abstract val methodName: String? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'startsWith' @ [121:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodName' @ [122:16] ==> public abstract val methodName: String? defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'startsWith' @ [122:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parent' @ [126:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'elementType' @ [127:30] ==> val elementType: PsiClass defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceType[LocalVariableDescriptor]

'parent' @ [127:42] ==> public final val PsiClass.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'R_CLASS' @ [128:13] ==> public const final val R_CLASS: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'elementPackage' @ [128:24] ==> val elementPackage: PsiClass defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceType[LocalVariableDescriptor]

'name' @ [128:39] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'elementPackage' @ [129:13] ==> val elementPackage: PsiClass defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceType[LocalVariableDescriptor]

'qualifiedName' @ [129:28] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'ANDROID_PKG' @ [129:47] ==> public const final val ANDROID_PKG: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'R_CLASS' @ [129:60] ==> public const final val R_CLASS: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'getEnum' @ [130:33] ==> public open fun getEnum(p0: (String..String?)): (ResourceType..ResourceType?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'elementType' @ [130:41] ==> val elementType: PsiClass defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceType[LocalVariableDescriptor]

'name' @ [130:53] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'resolve' @ [137:28] ==> public abstract fun resolve(): PsiElement? defined in org.jetbrains.uast.UReferenceExpression[DeserializedSimpleFunctionDescriptor]

'getAndroidResourceType' @ [137:39] ==> private final fun PsiElement.getAndroidResourceType(): ResourceType? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'FolderConfiguration' @ [138:31] ==> public constructor FolderConfiguration() defined in com.android.ide.common.resources.configuration.FolderConfiguration[JavaClassConstructorDescriptor]

'apply' @ [138:53] ==> @InlineOnly public inline fun <T> FolderConfiguration.apply(block: FolderConfiguration.() -> Unit): FolderConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FolderConfiguration

'localeQualifier' @ [138:61] ==> public final var FolderConfiguration.localeQualifier: (LocaleQualifier..LocaleQualifier?)[MyPropertyDescriptor]

'LocaleQualifier' @ [138:79] ==> public constructor LocaleQualifier(p0: (String..String?)) defined in com.android.ide.common.resources.configuration.LocaleQualifier[JavaClassConstructorDescriptor]

'resolvedName' @ [139:19] ==> public abstract val resolvedName: String? defined in org.jetbrains.uast.UReferenceExpression[DeserializedPropertyDescriptor]

'resources' @ [140:29] ==> value-parameter resources: LocalResourceRepository defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[ValueParameterDescriptorImpl]

'getResourceValue' @ [140:39] ==> private final tailrec fun LocalResourceRepository.getResourceValue(type: ResourceType, name: String, referenceConfig: FolderConfiguration): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'resourceType' @ [140:56] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'key' @ [140:70] ==> val key: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'referenceConfig' @ [140:75] ==> val referenceConfig: FolderConfiguration defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'if (call != null) formatArguments(call, resourceValue) else resourceValue' @ [141:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'call' @ [141:24] ==> value-parameter call: UCallExpression? = ... defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[ValueParameterDescriptorImpl]

'formatArguments' @ [141:38] ==> private final fun formatArguments(callExpression: UCallExpression, formatString: String): String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'call' @ [141:54] ==> value-parameter call: UCallExpression? = ... defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[ValueParameterDescriptorImpl]

'resourceValue' @ [141:60] ==> val resourceValue: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'resourceValue' @ [141:80] ==> val resourceValue: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'if (resourceType == ResourceType.STRING || resourceType == ResourceType.PLURALS) {
            return '"' + StringUtil.shortenTextWithEllipsis(text, FOLD_MAX_LENGTH - 2, 0) + '"'
        }
        else if (text.length <= 1) {
            // Don't just inline empty or one-character replacements: they can't be expanded by a mouse click
            // so are hard to use without knowing about the folding keyboard shortcut to toggle folding.
            // This is similar to how IntelliJ 14 handles call parameters
            return key + ": " + text
        }' @ [143:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resourceType' @ [143:13] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'STRING' @ [143:42] ==> enum entry STRING defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'resourceType' @ [143:52] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'PLURALS' @ [143:81] ==> enum entry PLURALS defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'+' @ [144:20] ==> @InlineOnly public operator inline fun Char.plus(other: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'shortenTextWithEllipsis' @ [144:37] ==> @NotNull @Contract public open fun shortenTextWithEllipsis(@NotNull p0: String, p1: Int, p2: Int): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [144:61] ==> val text: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'FOLD_MAX_LENGTH' @ [144:67] ==> private final val FOLD_MAX_LENGTH: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

'text' @ [146:18] ==> val text: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'length' @ [146:23] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'key' @ [150:20] ==> val key: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'text' @ [150:33] ==> val text: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'shortenTextWithEllipsis' @ [153:27] ==> @NotNull @Contract public open fun shortenTextWithEllipsis(@NotNull p0: String, p1: Int, p2: Int): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [153:51] ==> val text: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAndroidResourceValue[LocalVariableDescriptor]

'FOLD_MAX_LENGTH' @ [153:57] ==> private final val FOLD_MAX_LENGTH: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

'getConfiguredValue' @ [160:21] ==> public open fun getConfiguredValue(p0: (ResourceType..ResourceType?), p1: (String..String?), p2: (FolderConfiguration..FolderConfiguration?)): (ResourceValue..ResourceValue?) defined in com.android.tools.idea.res.LocalResourceRepository[JavaMethodDescriptor]

'type' @ [160:40] ==> value-parameter type: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[ValueParameterDescriptorImpl]

'name' @ [160:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[ValueParameterDescriptorImpl]

'referenceConfig' @ [160:52] ==> value-parameter referenceConfig: FolderConfiguration defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[ValueParameterDescriptorImpl]

'value' @ [160:70] ==> public final var ResourceValue.value: (String..String?)[MyPropertyDescriptor]

'!' @ [161:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [161:14] ==> val value: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'startsWith' @ [161:20] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [162:20] ==> val value: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'component1' @ [165:14] ==> @InlineOnly public operator inline fun <T> List<String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component2' @ [165:34] ==> @InlineOnly public operator inline fun <T> List<String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'value' @ [165:52] ==> val value: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'substring' @ [165:58] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [165:71] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'takeIf' @ [165:82] ==> @InlineOnly @SinceKotlin public inline fun <T> List<String>.takeIf(predicate: (List<String>) -> Boolean): List<String>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'it' @ [165:91] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [165:94] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'value' @ [165:116] ==> val value: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'?:' @ [166:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ResourceType?, right: ResourceType): ResourceType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ResourceType

'getEnum' @ [166:43] ==> public open fun getEnum(p0: (String..String?)): (ResourceType..ResourceType?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'referencedTypeName' @ [166:51] ==> val referencedTypeName: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'value' @ [166:81] ==> val value: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'getResourceValue' @ [167:16] ==> private final tailrec fun LocalResourceRepository.getResourceValue(type: ResourceType, name: String, referenceConfig: FolderConfiguration): String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder[SimpleFunctionDescriptorImpl]

'referencedType' @ [167:33] ==> val referencedType: ResourceType defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'referencedName' @ [167:49] ==> val referencedName: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[LocalVariableDescriptor]

'referenceConfig' @ [167:65] ==> value-parameter referenceConfig: FolderConfiguration defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getResourceValue[ValueParameterDescriptorImpl]

'!' @ [172:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'formatString' @ [172:14] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'contains' @ [172:27] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'formatString' @ [173:20] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'callExpression' @ [176:20] ==> value-parameter callExpression: UCallExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'valueArguments' @ [176:35] ==> public abstract val valueArguments: List<UExpression> defined in org.jetbrains.uast.UCallExpression[DeserializedPropertyDescriptor]

'args' @ [177:13] ==> val args: List<UExpression> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'isEmpty' @ [177:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [177:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'args' @ [177:32] ==> val args: List<UExpression> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'first' @ [177:37] ==> public fun <T> List<UExpression>.first(): UExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'isPsiValid' @ [177:45] ==> public open val isPsiValid: Boolean defined in org.jetbrains.uast.UExpression[DeserializedPropertyDescriptor]

'formatString' @ [178:20] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'FORMAT' @ [181:23] ==> private final val FORMAT: (Pattern..Pattern?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

'matcher' @ [181:30] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'formatString' @ [181:38] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'StringBuilder' @ [186:18] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'*' @ [186:32] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'formatString' @ [186:36] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'length' @ [186:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'if (matcher.find(index)) {
                if ("%" == matcher.group(6)) {
                    index = matcher.end()
                    continue
                }
                val matchStart = matcher.start()
                // Make sure this is not an escaped '%'
                while (prevIndex < matchStart) {
                    val c = formatString[prevIndex]
                    if (c == '\\') {
                        prevIndex++
                    }
                    prevIndex++
                }
                if (prevIndex > matchStart) {
                    // We're in an escape, ignore this result
                    index = prevIndex
                    continue
                }

                index = matcher.end()

                // Shouldn't throw a number format exception since we've already
                // matched the pattern in the regexp
                val number: Int
                var numberString: String? = matcher.group(1)
                if (numberString != null) {
                    // Strip off trailing $
                    numberString = numberString.substring(0, numberString.length - 1)
                    number = Integer.parseInt(numberString)
                    nextNumber = number + 1
                }
                else {
                    number = nextNumber++
                }

                if (number > 0 && number < args.size) {
                    val argExpression = args[number]
                    var value: Any? = argExpression.evaluate()

                    if (value == null) {
                        value = args[number].asSourceString()
                    }

                    for (i in start..matchStart - 1) {
                        sb.append(formatString[i])
                    }

                    sb.append("{")
                    sb.append(value)
                    sb.append('}')
                    start = index
                }
            }
            else {
                var i = start
                val n = formatString.length
                while (i < n) {
                    sb.append(formatString[i])
                    i++
                }
                break
            }' @ [188:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'matcher' @ [188:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'find' @ [188:25] ==> public open fun find(p0: Int): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'index' @ [188:30] ==> var index: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'==' @ [189:21] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'matcher' @ [189:28] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'group' @ [189:36] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'index' @ [190:21] ==> var index: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'matcher' @ [190:29] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'end' @ [190:37] ==> public open fun end(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [193:34] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'start' @ [193:42] ==> public open fun start(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'prevIndex' @ [195:24] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'matchStart' @ [195:36] ==> val matchStart: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'formatString' @ [196:29] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'prevIndex' @ [196:42] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'c' @ [197:25] ==> val c: Char defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'prevIndex' @ [198:25] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'prevIndex' @ [200:21] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'prevIndex' @ [202:21] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'matchStart' @ [202:33] ==> val matchStart: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'index' @ [204:21] ==> var index: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'prevIndex' @ [204:29] ==> var prevIndex: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'index' @ [208:17] ==> var index: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'matcher' @ [208:25] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'end' @ [208:33] ==> public open fun end(): Int defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [213:45] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'group' @ [213:53] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'if (numberString != null) {
                    // Strip off trailing $
                    numberString = numberString.substring(0, numberString.length - 1)
                    number = Integer.parseInt(numberString)
                    nextNumber = number + 1
                }
                else {
                    number = nextNumber++
                }' @ [214:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'numberString' @ [214:21] ==> var numberString: String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'numberString' @ [216:21] ==> var numberString: String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'numberString' @ [216:36] ==> var numberString: String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'substring' @ [216:49] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'numberString' @ [216:62] ==> var numberString: String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'length' @ [216:75] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'number' @ [217:21] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'parseInt' @ [217:38] ==> public open fun parseInt(p0: (String..String?)): Int defined in java.lang.Integer[JavaMethodDescriptor]

'numberString' @ [217:47] ==> var numberString: String? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'nextNumber' @ [218:21] ==> var nextNumber: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [218:34] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [221:21] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'nextNumber' @ [221:30] ==> var nextNumber: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [224:21] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [224:35] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'args' @ [224:44] ==> val args: List<UExpression> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'size' @ [224:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'args' @ [225:41] ==> val args: List<UExpression> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [225:46] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'argExpression' @ [226:39] ==> val argExpression: UExpression defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'evaluate' @ [226:53] ==> public open fun evaluate(): Any? defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'value' @ [228:25] ==> var value: Any? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'value' @ [229:25] ==> var value: Any? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'args' @ [229:33] ==> val args: List<UExpression> defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'number' @ [229:38] ==> val number: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'asSourceString' @ [229:46] ==> public open fun asSourceString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'start' @ [232:31] ==> var start: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'matchStart' @ [232:38] ==> val matchStart: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'sb' @ [233:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'append' @ [233:28] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'formatString' @ [233:35] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'i' @ [233:48] ==> val i: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'sb' @ [236:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'append' @ [236:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [237:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'append' @ [237:24] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'value' @ [237:31] ==> var value: Any? defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'sb' @ [238:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'append' @ [238:24] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'start' @ [239:21] ==> var start: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'index' @ [239:29] ==> var index: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'start' @ [243:25] ==> var start: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'formatString' @ [244:25] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'length' @ [244:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'i' @ [245:24] ==> var i: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'n' @ [245:28] ==> val n: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'sb' @ [246:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'append' @ [246:24] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'formatString' @ [246:31] ==> value-parameter formatString: String defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[ValueParameterDescriptorImpl]

'i' @ [246:44] ==> var i: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'i' @ [247:21] ==> var i: Int defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'sb' @ [253:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.formatArguments[LocalVariableDescriptor]

'toString' @ [253:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'findModuleForPsiElement' @ [256:97] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'element' @ [256:121] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAppResources[ValueParameterDescriptorImpl]

'let' @ [256:131] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> AppResourceRepository?): AppResourceRepository? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> AppResourceRepository?

'getAppResources' @ [257:31] ==> @Nullable public open fun getAppResources(@NotNull p0: Module, p1: Boolean): AppResourceRepository? defined in com.android.tools.idea.res.AppResourceRepository[JavaMethodDescriptor]

'it' @ [257:47] ==> value-parameter it: Module defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.getAppResources.<anonymous>[ValueParameterDescriptorImpl]

'FORCE_PROJECT_RESOURCE_LOADING' @ [257:51] ==> private final val FORCE_PROJECT_RESOURCE_LOADING: Boolean defined in org.jetbrains.kotlin.android.folding.ResourceFoldingBuilder.Companion[PropertyDescriptorImpl]

