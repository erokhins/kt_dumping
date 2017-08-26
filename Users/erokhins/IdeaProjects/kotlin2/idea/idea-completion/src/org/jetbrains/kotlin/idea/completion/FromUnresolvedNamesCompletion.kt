'HashSet' @ [38:21] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'scope' @ [39:9] ==> value-parameter scope: KtElement defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [39:15] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtNameReferenceExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'checkCanceled' @ [40:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'KotlinPsiChecker' @ [42:17] ==> public companion object defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[FakeCallableDescriptorForObject]

'wasUnresolved' @ [42:34] ==> public final fun wasUnresolved(element: KtNameReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [42:48] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'CallTypeAndReceiver' @ [43:43] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [43:63] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [43:70] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [44:21] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'receiver' @ [44:41] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'sampleDescriptor' @ [45:21] ==> value-parameter sampleDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'!' @ [46:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [46:26] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'callType' @ [46:46] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'descriptorKindFilter' @ [46:55] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[DeserializedPropertyDescriptor]

'accepts' @ [46:76] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'sampleDescriptor' @ [46:84] ==> value-parameter sampleDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [48:25] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'refExpr' @ [49:38] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [49:46] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (sampleDescriptor) {
                            is FunctionDescriptor -> isCall // cannot use simply function name without arguments
                            is VariableDescriptor -> true // variable can as well be used with arguments when it has invoke()
                            is ClassDescriptor -> if (isCall) sampleDescriptor.kind == ClassKind.CLASS else sampleDescriptor.kind.isSingleton
                            else -> false // what else it can be?
                        }' @ [50:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'sampleDescriptor' @ [50:48] ==> value-parameter sampleDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'isCall' @ [51:54] ==> val isCall: Boolean defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'if (isCall) sampleDescriptor.kind == ClassKind.CLASS else sampleDescriptor.kind.isSingleton' @ [53:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isCall' @ [53:55] ==> val isCall: Boolean defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'sampleDescriptor' @ [53:63] ==> value-parameter sampleDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'kind' @ [53:80] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [53:98] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'sampleDescriptor' @ [53:109] ==> value-parameter sampleDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'kind' @ [53:126] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [53:131] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'!' @ [56:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeUsage' @ [56:30] ==> val canBeUsage: Boolean defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'refExpr' @ [60:28] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [60:36] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'!' @ [61:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefixMatcher' @ [61:22] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion[PropertyDescriptorImpl]

'prefixMatches' @ [61:36] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'name' @ [61:50] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'afterOffset' @ [63:21] ==> value-parameter afterOffset: Int? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'refExpr' @ [63:44] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [63:52] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'afterOffset' @ [63:66] ==> value-parameter afterOffset: Int? defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[ValueParameterDescriptorImpl]

'refExpr' @ [65:21] ==> value-parameter refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'resolveMainReferenceToDescriptors' @ [65:29] ==> public fun KtElement.resolveMainReferenceToDescriptors(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [65:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'names' @ [66:21] ==> val names: HashSet<String> defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[LocalVariableDescriptor]

'add' @ [66:27] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [66:31] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions.<anonymous>[LocalVariableDescriptor]

'names' @ [71:22] ==> val names: HashSet<String> defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[LocalVariableDescriptor]

'sorted' @ [71:28] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'create' @ [72:54] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'name' @ [72:61] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[LocalVariableDescriptor]

'suppressAutoInsertion' @ [73:22] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'assignPriority' @ [74:22] ==> public fun LookupElement.assignPriority(priority: ItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'FROM_UNRESOLVED_NAME_SUGGESTION' @ [74:50] ==> enum entry FROM_UNRESOLVED_NAME_SUGGESTION defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'lookupElement' @ [75:13] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[LocalVariableDescriptor]

'putUserData' @ [75:27] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KotlinCompletionCharFilter' @ [75:39] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter[FakeCallableDescriptorForObject]

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [75:66] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [75:110] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'collector' @ [76:13] ==> private final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion[PropertyDescriptorImpl]

'addElement' @ [76:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [76:34] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion.addNameSuggestions[LocalVariableDescriptor]

