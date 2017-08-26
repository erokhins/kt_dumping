'memberDescriptor' @ [40:34] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'substitute' @ [40:51] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [40:62] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'let' @ [40:76] ==> @InlineOnly public inline fun <T, R> CallableDescriptor.let(block: (CallableDescriptor) -> CallableMemberDescriptor?): CallableMemberDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CallableMemberDescriptor?

'targetClassDescriptor' @ [41:9] ==> value-parameter targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'findCallableMemberBySignature' @ [41:31] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'it' @ [41:61] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass.<anonymous>[ValueParameterDescriptorImpl]

'targetMemberDescriptor' @ [43:24] ==> val targetMemberDescriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[LocalVariableDescriptor]

'source' @ [43:48] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [43:56] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'targetMember' @ [44:12] ==> val targetMember: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[LocalVariableDescriptor]

'apply' @ [44:26] ==> @InlineOnly public inline fun <T> KtCallableDeclaration.apply(block: KtCallableDeclaration.() -> Unit): KtCallableDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'if (memberDescriptor.modality != Modality.ABSTRACT && makeAbstract) {
            addModifier(KtTokens.OVERRIDE_KEYWORD)
        }
        else if (memberDescriptor.overriddenDescriptors.isEmpty()) {
            removeModifier(KtTokens.OVERRIDE_KEYWORD)
        }
        else {
            addModifier(KtTokens.OVERRIDE_KEYWORD)
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'memberDescriptor' @ [45:13] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'modality' @ [45:30] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [45:51] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'makeAbstract' @ [45:63] ==> value-parameter makeAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'addModifier' @ [46:13] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [46:34] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (memberDescriptor.overriddenDescriptors.isEmpty()) {
            removeModifier(KtTokens.OVERRIDE_KEYWORD)
        }
        else {
            addModifier(KtTokens.OVERRIDE_KEYWORD)
        }' @ [48:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'memberDescriptor' @ [48:18] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [48:35] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [48:57] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'removeModifier' @ [49:13] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [49:37] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addModifier' @ [52:13] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [52:34] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addMemberToTarget' @ [54:10] ==> public fun addMemberToTarget(targetMember: KtNamedDeclaration, targetClass: KtClassOrObject): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [54:28] ==> value-parameter member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'targetClass' @ [54:36] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'apply' @ [54:49] ==> @InlineOnly public inline fun <T> KtNamedDeclaration.apply(block: KtNamedDeclaration.() -> Unit): KtNamedDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'memberDescriptor' @ [55:37] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'containingDeclaration' @ [55:54] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'sourceClassDescriptor' @ [56:13] ==> val sourceClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass.<anonymous>[LocalVariableDescriptor]

'kind' @ [56:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [56:54] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'targetClassDescriptor' @ [57:17] ==> value-parameter targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'kind' @ [57:39] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [57:57] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'memberDescriptor' @ [57:70] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'modality' @ [57:87] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [57:108] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'addModifier' @ [58:17] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [58:38] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'memberDescriptor' @ [61:13] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'modality' @ [61:30] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [61:51] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'makeAbstract' @ [61:63] ==> value-parameter makeAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass[ValueParameterDescriptorImpl]

'VISIBILITY_MODIFIERS' @ [62:22] ==> public final val VISIBILITY_MODIFIERS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'types' @ [62:43] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'forEach' @ [62:49] ==> public inline fun <T> Array<out (IElementType..IElementType?)>.forEach(action: ((IElementType..IElementType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'removeModifier' @ [62:59] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'it' @ [62:74] ==> value-parameter it: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.refactoring.pushDown.moveCallableMemberToClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addModifier' @ [63:13] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [63:34] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

