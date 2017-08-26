'AbstractRegisterComponentAction' @ [30:40] ==> public constructor AbstractRegisterComponentAction(text: String) defined in org.jetbrains.kotlin.android.intention.AbstractRegisterComponentAction[ClassConstructorDescriptorImpl]

'element' @ [32:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.isApplicableTo[ValueParameterDescriptorImpl]

'isSubclassOfBroadcastReceiver' @ [32:17] ==> private final fun KtClass.isSubclassOfBroadcastReceiver(): Boolean defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest[SimpleFunctionDescriptorImpl]

'!' @ [32:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [32:53] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.isApplicableTo[ValueParameterDescriptorImpl]

'isRegisteredBroadcastReceiver' @ [32:61] ==> private final fun KtClass.isRegisteredBroadcastReceiver(manifest: Manifest): Boolean defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest[SimpleFunctionDescriptorImpl]

'manifest' @ [32:91] ==> value-parameter manifest: Manifest defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.isApplicableTo[ValueParameterDescriptorImpl]

'runWriteAction' @ [34:66] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'element' @ [35:24] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.applyTo[ValueParameterDescriptorImpl]

'toLightClass' @ [35:32] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'manifest' @ [36:9] ==> value-parameter manifest: Manifest defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.applyTo[ValueParameterDescriptorImpl]

'application' @ [36:18] ==> public final val Manifest.application: (Application..Application?)[MyPropertyDescriptor]

'addReceiver' @ [36:30] ==> public abstract fun addReceiver(): (Receiver..Receiver?) defined in org.jetbrains.android.dom.manifest.Application[JavaMethodDescriptor]

'receiverClass' @ [36:44] ==> public final val Receiver.receiverClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [36:58] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'psiClass' @ [36:66] ==> val psiClass: KtLightClass defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.applyTo.<anonymous>[LocalVariableDescriptor]

'manifest' @ [39:77] ==> value-parameter manifest: Manifest defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.isRegisteredBroadcastReceiver[ValueParameterDescriptorImpl]

'application' @ [39:86] ==> public final val Manifest.application: (Application..Application?)[MyPropertyDescriptor]

'receivers' @ [39:98] ==> public final val Application.receivers: (MutableList<(Receiver..Receiver?)>..List<(Receiver..Receiver?)>?)[MyPropertyDescriptor]

'any' @ [39:108] ==> public inline fun <T> Iterable<(Receiver..Receiver?)>.any(predicate: ((Receiver..Receiver?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.android.dom.manifest.Receiver..org.jetbrains.android.dom.manifest.Receiver?)

'it' @ [40:9] ==> value-parameter it: (Receiver..Receiver?) defined in org.jetbrains.kotlin.android.intention.AddBroadcastReceiverToManifest.isRegisteredBroadcastReceiver.<anonymous>[ValueParameterDescriptorImpl]

'receiverClass' @ [40:12] ==> public final val Receiver.receiverClass: (AndroidAttributeValue<(PsiClass..PsiClass?)>..AndroidAttributeValue<(PsiClass..PsiClass?)>?)[MyPropertyDescriptor]

'value' @ [40:26] ==> public final var <T : (Any..Any?)> AndroidAttributeValue<(PsiClass..PsiClass?)>.value: PsiClass?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [40:33] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [40:50] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [40:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'?:' @ [44:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'descriptor' @ [44:14] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'defaultType' @ [44:47] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'isSubclassOf' @ [44:60] ==> internal fun KotlinType.isSubclassOf(className: String, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.android in file TypeUtil.kt[SimpleFunctionDescriptorImpl]

'CLASS_BROADCASTRECEIVER' @ [44:86] ==> public const final val CLASS_BROADCASTRECEIVER: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

