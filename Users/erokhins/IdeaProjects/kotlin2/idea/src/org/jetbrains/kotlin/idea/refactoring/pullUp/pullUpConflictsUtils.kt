'MultiMap' @ [55:21] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'KotlinPullUpData' @ [57:22] ==> public constructor KotlinPullUpData(sourceClass: KtClassOrObject, targetClass: PsiNamedElement, membersToMove: Collection<KtNamedDeclaration>) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[ClassConstructorDescriptorImpl]

'sourceClass' @ [57:39] ==> value-parameter sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'targetClass' @ [58:39] ==> value-parameter targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'memberInfos' @ [59:39] ==> value-parameter memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'mapNotNull' @ [59:51] ==> public inline fun <T, R : Any> Iterable<KotlinMemberInfo>.mapNotNull(transform: (KotlinMemberInfo) -> KtNamedDeclaration?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R : Any> -> KtNamedDeclaration

'it' @ [59:64] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [59:67] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'with' @ [61:5] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinPullUpData, block: KotlinPullUpData.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPullUpData
    <R> -> Unit

'pullUpData' @ [61:10] ==> val pullUpData: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'memberInfos' @ [62:28] ==> value-parameter memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'memberInfo' @ [63:26] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'member' @ [63:37] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'member' @ [64:36] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptorWrapperAware' @ [64:43] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [64:75] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'checkClashWithSuperDeclaration' @ [66:13] ==> private fun KotlinPullUpData.checkClashWithSuperDeclaration(member: KtNamedDeclaration, memberDescriptor: DeclarationDescriptor, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [66:44] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [66:52] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [66:70] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'checkAccidentalOverrides' @ [67:13] ==> private fun KotlinPullUpData.checkAccidentalOverrides(member: KtNamedDeclaration, memberDescriptor: DeclarationDescriptor, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [67:38] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [67:46] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [67:64] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'checkInnerClassToInterface' @ [68:13] ==> private fun KotlinPullUpData.checkInnerClassToInterface(member: KtNamedDeclaration, memberDescriptor: DeclarationDescriptor, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [68:40] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [68:48] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [68:66] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'checkVisibility' @ [69:13] ==> private fun KotlinPullUpData.checkVisibility(memberInfo: KotlinMemberInfo, memberDescriptor: DeclarationDescriptor, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'memberInfo' @ [69:29] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [69:41] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [69:59] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'isInterfaceTarget' @ [70:17] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'checkPrivateMembersWithUsages' @ [71:17] ==> internal fun checkPrivateMembersWithUsages(member: KtNamedDeclaration, memberDescriptor: DeclarationDescriptor, sourceClass: KtClassOrObject, membersToMove: Collection<KtNamedDeclaration>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [71:47] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [71:55] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts.<anonymous>[LocalVariableDescriptor]

'sourceClass' @ [71:73] ==> value-parameter sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'pullUpData' @ [71:86] ==> val pullUpData: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'membersToMove' @ [71:97] ==> public final val membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'conflicts' @ [71:112] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'project' @ [76:5] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'checkConflictsInteractively' @ [76:13] ==> public fun Project.checkConflictsInteractively(conflicts: MultiMap<PsiElement, String>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'conflicts' @ [76:41] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[LocalVariableDescriptor]

'onShowConflicts' @ [76:52] ==> value-parameter onShowConflicts: () -> Unit = ... defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'onAccept' @ [76:69] ==> value-parameter onAccept: () -> Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkConflicts[ValueParameterDescriptorImpl]

'!' @ [84:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'search' @ [85:14] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope, p2: Boolean): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'member' @ [85:21] ==> value-parameter member: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.willBeUsedInSourceClass[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [85:29] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'sourceClass' @ [85:46] ==> value-parameter sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.willBeUsedInSourceClass[ValueParameterDescriptorImpl]

'all' @ [86:14] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.all(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [86:20] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.willBeUsedInSourceClass.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [86:23] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentsWithSelf' @ [86:31] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [86:47] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [86:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.willBeUsedInSourceClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'membersToMove' @ [86:59] ==> value-parameter membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.willBeUsedInSourceClass[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [89:33] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [89:56] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [89:89] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterNameRenderingPolicy' @ [90:5] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [90:65] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'modifiers' @ [91:5] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [91:17] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'startFromName' @ [92:5] ==> public abstract var startFromName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'when (this) {
        is ClassDescriptor -> "${DescriptorRenderer.getClassifierKindPrefix(this)} ${IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(this)}"
        is FunctionDescriptor -> "function '${CALLABLE_RENDERER.render(this)}'"
        is PropertyDescriptor -> "property '${CALLABLE_RENDERER.render(this)}'"
        else -> ""
    }' @ [96:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [96:18] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.renderForConflicts[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [97:34] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'getClassifierKindPrefix' @ [97:53] ==> public final fun getClassifierKindPrefix(classifier: ClassifierDescriptorWithTypeParameters): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [97:77] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.renderForConflicts[ReceiverParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [97:86] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [97:109] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [97:121] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [97:142] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.renderForConflicts[ReceiverParameterDescriptorImpl]

'CALLABLE_RENDERER' @ [98:47] ==> private val CALLABLE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[PropertyDescriptorImpl]

'render' @ [98:65] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [98:72] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.renderForConflicts[ReceiverParameterDescriptorImpl]

'CALLABLE_RENDERER' @ [99:47] ==> private val CALLABLE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[PropertyDescriptorImpl]

'render' @ [99:65] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [99:72] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.renderForConflicts[ReceiverParameterDescriptorImpl]

'memberDescriptor' @ [105:25] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getClashingMemberInTargetClass[ValueParameterDescriptorImpl]

'substitute' @ [105:42] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedSimpleFunctionDescriptor]

'sourceToTargetClassSubstitutor' @ [105:53] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'targetClassDescriptor' @ [106:12] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'findCallableMemberBySignature' @ [106:34] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'memberInSuper' @ [106:64] ==> val memberInSuper: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.getClashingMemberInTargetClass[LocalVariableDescriptor]

'targetClassDescriptor' @ [114:22] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'renderForConflicts' @ [114:44] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [114:85] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'renderForConflicts' @ [114:102] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [116:9] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'?:' @ [117:14] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<KtParameter>?, right: List<KtParameter>): List<KtParameter>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<KtParameter>

'targetClass' @ [117:15] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'primaryConstructorParameters' @ [117:41] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'emptyList' @ [117:73] ==> public fun <T> emptyList(): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'any' @ [117:86] ==> public inline fun <T> Iterable<KtParameter>.any(predicate: (KtParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'it' @ [117:92] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [117:95] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'member' @ [117:103] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'name' @ [117:110] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'conflicts' @ [118:13] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'putValue' @ [118:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'member' @ [118:32] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'message' @ [118:40] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[LocalVariableDescriptor]

'capitalize' @ [118:48] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [123:9] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'getClashingMemberInTargetClass' @ [125:25] ==> internal fun KotlinPullUpData.getClashingMemberInTargetClass(memberDescriptor: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [125:56] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'clashingSuper' @ [126:9] ==> val clashingSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[LocalVariableDescriptor]

'modality' @ [126:23] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [126:35] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [126:44] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'clashingSuper' @ [127:9] ==> val clashingSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[LocalVariableDescriptor]

'kind' @ [127:23] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [127:61] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'conflicts' @ [128:5] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'putValue' @ [128:15] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'member' @ [128:24] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[ValueParameterDescriptorImpl]

'message' @ [128:32] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkClashWithSuperDeclaration[LocalVariableDescriptor]

'capitalize' @ [128:40] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'unwrapped' @ [132:19] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'element' @ [133:9] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'element' @ [133:43] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'isCompanion' @ [133:51] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'element' @ [133:66] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'element' @ [133:76] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'containingClassOrObject' @ [133:84] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [135:12] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'data' @ [135:23] ==> value-parameter data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[ValueParameterDescriptorImpl]

'sourceClass' @ [135:28] ==> public final val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'element' @ [135:43] ==> var element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[LocalVariableDescriptor]

'data' @ [135:54] ==> value-parameter data: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.isSourceOrTarget[ValueParameterDescriptorImpl]

'targetClass' @ [135:59] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'memberDescriptor' @ [142:9] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ValueParameterDescriptorImpl]

'!' @ [142:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [142:52] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ValueParameterDescriptorImpl]

'hasModifier' @ [142:59] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [142:80] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'memberDescriptor' @ [143:45] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ValueParameterDescriptorImpl]

'substitute' @ [143:62] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'sourceToTargetClassSubstitutor' @ [143:73] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'memberDescriptorInTargetClass' @ [144:13] ==> val memberDescriptorInTargetClass: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[LocalVariableDescriptor]

'HierarchySearchRequest' @ [145:13] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'targetClass' @ [145:48] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'targetClass' @ [145:61] ==> public final val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'useScope' @ [145:73] ==> public final val PsiNamedElement.useScope: SearchScope[MyPropertyDescriptor]

'searchInheritors' @ [146:22] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [147:22] ==> public fun <T> Iterable<(PsiClass..PsiClass?)>.asSequence(): Sequence<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'filterNot' @ [148:22] ==> public fun <T> Sequence<(PsiClass..PsiClass?)>.filterNot(predicate: ((PsiClass..PsiClass?)) -> Boolean): Sequence<(PsiClass..PsiClass?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [148:34] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[ValueParameterDescriptorImpl]

'isSourceOrTarget' @ [148:37] ==> private fun PsiClass.isSourceOrTarget(data: KotlinPullUpData): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [148:54] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ReceiverParameterDescriptorImpl]

'mapNotNull' @ [149:22] ==> public fun <T, R : Any> Sequence<(PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> KtClassOrObject?): Sequence<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> KtClassOrObject

'it' @ [149:35] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [149:38] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'forEach' @ [150:22] ==> public inline fun <T> Sequence<KtClassOrObject>.forEach(action: (KtClassOrObject) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'it' @ [151:50] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorWrapperAware' @ [151:53] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [151:85] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'getTypeSubstitutor' @ [152:43] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'targetClassDescriptor' @ [152:62] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'defaultType' @ [152:84] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'subClassDescriptor' @ [153:62] ==> val subClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [153:81] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'EMPTY' @ [153:113] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'memberDescriptorInTargetClass' @ [155:33] ==> val memberDescriptorInTargetClass: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[LocalVariableDescriptor]

'substitute' @ [155:63] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [155:74] ==> val substitutor: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'memberDescriptorInSubClass' @ [157:33] ==> val memberDescriptorInSubClass: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'let' @ [157:61] ==> @InlineOnly public inline fun <T, R> CallableMemberDescriptor.let(block: (CallableMemberDescriptor) -> CallableMemberDescriptor?): CallableMemberDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> CallableMemberDescriptor?

'subClassDescriptor' @ [157:67] ==> val subClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'findCallableMemberBySignature' @ [157:86] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'it' @ [157:116] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'clashingMemberDescriptor' @ [158:46] ==> val clashingMemberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'source' @ [158:71] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [158:78] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [160:39] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ValueParameterDescriptorImpl]

'renderForConflicts' @ [160:56] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [162:39] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorWrapperAware' @ [162:42] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [162:74] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'renderForConflicts' @ [162:92] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [163:25] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides[ValueParameterDescriptorImpl]

'putValue' @ [163:35] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'clashingMember' @ [163:44] ==> val clashingMember: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'message' @ [163:60] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkAccidentalOverrides.<anonymous>[LocalVariableDescriptor]

'capitalize' @ [163:68] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isInterfaceTarget' @ [173:9] ==> public final val isInterfaceTarget: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'memberDescriptor' @ [173:30] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[ValueParameterDescriptorImpl]

'memberDescriptor' @ [173:69] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[ValueParameterDescriptorImpl]

'isInner' @ [173:86] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'memberDescriptor' @ [174:26] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[ValueParameterDescriptorImpl]

'renderForConflicts' @ [174:43] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [175:9] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[ValueParameterDescriptorImpl]

'putValue' @ [175:19] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'member' @ [175:28] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[ValueParameterDescriptorImpl]

'message' @ [175:36] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkInnerClassToInterface[LocalVariableDescriptor]

'capitalize' @ [175:44] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [185:13] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[ValueParameterDescriptorImpl]

'memberDescriptors' @ [185:33] ==> public final val memberDescriptors: Map<KtNamedDeclaration, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'values' @ [185:51] ==> public abstract val values: Collection<DeclarationDescriptor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'?:' @ [186:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'targetDescriptor' @ [186:23] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[ValueParameterDescriptorImpl]

'source' @ [186:78] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [186:86] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [187:13] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[ValueParameterDescriptorImpl]

'!' @ [188:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisibleIgnoringReceiver' @ [188:30] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'targetDescriptor' @ [188:56] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[ValueParameterDescriptorImpl]

'targetClassDescriptor' @ [188:74] ==> public final val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'message' @ [189:45] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'memberDescriptor' @ [191:21] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'renderForConflicts' @ [191:38] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [192:21] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[ValueParameterDescriptorImpl]

'renderForConflicts' @ [192:38] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [194:13] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'putValue' @ [194:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'target' @ [194:32] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[LocalVariableDescriptor]

'message' @ [194:40] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.reportConflictIfAny[LocalVariableDescriptor]

'capitalize' @ [194:48] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'memberInfo' @ [198:18] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'member' @ [198:29] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'memberInfo' @ [199:27] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'getChildrenToAnalyze' @ [199:38] ==> public fun KotlinMemberInfo.getChildrenToAnalyze(): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo[SimpleFunctionDescriptorImpl]

'memberInfo' @ [200:9] ==> value-parameter memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'isToAbstract' @ [200:20] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'member' @ [200:36] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[LocalVariableDescriptor]

'member' @ [201:13] ==> val member: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[LocalVariableDescriptor]

'typeReference' @ [201:20] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'memberDescriptor' @ [202:14] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[ValueParameterDescriptorImpl]

'returnType' @ [202:54] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [202:66] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'sourceToTargetClassSubstitutor' @ [203:41] ==> public final val sourceToTargetClassSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'substitute' @ [203:72] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'returnType' @ [203:83] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [203:104] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'typeInTargetClass' @ [204:41] ==> val typeInTargetClass: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>[LocalVariableDescriptor]

'constructor' @ [204:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [204:73] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptorToCheck' @ [205:21] ==> val descriptorToCheck: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>[LocalVariableDescriptor]

'reportConflictIfAny' @ [206:21] ==> local final fun reportConflictIfAny(targetDescriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[SimpleFunctionDescriptorImpl]

'descriptorToCheck' @ [206:41] ==> val descriptorToCheck: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>[LocalVariableDescriptor]

'childrenToCheck' @ [212:5] ==> val childrenToCheck: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility[LocalVariableDescriptor]

'forEach' @ [212:21] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [213:9] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [213:12] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [214:26] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [216:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReferenceExpression' @ [216:31] ==> public open fun visitReferenceExpression(@NotNull p0: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [216:56] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'resolutionFacade' @ [218:39] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[PropertyDescriptorImpl]

'analyze' @ [218:56] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [218:64] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'expression' @ [219:25] ==> value-parameter expression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>.visitReferenceExpression[ValueParameterDescriptorImpl]

'references' @ [219:36] ==> public final val KtReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'flatMap' @ [220:34] ==> public inline fun <T, R> Array<out (PsiReference..PsiReference?)>.flatMap(transform: ((PsiReference..PsiReference?)) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> DeclarationDescriptor

'?:' @ [220:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<DeclarationDescriptor>?, right: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<DeclarationDescriptor>

'it' @ [220:45] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>.visitReferenceExpression.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [220:66] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'context' @ [220:87] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkVisibility.<anonymous>.<no name provided>.visitReferenceExpression[LocalVariableDescriptor]

'emptyList' @ [220:99] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'forEach' @ [221:34] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'member' @ [236:9] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'hasModifier' @ [236:16] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [236:37] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'willBeUsedInSourceClass' @ [237:9] ==> internal fun willBeUsedInSourceClass(member: PsiElement, sourceClass: KtClassOrObject, membersToMove: Collection<KtNamedDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.pullUp[SimpleFunctionDescriptorImpl]

'member' @ [237:33] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'sourceClass' @ [237:41] ==> value-parameter sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'membersToMove' @ [237:54] ==> value-parameter membersToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'memberDescriptor' @ [238:26] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'renderForConflicts' @ [238:43] ==> public fun DeclarationDescriptor.renderForConflicts(): String defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [239:9] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'putValue' @ [239:19] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'member' @ [239:28] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[ValueParameterDescriptorImpl]

'message' @ [239:36] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.checkPrivateMembersWithUsages[LocalVariableDescriptor]

'capitalize' @ [239:44] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

