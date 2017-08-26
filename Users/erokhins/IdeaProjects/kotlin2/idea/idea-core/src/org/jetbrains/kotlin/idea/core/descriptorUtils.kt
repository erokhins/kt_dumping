'isVisible' @ [42:12] ==> private fun DeclarationDescriptorWithVisibility.isVisible(from: DeclarationDescriptor, receiverExpression: KtExpression?, bindingContext: BindingContext? = ..., resolutionScope: LexicalScope? = ...): Boolean defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'from' @ [42:22] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'context' @ [51:27] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'getResolutionScope' @ [51:35] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [51:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'resolutionFacade' @ [51:70] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'resolutionScope' @ [52:16] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.core.isVisible[LocalVariableDescriptor]

'ownerDescriptor' @ [52:32] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'isVisible' @ [53:12] ==> private fun DeclarationDescriptorWithVisibility.isVisible(from: DeclarationDescriptor, receiverExpression: KtExpression?, bindingContext: BindingContext? = ..., resolutionScope: LexicalScope? = ...): Boolean defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'from' @ [53:22] ==> val from: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible[LocalVariableDescriptor]

'receiverExpression' @ [53:28] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'bindingContext' @ [53:48] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'resolutionScope' @ [53:64] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.core.isVisible[LocalVariableDescriptor]

'isVisibleWithAnyReceiver' @ [62:22] ==> public open fun isVisibleWithAnyReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'this' @ [62:47] ==> <this> defined in org.jetbrains.kotlin.idea.core.isVisible[ReceiverParameterDescriptorImpl]

'from' @ [62:53] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'bindingContext' @ [64:9] ==> value-parameter bindingContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'resolutionScope' @ [64:35] ==> value-parameter resolutionScope: LexicalScope? = ... defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'if (receiverExpression != null && !isExtension) {
        val receiverType = bindingContext.getType(receiverExpression) ?: return false
        val explicitReceiver = ExpressionReceiver.create(receiverExpression, receiverType, bindingContext)
        return Visibilities.isVisible(explicitReceiver, this, from)
    }
    else {
        return resolutionScope.getImplicitReceiversHierarchy().any {
            Visibilities.isVisible(it.value, this, from)
        }
    }' @ [67:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'receiverExpression' @ [67:9] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'!' @ [67:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtension' @ [67:40] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'bindingContext' @ [68:28] ==> value-parameter bindingContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'getType' @ [68:43] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'receiverExpression' @ [68:51] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'ExpressionReceiver' @ [69:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [69:51] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [69:58] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'receiverType' @ [69:78] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.core.isVisible[LocalVariableDescriptor]

'bindingContext' @ [69:92] ==> value-parameter bindingContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'isVisible' @ [70:29] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'explicitReceiver' @ [70:39] ==> val explicitReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.idea.core.isVisible[LocalVariableDescriptor]

'this' @ [70:57] ==> <this> defined in org.jetbrains.kotlin.idea.core.isVisible[ReceiverParameterDescriptorImpl]

'from' @ [70:63] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'resolutionScope' @ [73:16] ==> value-parameter resolutionScope: LexicalScope? = ... defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'getImplicitReceiversHierarchy' @ [73:32] ==> public fun LexicalScope.getImplicitReceiversHierarchy(): List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'any' @ [73:64] ==> public inline fun <T> Iterable<ReceiverParameterDescriptor>.any(predicate: (ReceiverParameterDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor

'isVisible' @ [74:26] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'it' @ [74:36] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [74:39] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'this' @ [74:46] ==> <this> defined in org.jetbrains.kotlin.idea.core.isVisible[ReceiverParameterDescriptorImpl]

'from' @ [74:52] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.isVisible[ValueParameterDescriptorImpl]

'd1' @ [80:9] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'd2' @ [80:15] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'd1' @ [81:9] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'name' @ [81:12] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'd2' @ [81:20] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'name' @ [81:23] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [83:22] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [83:45] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [83:57] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'd1' @ [83:64] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [84:22] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [84:45] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [84:57] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'd2' @ [84:64] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'renderedD1' @ [85:9] ==> val renderedD1: String defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[LocalVariableDescriptor]

'renderedD2' @ [85:23] ==> val renderedD2: String defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [87:25] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [87:52] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [87:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'd1' @ [87:80] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [88:25] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [88:52] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [88:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'd2' @ [88:80] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[ValueParameterDescriptorImpl]

'declarations1' @ [89:9] ==> val declarations1: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[LocalVariableDescriptor]

'declarations2' @ [89:26] ==> val declarations2: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[LocalVariableDescriptor]

'declarations1' @ [89:43] ==> val declarations1: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.core.compareDescriptorsText[LocalVariableDescriptor]

'isNotEmpty' @ [89:57] ==> @InlineOnly public inline fun <T> Collection<PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'currentDescriptor' @ [95:9] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'originalDescriptor' @ [95:30] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [96:9] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'originalDescriptor' @ [96:38] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [98:9] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'name' @ [98:27] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'originalDescriptor' @ [98:35] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'name' @ [98:54] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'originalDescriptor' @ [100:9] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [100:66] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'compareDescriptors' @ [101:16] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [101:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [101:44] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'getMethod' @ [101:62] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'originalDescriptor' @ [101:73] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'getMethod' @ [101:92] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'compareDescriptorsText' @ [104:9] ==> private fun compareDescriptorsText(project: Project, d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [104:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [104:41] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'originalDescriptor' @ [104:60] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'originalDescriptor' @ [106:9] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'currentDescriptor' @ [106:53] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'originalDescriptor' @ [107:44] ==> value-parameter originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'findOriginalTopMostOverriddenDescriptors' @ [107:63] ==> public fun <D : CallableDescriptor> CallableDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<CallableDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'currentDescriptor' @ [108:43] ==> value-parameter currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'findOriginalTopMostOverriddenDescriptors' @ [108:61] ==> public fun <D : CallableDescriptor> CallableDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<CallableDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'overriddenOriginalDescriptor' @ [110:13] ==> val overriddenOriginalDescriptor: Set<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors[LocalVariableDescriptor]

'size' @ [110:42] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'overriddenCurrentDescriptor' @ [110:50] ==> val overriddenCurrentDescriptor: Set<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors[LocalVariableDescriptor]

'size' @ [110:78] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'overriddenCurrentDescriptor' @ [111:16] ==> val overriddenCurrentDescriptor: Set<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors[LocalVariableDescriptor]

'zip' @ [111:44] ==> public infix fun <T, R> Iterable<CallableDescriptor>.zip(other: Iterable<CallableDescriptor>): List<Pair<CallableDescriptor, CallableDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CallableDescriptor

'overriddenOriginalDescriptor' @ [111:48] ==> val overriddenOriginalDescriptor: Set<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors[LocalVariableDescriptor]

'all' @ [111:78] ==> public inline fun <T> Iterable<Pair<CallableDescriptor, CallableDescriptor>>.all(predicate: (Pair<CallableDescriptor, CallableDescriptor>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<CallableDescriptor, CallableDescriptor>

'compareDescriptorsText' @ [112:13] ==> private fun compareDescriptorsText(project: Project, d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [112:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.compareDescriptors[ValueParameterDescriptorImpl]

'it' @ [112:45] ==> value-parameter it: Pair<CallableDescriptor, CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [112:48] ==> public final val first: CallableDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [112:55] ==> value-parameter it: Pair<CallableDescriptor, CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.compareDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [112:58] ==> public final val second: CallableDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'normalize' @ [120:22] ==> public open fun normalize(): Visibility defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'when (normalized) {
        Visibilities.PUBLIC -> KtTokens.PUBLIC_KEYWORD
        Visibilities.PROTECTED -> KtTokens.PROTECTED_KEYWORD
        Visibilities.INTERNAL -> KtTokens.INTERNAL_KEYWORD
        else -> {
            if (Visibilities.isPrivate(normalized)) {
                KtTokens.PRIVATE_KEYWORD
            }
            else {
                error("Unexpected visibility '$normalized'")
            }
        }
    }' @ [121:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtModifierKeywordToken, entry1: KtModifierKeywordToken, entry2: KtModifierKeywordToken, entry3: KtModifierKeywordToken): KtModifierKeywordToken[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtModifierKeywordToken

'normalized' @ [121:18] ==> val normalized: Visibility defined in org.jetbrains.kotlin.idea.core.toKeywordToken[LocalVariableDescriptor]

'PUBLIC' @ [122:22] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [122:41] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED' @ [123:22] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [123:44] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL' @ [124:22] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [124:43] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (Visibilities.isPrivate(normalized)) {
                KtTokens.PRIVATE_KEYWORD
            }
            else {
                error("Unexpected visibility '$normalized'")
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (KtModifierKeywordToken..KtModifierKeywordToken?), elseBranch: (KtModifierKeywordToken..KtModifierKeywordToken?)): (KtModifierKeywordToken..KtModifierKeywordToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'isPrivate' @ [126:30] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'normalized' @ [126:40] ==> val normalized: Visibility defined in org.jetbrains.kotlin.idea.core.toKeywordToken[LocalVariableDescriptor]

'PRIVATE_KEYWORD' @ [127:26] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'error' @ [130:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'normalized' @ [130:48] ==> val normalized: Visibility defined in org.jetbrains.kotlin.idea.core.toKeywordToken[LocalVariableDescriptor]

'LinkedHashSet' @ [137:18] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> D

'overriddenDescriptors' @ [138:34] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'Suppress' @ [139:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (overriddenDescriptor.kind) {
            DECLARATION -> result.add(overriddenDescriptor as D)
            FAKE_OVERRIDE, DELEGATION -> result.addAll((overriddenDescriptor as D).getDirectlyOverriddenDeclarations())
            SYNTHESIZED -> {
                //do nothing
            }
            else -> throw AssertionError("Unexpected callable kind ${overriddenDescriptor.kind}: $overriddenDescriptor")
        }' @ [140:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'overriddenDescriptor' @ [140:15] ==> val overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'kind' @ [140:36] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [141:13] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'result' @ [141:28] ==> val result: LinkedHashSet<D> defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'add' @ [141:35] ==> public open fun add(element: D): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'overriddenDescriptor' @ [141:39] ==> val overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'FAKE_OVERRIDE' @ [142:13] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DELEGATION' @ [142:28] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'result' @ [142:42] ==> val result: LinkedHashSet<D> defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'addAll' @ [142:49] ==> public open fun addAll(elements: Collection<D>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'overriddenDescriptor' @ [142:57] ==> val overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'getDirectlyOverriddenDeclarations' @ [142:84] ==> public fun <D : CallableMemberDescriptor> D.getDirectlyOverriddenDeclarations(): Collection<D> defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'SYNTHESIZED' @ [143:13] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'AssertionError' @ [146:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'overriddenDescriptor' @ [146:70] ==> val overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'kind' @ [146:91] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'overriddenDescriptor' @ [146:99] ==> val overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'filterOutOverridden' @ [149:27] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> filterOutOverridden(@NotNull p0: (MutableSet<(D..D?)>..Set<(D..D?)>)): (MutableSet<(D..D?)>..Set<(D..D?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'result' @ [149:47] ==> val result: LinkedHashSet<D> defined in org.jetbrains.kotlin.idea.core.getDirectlyOverriddenDeclarations[LocalVariableDescriptor]

'getAllOverriddenDeclarations' @ [153:50] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> getAllOverriddenDeclarations(@NotNull p0: D): (MutableSet<(D..D?)>..Set<(D..D?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> D

'this' @ [153:79] ==> <this> defined in org.jetbrains.kotlin.idea.core.getDeepestSuperDeclarations[ReceiverParameterDescriptorImpl]

'overriddenDeclarations' @ [154:9] ==> val overriddenDeclarations: (MutableSet<(D..D?)>..Set<(D..D?)>) defined in org.jetbrains.kotlin.idea.core.getDeepestSuperDeclarations[LocalVariableDescriptor]

'isEmpty' @ [154:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'setOf' @ [155:16] ==> public fun <T> setOf(element: D): Set<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'this' @ [155:22] ==> <this> defined in org.jetbrains.kotlin.idea.core.getDeepestSuperDeclarations[ReceiverParameterDescriptorImpl]

'overriddenDeclarations' @ [158:12] ==> val overriddenDeclarations: (MutableSet<(D..D?)>..Set<(D..D?)>) defined in org.jetbrains.kotlin.idea.core.getDeepestSuperDeclarations[LocalVariableDescriptor]

'filterNot' @ [158:35] ==> public inline fun <T> Iterable<(D..D?)>.filterNot(predicate: ((D..D?)) -> Boolean): List<(D..D?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (D..D?)

'DescriptorUtils' @ [158:45] ==> private constructor DescriptorUtils() defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaClassConstructorDescriptor]

'isOverride' @ [158:62] ==> public open fun isOverride(@NotNull p0: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

