'JvmOverloads' @ [39:24] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'MemberInfoBase<KtNamedDeclaration>' @ [43:5] ==> public constructor MemberInfoBase<T : (PsiElement..PsiElement?)>(p0: (KtNamedDeclaration..KtNamedDeclaration?)) defined in com.intellij.refactoring.classMembers.MemberInfoBase[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'member' @ [43:40] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [45:32] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [45:55] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [45:88] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [46:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'setOf' @ [46:25] ==> public fun <T> setOf(element: DescriptorRendererModifier): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'DescriptorRendererModifier' @ [46:31] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'INNER' @ [46:58] ==> enum entry INNER defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'member' @ [51:32] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'resolveToDescriptorWrapperAware' @ [51:39] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'isStatic' @ [52:9] ==> protected/*protected and package*/ final var isStatic: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'member' @ [52:20] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'parent' @ [52:27] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if ((member is KtClass || member is KtPsiClassWrapper) && isSuperClass) {
            if (member.isInterfaceClass()) {
                displayName = RefactoringBundle.message("member.info.implements.0", member.name)
                overrides = false
            }
            else {
                displayName = RefactoringBundle.message("member.info.extends.0", member.name)
                overrides = true
            }
        }
        else {
            displayName = RENDERER.render(memberDescriptor)
            if (memberDescriptor is MemberDescriptor && memberDescriptor.modality == Modality.ABSTRACT) {
                displayName = "abstract $displayName"
            }
            if (isCompanionMember) {
                displayName = "companion $displayName"
            }

            val overriddenDescriptors = (memberDescriptor as? CallableMemberDescriptor)?.overriddenDescriptors ?: emptySet<CallableMemberDescriptor>()
            if (overriddenDescriptors.isNotEmpty()) {
                overrides = overriddenDescriptors.any { it.modality != Modality.ABSTRACT }
            }
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'member' @ [54:14] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'member' @ [54:35] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'isSuperClass' @ [54:67] ==> public final val isSuperClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[PropertyDescriptorImpl]

'if (member.isInterfaceClass()) {
                displayName = RefactoringBundle.message("member.info.implements.0", member.name)
                overrides = false
            }
            else {
                displayName = RefactoringBundle.message("member.info.extends.0", member.name)
                overrides = true
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'member' @ [55:17] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'isInterfaceClass' @ [55:24] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'displayName' @ [56:17] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'message' @ [56:49] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'member' @ [56:85] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [56:92] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'overrides' @ [57:17] ==> protected/*protected and package*/ final var overrides: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'displayName' @ [60:17] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'message' @ [60:49] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'member' @ [60:82] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [60:89] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'overrides' @ [61:17] ==> protected/*protected and package*/ final var overrides: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'displayName' @ [65:13] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'RENDERER' @ [65:27] ==> private final val RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.Companion[PropertyDescriptorImpl]

'render' @ [65:36] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [65:43] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'memberDescriptor' @ [66:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'memberDescriptor' @ [66:57] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'modality' @ [66:74] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [66:86] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [66:95] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'displayName' @ [67:17] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'displayName' @ [67:42] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'isCompanionMember' @ [69:17] ==> public final val isCompanionMember: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[PropertyDescriptorImpl]

'displayName' @ [70:17] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'displayName' @ [70:43] ==> protected/*protected and package*/ final var displayName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'?:' @ [73:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<CallableMemberDescriptor>?, right: Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<CallableMemberDescriptor>

'memberDescriptor' @ [73:42] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'overriddenDescriptors' @ [73:90] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'emptySet' @ [73:115] ==> public fun <T> emptySet(): Set<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'overriddenDescriptors' @ [74:17] ==> val overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [74:39] ==> @InlineOnly public inline fun <T> Collection<CallableMemberDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'overrides' @ [75:17] ==> protected/*protected and package*/ final var overrides: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[JavaPropertyDescriptor]

'overriddenDescriptors' @ [75:29] ==> val overriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>[LocalVariableDescriptor]

'any' @ [75:51] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.any(predicate: (CallableMemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [75:57] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [75:60] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [75:72] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [75:81] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'when (declaration) {
        is KtNamedFunction -> declaration.getRepresentativeLightMethod()
        is KtProperty, is KtParameter -> declaration.toLightElements().let {
            it.firstIsInstanceOrNull<PsiMethod>() ?: it.firstIsInstanceOrNull<PsiField>()
        } as PsiMember?
        is KtClassOrObject -> declaration.toLightClass()
        is KtPsiClassWrapper -> declaration.psiClass
        else -> null
    }' @ [82:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMember?, entry1: PsiMember?, entry2: PsiMember?, entry3: PsiMember?, entry4: PsiMember?): PsiMember?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMember?

'declaration' @ [82:18] ==> value-parameter declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo[ValueParameterDescriptorImpl]

'declaration' @ [83:31] ==> value-parameter declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo[ValueParameterDescriptorImpl]

'getRepresentativeLightMethod' @ [83:43] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'declaration' @ [84:42] ==> value-parameter declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo[ValueParameterDescriptorImpl]

'toLightElements' @ [84:54] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [84:72] ==> @InlineOnly public inline fun <T, R> List<PsiNamedElement>.let(block: (List<PsiNamedElement>) -> {PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner & PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>}?): {PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner & PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>}? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiNamedElement>
    <R> -> {PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner & PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>}?

'it' @ [85:13] ==> value-parameter it: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo.<anonymous>[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [85:16] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): PsiMethod? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PsiMethod

'it' @ [85:54] ==> value-parameter it: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo.<anonymous>[ValueParameterDescriptorImpl]

'firstIsInstanceOrNull' @ [85:57] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): PsiField? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PsiField

'declaration' @ [87:31] ==> value-parameter declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo[ValueParameterDescriptorImpl]

'toLightClass' @ [87:43] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'declaration' @ [88:33] ==> value-parameter declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.lightElementForMemberInfo[ValueParameterDescriptorImpl]

'psiClass' @ [88:45] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'member' @ [94:23] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<out KtNamedDeclaration>.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'lightElementForMemberInfo' @ [95:33] ==> public fun lightElementForMemberInfo(declaration: KtNamedDeclaration?): PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [95:59] ==> val declaration: (KtNamedDeclaration..KtNamedDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'MemberInfo' @ [96:16] ==> public constructor MemberInfo(p0: (PsiMember..PsiMember?), p1: Boolean, p2: (PsiReferenceList..PsiReferenceList?)) defined in com.intellij.refactoring.util.classMembers.MemberInfo[JavaClassConstructorDescriptor]

'psiMember' @ [96:27] ==> val psiMember: PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'psiMember' @ [96:53] ==> val psiMember: PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'overrides' @ [96:78] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<out KtNamedDeclaration>.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'info' @ [97:5] ==> val info: MemberInfo defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'isToAbstract' @ [97:10] ==> public final var MemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'isToAbstract' @ [97:25] ==> public final var <T : (PsiElement..PsiElement?)> MemberInfoBase<out KtNamedDeclaration>.isToAbstract: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'info' @ [98:5] ==> val info: MemberInfo defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'isChecked' @ [98:10] ==> public final var MemberInfo.isChecked: Boolean[MyPropertyDescriptor]

'isChecked' @ [98:22] ==> public final var <T : (PsiElement..PsiElement?)> MemberInfoBase<out KtNamedDeclaration>.isChecked: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'info' @ [99:12] ==> val info: MemberInfo defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toJavaMemberInfo[LocalVariableDescriptor]

'member' @ [103:23] ==> public final val MemberInfo.member: (PsiMember..PsiMember?)[MyPropertyDescriptor]

'unwrapped' @ [103:30] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'KotlinMemberInfo' @ [104:12] ==> @JvmOverloads public constructor KotlinMemberInfo(member: KtNamedDeclaration, isSuperClass: Boolean = ..., isCompanionMember: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[ClassConstructorDescriptorImpl]

'declaration' @ [104:29] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKotlinMemberInfo[LocalVariableDescriptor]

'declaration' @ [104:42] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKotlinMemberInfo[LocalVariableDescriptor]

'overrides' @ [104:68] ==> public final val MemberInfo.overrides: (Boolean..Boolean?)[MyPropertyDescriptor]

'apply' @ [104:87] ==> @InlineOnly public inline fun <T> KotlinMemberInfo.apply(block: KotlinMemberInfo.() -> Unit): KotlinMemberInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'this' @ [105:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKotlinMemberInfo.<anonymous>[ReceiverParameterDescriptorImpl]

'isToAbstract' @ [105:14] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'this@toKotlinMemberInfo' @ [105:29] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.toKotlinMemberInfo[ReceiverParameterDescriptorImpl]

'isToAbstract' @ [105:53] ==> public final var MemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

