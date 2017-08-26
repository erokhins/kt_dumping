'elements' @ [49:9] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'forEach' @ [49:18] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [50:14] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectSlowLineMarkers.<anonymous>[ValueParameterDescriptorImpl]

'getLineMarkerInfo' @ [50:31] ==> private final fun KtClass.getLineMarkerInfo(): LineMarkerInfo<PsiElement>? defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider[SimpleFunctionDescriptorImpl]

'let' @ [50:52] ==> @InlineOnly public inline fun <T, R> LineMarkerInfo<PsiElement>.let(block: (LineMarkerInfo<PsiElement>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineMarkerInfo<PsiElement>
    <R> -> Boolean

'result' @ [50:68] ==> value-parameter result: MutableCollection<LineMarkerInfo<PsiElement>> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectSlowLineMarkers[ValueParameterDescriptorImpl]

'add' @ [50:75] ==> public abstract fun add(element: LineMarkerInfo<PsiElement>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'marker' @ [50:79] ==> value-parameter marker: LineMarkerInfo<PsiElement> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectSlowLineMarkers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [55:30] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'?:' @ [56:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: AndroidFacet?, right: AndroidFacet): AndroidFacet[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> AndroidFacet

'getInstance' @ [56:41] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'this' @ [56:53] ==> <this> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[ReceiverParameterDescriptorImpl]

'androidFacet' @ [57:24] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'manifest' @ [57:37] ==> public final val AndroidFacet.manifest: Manifest?[MyPropertyDescriptor]

'collectGoToRelatedManifestItems' @ [58:29] ==> private final fun KtClass.collectGoToRelatedManifestItems(manifest: Manifest): List<GotoRelatedItem> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider[SimpleFunctionDescriptorImpl]

'manifest' @ [58:61] ==> val manifest: Manifest defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'manifestItems' @ [59:13] ==> val manifestItems: List<GotoRelatedItem> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'isEmpty' @ [59:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [59:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isClassWithLayoutXml' @ [59:41] ==> private final fun KtClass.isClassWithLayoutXml(): Boolean defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.Companion[SimpleFunctionDescriptorImpl]

'LineMarkerInfo' @ [63:16] ==> public constructor LineMarkerInfo<T : (PsiElement..PsiElement?)>(@NotNull p0: PsiElement, @NotNull p1: TextRange, p2: (Icon..Icon?), p3: Int, @Nullable p4: Function<in (PsiElement..PsiElement?), (String..String?)>?, @Nullable p5: GutterIconNavigationHandler<(PsiElement..PsiElement?)>?, @NotNull p6: GutterIconRenderer.Alignment) defined in com.intellij.codeInsight.daemon.LineMarkerInfo[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'nameIdentifier' @ [64:21] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'nameIdentifier' @ [65:21] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'textRange' @ [65:36] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'Xml' @ [66:40] ==> public final val Xml: (Icon..Icon?) defined in com.intellij.icons.AllIcons.FileTypes[JavaPropertyDescriptor]

'LINE_MARKERS' @ [67:26] ==> public const final val LINE_MARKERS: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'Function' @ [68:21] ==> public fun <Param : (Any..Any?), Result : (Any..Any?)> Function(function: ((PsiElement..PsiElement?)) -> (String..String?)): Function<(PsiElement..PsiElement?), (String..String?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <Param : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <Result : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'GutterIconNavigationHandler' @ [69:21] ==> public fun <T : (PsiElement..PsiElement?)> GutterIconNavigationHandler(function: ((MouseEvent..MouseEvent?), (PsiElement..PsiElement?)) -> Unit): GutterIconNavigationHandler<(PsiElement..PsiElement?)> defined in com.intellij.codeInsight.daemon[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'getRelatedItemsPopup' @ [71:34] ==> @NotNull public open fun getRelatedItemsPopup(p0: (MutableList<out (GotoRelatedItem..GotoRelatedItem?)>..List<(GotoRelatedItem..GotoRelatedItem?)>?), p1: (String..String?)): JBPopup defined in com.intellij.codeInsight.navigation.NavigationUtil[JavaMethodDescriptor]

'manifestItems' @ [72:41] ==> val manifestItems: List<GotoRelatedItem> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'collectGoToRelatedLayoutItems' @ [72:57] ==> private final fun KtClass.collectGoToRelatedLayoutItems(androidFacet: AndroidFacet): List<GotoRelatedItem> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider[SimpleFunctionDescriptorImpl]

'androidFacet' @ [72:87] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo[LocalVariableDescriptor]

'show' @ [74:34] ==> public abstract fun show(@NotNull p0: RelativePoint): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'RelativePoint' @ [74:39] ==> public constructor RelativePoint(@NotNull p0: MouseEvent) defined in com.intellij.ui.awt.RelativePoint[JavaClassConstructorDescriptor]

'e' @ [74:53] ==> value-parameter e: MouseEvent defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.getLineMarkerInfo.<anonymous>[ValueParameterDescriptorImpl]

'RIGHT' @ [76:50] ==> enum entry RIGHT defined in com.intellij.openapi.editor.markup.GutterIconRenderer.Alignment[FakeCallableDescriptorForObject]

'mutableSetOf' @ [80:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile

'accept' @ [81:9] ==> public final fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'KtVisitorVoid' @ [81:24] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'element' @ [83:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [83:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [83:40] ==> <this> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [87:17] ==> <this> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReferenceExpression' @ [87:23] ==> public open fun visitReferenceExpression(@NotNull p0: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [87:48] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'getName' @ [89:56] ==> public open fun getName(): (String..String?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'expression' @ [90:29] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'let' @ [90:69] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> AndroidResourceUtil.MyReferredResourceFieldInfo?): AndroidResourceUtil.MyReferredResourceFieldInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> MyReferredResourceFieldInfo?

'getReferredResourceOrManifestField' @ [91:21] ==> internal fun getReferredResourceOrManifestField(facet: AndroidFacet, expression: KtSimpleNameExpression, className: String?, localOnly: Boolean): AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'androidFacet' @ [91:56] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems[ValueParameterDescriptorImpl]

'it' @ [91:70] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression.<anonymous>[ValueParameterDescriptorImpl]

'resClassName' @ [91:74] ==> val resClassName: (String..String?) defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'info' @ [94:21] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'info' @ [94:37] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'isFromManifest' @ [94:42] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.isFromManifest: Boolean[MyPropertyDescriptor]

'androidFacet' @ [98:29] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems[ValueParameterDescriptorImpl]

'localResourceManager' @ [99:26] ==> public final val AndroidFacet.localResourceManager: LocalResourceManager[MyPropertyDescriptor]

'findResourcesByFieldName' @ [100:26] ==> @NotNull public open fun findResourcesByFieldName(@NotNull p0: String, @NotNull p1: String): (MutableList<(PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>) defined in org.jetbrains.android.resourceManagers.LocalResourceManager[JavaMethodDescriptor]

'resClassName' @ [100:51] ==> val resClassName: (String..String?) defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'info' @ [100:65] ==> val info: AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'fieldName' @ [100:70] ==> public final val AndroidResourceUtil.MyReferredResourceFieldInfo.fieldName: String[MyPropertyDescriptor]

'filterIsInstance' @ [101:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiFile

'resources' @ [103:17] ==> val resources: MutableSet<PsiFile> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems[LocalVariableDescriptor]

'addAll' @ [103:27] ==> public abstract fun addAll(elements: Collection<PsiFile>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'files' @ [103:34] ==> val files: List<PsiFile> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'resources' @ [107:16] ==> val resources: MutableSet<PsiFile> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems[LocalVariableDescriptor]

'map' @ [107:26] ==> public inline fun <T, R> Iterable<PsiFile>.map(transform: (PsiFile) -> KotlinAndroidLineMarkerProvider.GotoRelatedLayoutItem): List<KotlinAndroidLineMarkerProvider.GotoRelatedLayoutItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> GotoRelatedLayoutItem

'GotoRelatedLayoutItem' @ [107:32] ==> public constructor GotoRelatedLayoutItem(file: PsiFile) defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.GotoRelatedLayoutItem[ClassConstructorDescriptorImpl]

'it' @ [107:54] ==> value-parameter it: PsiFile defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedLayoutItems.<anonymous>[ValueParameterDescriptorImpl]

'findComponentDeclarationInManifest' @ [111:13] ==> internal fun KtClass.findComponentDeclarationInManifest(manifest: Manifest): AndroidAttributeValue<PsiClass>? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'manifest' @ [111:48] ==> value-parameter manifest: Manifest defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedManifestItems[ValueParameterDescriptorImpl]

'xmlAttributeValue' @ [111:59] ==> public final val <T : (Any..Any?)> AndroidAttributeValue<PsiClass>.xmlAttributeValue: XmlAttributeValue?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiClass

'let' @ [111:78] ==> @InlineOnly public inline fun <T, R> XmlAttributeValue.let(block: (XmlAttributeValue) -> List<KotlinAndroidLineMarkerProvider.GotoManifestItem>): List<KotlinAndroidLineMarkerProvider.GotoManifestItem> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlAttributeValue
    <R> -> List<GotoManifestItem>

'listOf' @ [111:84] ==> public fun <T> listOf(element: KotlinAndroidLineMarkerProvider.GotoManifestItem): List<KotlinAndroidLineMarkerProvider.GotoManifestItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GotoManifestItem

'GotoManifestItem' @ [111:91] ==> public constructor GotoManifestItem(attributeValue: XmlAttributeValue) defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.GotoManifestItem[ClassConstructorDescriptorImpl]

'it' @ [111:108] ==> value-parameter it: XmlAttributeValue defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.collectGoToRelatedManifestItems.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [111:118] ==> public fun <T> emptyList(): List<GotoRelatedItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GotoRelatedItem

'GotoRelatedItem' @ [113:73] ==> public constructor GotoRelatedItem(@NotNull p0: PsiElement) defined in com.intellij.navigation.GotoRelatedItem[JavaClassConstructorDescriptor]

'attributeValue' @ [113:89] ==> value-parameter attributeValue: XmlAttributeValue defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.GotoManifestItem.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [116:59] ==> public final val INSTANCE: (XmlFileType..XmlFileType?) defined in com.intellij.ide.highlighter.XmlFileType[JavaPropertyDescriptor]

'icon' @ [116:68] ==> public final val XmlFileType.icon: Icon?[MyPropertyDescriptor]

'GotoRelatedItem' @ [119:70] ==> public constructor GotoRelatedItem(@NotNull p0: PsiElement, p1: (String..String?)) defined in com.intellij.navigation.GotoRelatedItem[JavaClassConstructorDescriptor]

'file' @ [119:86] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.GotoRelatedLayoutItem.<init>[ValueParameterDescriptorImpl]

'file' @ [120:62] ==> private final val file: PsiFile defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.GotoRelatedLayoutItem[PropertyDescriptorImpl]

'containingDirectory' @ [120:67] ==> public final val PsiFile.containingDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'name' @ [120:87] ==> public final var PsiDirectory.name: String[MyPropertyDescriptor]

'arrayOf' @ [124:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'CLASS_ACTIVITY' @ [125:30] ==> public const final val CLASS_ACTIVITY: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'CLASS_FRAGMENT' @ [126:30] ==> public const final val CLASS_FRAGMENT: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'CLASS_V4_FRAGMENT' @ [127:30] ==> public const final val CLASS_V4_FRAGMENT: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'?:' @ [131:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: SimpleType?, right: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> SimpleType

'resolveToDescriptor' @ [131:25] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [131:61] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'defaultType' @ [131:92] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'CLASSES_WITH_LAYOUT_XML' @ [132:20] ==> private final val CLASSES_WITH_LAYOUT_XML: Array<String> defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.Companion[PropertyDescriptorImpl]

'any' @ [132:44] ==> public inline fun <T> Array<out String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'type' @ [132:50] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.Companion.isClassWithLayoutXml[LocalVariableDescriptor]

'isSubclassOf' @ [132:55] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [132:68] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.KotlinAndroidLineMarkerProvider.Companion.isClassWithLayoutXml.<anonymous>[ValueParameterDescriptorImpl]

