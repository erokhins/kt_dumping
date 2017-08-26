'manifest' @ [52:23] ==> value-parameter manifest: Manifest defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[ValueParameterDescriptorImpl]

'application' @ [52:32] ==> public final val Manifest.application: (Application..Application?)[MyPropertyDescriptor]

'?:' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: SimpleType?, right: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> SimpleType

'resolveToDescriptor' @ [53:17] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [53:53] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'defaultType' @ [53:84] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'when {
        type.isSubclassOf(AndroidUtils.ACTIVITY_BASE_CLASS_NAME) ->
            application.activities?.find { it.activityClass.value?.qualifiedName == fqName?.asString() }?.activityClass
        type.isSubclassOf(AndroidUtils.SERVICE_CLASS_NAME) ->
            application.services?.find { it.serviceClass.value?.qualifiedName == fqName?.asString() }?.serviceClass
        type.isSubclassOf(AndroidUtils.RECEIVER_CLASS_NAME) ->
            application.receivers?.find { it.receiverClass.value?.qualifiedName == fqName?.asString() }?.receiverClass
        type.isSubclassOf(AndroidUtils.PROVIDER_CLASS_NAME) ->
            application.providers?.find { it.providerClass.value?.qualifiedName == fqName?.asString() }?.providerClass
        else -> null
    }' @ [55:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AndroidAttributeValue<PsiClass>?, entry1: AndroidAttributeValue<PsiClass>?, entry2: AndroidAttributeValue<PsiClass>?, entry3: AndroidAttributeValue<PsiClass>?, entry4: AndroidAttributeValue<PsiClass>?): AndroidAttributeValue<PsiClass>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AndroidAttributeValue<PsiClass>?

'type' @ [56:9] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'isSubclassOf' @ [56:14] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'ACTIVITY_BASE_CLASS_NAME' @ [56:40] ==> @NonNls public const final val ACTIVITY_BASE_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'application' @ [57:13] ==> val application: Application defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'activities' @ [57:25] ==> public final val Application.activities: (MutableList<(Activity..Activity?)>..List<(Activity..Activity?)>?)[MyPropertyDescriptor]

'find' @ [57:37] ==> @InlineOnly public inline fun <T> Iterable<(Activity..Activity?)>.find(predicate: ((Activity..Activity?)) -> Boolean): Activity? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.android.dom.manifest.Activity..org.jetbrains.android.dom.manifest.Activity?)

'it' @ [57:44] ==> value-parameter it: (Activity..Activity?) defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest.<anonymous>[ValueParameterDescriptorImpl]

'activityClass' @ [57:47] ==> public final val Activity.activityClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [57:61] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [57:68] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [57:85] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [57:93] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'activityClass' @ [57:107] ==> public final val Activity.activityClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'type' @ [58:9] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'isSubclassOf' @ [58:14] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'SERVICE_CLASS_NAME' @ [58:40] ==> @NonNls public const final val SERVICE_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'application' @ [59:13] ==> val application: Application defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'services' @ [59:25] ==> public final val Application.services: (MutableList<(Service..Service?)>..List<(Service..Service?)>?)[MyPropertyDescriptor]

'find' @ [59:35] ==> @InlineOnly public inline fun <T> Iterable<(Service..Service?)>.find(predicate: ((Service..Service?)) -> Boolean): Service? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.android.dom.manifest.Service..org.jetbrains.android.dom.manifest.Service?)

'it' @ [59:42] ==> value-parameter it: (Service..Service?) defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest.<anonymous>[ValueParameterDescriptorImpl]

'serviceClass' @ [59:45] ==> public final val Service.serviceClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [59:58] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [59:65] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [59:82] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [59:90] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'serviceClass' @ [59:104] ==> public final val Service.serviceClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'type' @ [60:9] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'isSubclassOf' @ [60:14] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'RECEIVER_CLASS_NAME' @ [60:40] ==> @NonNls public const final val RECEIVER_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'application' @ [61:13] ==> val application: Application defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'receivers' @ [61:25] ==> public final val Application.receivers: (MutableList<(Receiver..Receiver?)>..List<(Receiver..Receiver?)>?)[MyPropertyDescriptor]

'find' @ [61:36] ==> @InlineOnly public inline fun <T> Iterable<(Receiver..Receiver?)>.find(predicate: ((Receiver..Receiver?)) -> Boolean): Receiver? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.android.dom.manifest.Receiver..org.jetbrains.android.dom.manifest.Receiver?)

'it' @ [61:43] ==> value-parameter it: (Receiver..Receiver?) defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest.<anonymous>[ValueParameterDescriptorImpl]

'receiverClass' @ [61:46] ==> public final val Receiver.receiverClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [61:60] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [61:67] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [61:84] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [61:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'receiverClass' @ [61:106] ==> public final val Receiver.receiverClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'type' @ [62:9] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'isSubclassOf' @ [62:14] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'PROVIDER_CLASS_NAME' @ [62:40] ==> @NonNls public const final val PROVIDER_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'application' @ [63:13] ==> val application: Application defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest[LocalVariableDescriptor]

'providers' @ [63:25] ==> public final val Application.providers: (MutableList<(Provider..Provider?)>..List<(Provider..Provider?)>?)[MyPropertyDescriptor]

'find' @ [63:36] ==> @InlineOnly public inline fun <T> Iterable<(Provider..Provider?)>.find(predicate: ((Provider..Provider?)) -> Boolean): Provider? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.android.dom.manifest.Provider..org.jetbrains.android.dom.manifest.Provider?)

'it' @ [63:43] ==> value-parameter it: (Provider..Provider?) defined in org.jetbrains.kotlin.android.findComponentDeclarationInManifest.<anonymous>[ValueParameterDescriptorImpl]

'providerClass' @ [63:46] ==> public final val Provider.providerClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [63:60] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [63:67] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [63:84] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [63:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'providerClass' @ [63:106] ==> public final val Provider.providerClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'containingFile' @ [69:16] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getInstance' @ [70:25] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'file' @ [70:37] ==> val file: PsiFile defined in org.jetbrains.kotlin.android.getAndroidFacetForFile[LocalVariableDescriptor]

'getResourceReferenceType' @ [74:9] ==> internal fun JavaPropertyDescriptor.getResourceReferenceType(): AndroidPsiUtils.ResourceReferenceType defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'NONE' @ [74:39] ==> enum entry NONE defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'containingDeclaration' @ [78:27] ==> public final val JavaPropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getEnum' @ [79:25] ==> public open fun getEnum(p0: (String..String?)): (ResourceType..ResourceType?) defined in com.android.resources.ResourceType[JavaMethodDescriptor]

'containingClass' @ [79:33] ==> val containingClass: JavaClassDescriptor defined in org.jetbrains.kotlin.android.getAndroidResourceType[LocalVariableDescriptor]

'name' @ [79:49] ==> public final val JavaClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [79:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'containingDeclaration' @ [83:27] ==> public final val JavaPropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'NONE' @ [83:83] ==> enum entry NONE defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'containingClass' @ [84:18] ==> val containingClass: JavaClassDescriptor defined in org.jetbrains.kotlin.android.getResourceReferenceType[LocalVariableDescriptor]

'containingDeclaration' @ [84:34] ==> public final val JavaClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'NONE' @ [84:90] ==> enum entry NONE defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'R_CLASS' @ [86:9] ==> public const final val R_CLASS: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'rClass' @ [86:20] ==> val rClass: JavaClassDescriptor defined in org.jetbrains.kotlin.android.getResourceReferenceType[LocalVariableDescriptor]

'name' @ [86:27] ==> public final val JavaClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [86:32] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if ((rClass.containingDeclaration as? PackageFragmentDescriptor)?.fqName?.asString() == ANDROID_PKG) {
            FRAMEWORK
        }
        else {
            APP
        }' @ [87:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AndroidPsiUtils.ResourceReferenceType, elseBranch: AndroidPsiUtils.ResourceReferenceType): AndroidPsiUtils.ResourceReferenceType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResourceReferenceType

'==' @ [87:20] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'rClass' @ [87:21] ==> val rClass: JavaClassDescriptor defined in org.jetbrains.kotlin.android.getResourceReferenceType[LocalVariableDescriptor]

'containingDeclaration' @ [87:28] ==> public final val JavaClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fqName' @ [87:82] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [87:90] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'ANDROID_PKG' @ [87:104] ==> public const final val ANDROID_PKG: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'FRAMEWORK' @ [88:13] ==> enum entry FRAMEWORK defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'APP' @ [91:13] ==> enum entry APP defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'NONE' @ [95:12] ==> enum entry NONE defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'getReferredResourceOrManifestField' @ [99:11] ==> internal fun getReferredResourceOrManifestField(facet: AndroidFacet, expression: KtSimpleNameExpression, className: String?, localOnly: Boolean): AndroidResourceUtil.MyReferredResourceFieldInfo? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'facet' @ [99:46] ==> value-parameter facet: AndroidFacet defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'expression' @ [99:53] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'localOnly' @ [99:71] ==> value-parameter localOnly: Boolean defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'expression' @ [103:24] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'getReferencedName' @ [103:35] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [104:29] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'getPreviousInQualifiedChain' @ [104:40] ==> private fun KtExpression.getPreviousInQualifiedChain(): KtExpression? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'resClassReference' @ [105:24] ==> val resClassReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'getReferencedName' @ [105:42] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'resClassName' @ [107:9] ==> val resClassName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'isEmpty' @ [107:22] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'className' @ [107:35] ==> value-parameter className: String? defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'className' @ [107:56] ==> value-parameter className: String? defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'resClassName' @ [107:69] ==> val resClassName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'resClassReference' @ [111:27] ==> val resClassReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'getPreviousInQualifiedChain' @ [111:45] ==> private fun KtExpression.getPreviousInQualifiedChain(): KtExpression? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'rClassReference' @ [112:28] ==> val rClassReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'analyze' @ [112:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [112:68] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'get' @ [113:37] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [113:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'rClassReference' @ [113:74] ==> val rClassReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'rClassDescriptor' @ [115:27] ==> val rClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'name' @ [115:44] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [115:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'==' @ [116:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'MANIFEST_CLASS_NAME' @ [116:37] ==> @NonNls public const final val MANIFEST_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'rClassShortName' @ [116:60] ==> val rClassShortName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'!' @ [118:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fromManifest' @ [118:10] ==> val fromManifest: Boolean defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'!=' @ [118:26] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'R_CLASS_NAME' @ [118:39] ==> @NonNls public const final val R_CLASS_NAME: String defined in org.jetbrains.android.util.AndroidUtils[JavaPropertyDescriptor]

'rClassShortName' @ [118:55] ==> val rClassShortName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'!' @ [122:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'localOnly' @ [122:10] ==> value-parameter localOnly: Boolean defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'rClassDescriptor' @ [123:21] ==> val rClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'fqNameSafe' @ [123:38] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [123:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'==' @ [125:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'CLASS_R' @ [125:26] ==> public const final val CLASS_R: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'qName' @ [125:37] ==> val qName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'==' @ [125:46] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'INTERNAL_R_CLASS_QNAME' @ [125:70] ==> public const final val INTERNAL_R_CLASS_QNAME: String defined in org.jetbrains.android.augment.AndroidPsiElementFinder[JavaPropertyDescriptor]

'qName' @ [125:96] ==> val qName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'MyReferredResourceFieldInfo' @ [126:40] ==> public constructor MyReferredResourceFieldInfo(@NotNull p0: String, @NotNull p1: String, @Nullable p2: Module?, p3: Boolean, p4: Boolean) defined in org.jetbrains.android.util.AndroidResourceUtil.MyReferredResourceFieldInfo[JavaClassConstructorDescriptor]

'resClassName' @ [126:68] ==> val resClassName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'resFieldName' @ [126:82] ==> val resFieldName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'facet' @ [126:96] ==> value-parameter facet: AndroidFacet defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'module' @ [126:102] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'?:' @ [130:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'rClassDescriptor' @ [130:27] ==> val rClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'source' @ [130:44] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'containingFile' @ [130:51] ==> public final val SourceElement.containingFile: SourceFile[MyPropertyDescriptor]

'psiFile' @ [130:86] ==> public final val psiFile: PsiFile defined in org.jetbrains.kotlin.resolve.source.PsiSourceFile[DeserializedPropertyDescriptor]

'if (fromManifest) !isManifestJavaFile(facet, containingFile) else !isRJavaFile(facet, containingFile)' @ [131:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'fromManifest' @ [131:13] ==> val fromManifest: Boolean defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'!' @ [131:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isManifestJavaFile' @ [131:28] ==> public open fun isManifestJavaFile(@NotNull p0: AndroidFacet, @NotNull p1: PsiFile): Boolean defined in org.jetbrains.android.util.AndroidResourceUtil[JavaMethodDescriptor]

'facet' @ [131:47] ==> value-parameter facet: AndroidFacet defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'containingFile' @ [131:54] ==> val containingFile: PsiFile defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'!' @ [131:75] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRJavaFile' @ [131:76] ==> public open fun isRJavaFile(@NotNull p0: AndroidFacet, @NotNull p1: PsiFile): Boolean defined in org.jetbrains.android.util.AndroidResourceUtil[JavaMethodDescriptor]

'facet' @ [131:88] ==> value-parameter facet: AndroidFacet defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'containingFile' @ [131:95] ==> val containingFile: PsiFile defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'MyReferredResourceFieldInfo' @ [135:32] ==> public constructor MyReferredResourceFieldInfo(@NotNull p0: String, @NotNull p1: String, @Nullable p2: Module?, p3: Boolean, p4: Boolean) defined in org.jetbrains.android.util.AndroidResourceUtil.MyReferredResourceFieldInfo[JavaClassConstructorDescriptor]

'resClassName' @ [135:60] ==> val resClassName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'resFieldName' @ [135:74] ==> val resFieldName: String defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[LocalVariableDescriptor]

'facet' @ [135:88] ==> value-parameter facet: AndroidFacet defined in org.jetbrains.kotlin.android.getReferredResourceOrManifestField[ValueParameterDescriptorImpl]

'module' @ [135:94] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'getQualifiedExpressionForSelector' @ [139:30] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [139:67] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'?:' @ [140:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression?

'receiverExpression' @ [140:13] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.android.getPreviousInQualifiedChain[LocalVariableDescriptor]

'selectorExpression' @ [140:60] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiverExpression' @ [140:82] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.android.getPreviousInQualifiedChain[LocalVariableDescriptor]

