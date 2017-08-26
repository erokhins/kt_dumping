'resolvedCall' @ [32:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [33:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [33:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'?:' @ [34:54] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [34:55] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[LocalVariableDescriptor]

'containingDeclaration' @ [34:94] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'descriptor' @ [34:119] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[LocalVariableDescriptor]

'!' @ [35:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'namedDescriptor' @ [35:14] ==> val namedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[LocalVariableDescriptor]

'name' @ [35:30] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [35:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'isUnderscoreOnlyName' @ [35:46] ==> private final fun String.isUnderscoreOnlyName(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'checkCallElement' @ [36:9] ==> private final fun checkCallElement(ktElement: KtElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [36:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[ValueParameterDescriptorImpl]

'call' @ [36:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [36:44] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'context' @ [36:57] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.check[ValueParameterDescriptorImpl]

'when (ktElement) {
            is KtSimpleNameExpression ->
                checkSimpleNameUsage(ktElement, context.trace)
            is KtCallExpression ->
                ktElement.calleeExpression?.let { checkCallElement(it, context) }
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'ktElement' @ [40:15] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement[ValueParameterDescriptorImpl]

'checkSimpleNameUsage' @ [42:17] ==> private final fun checkSimpleNameUsage(ktName: KtSimpleNameExpression, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'ktElement' @ [42:38] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement[ValueParameterDescriptorImpl]

'context' @ [42:49] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement[ValueParameterDescriptorImpl]

'trace' @ [42:57] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'ktElement' @ [44:17] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement[ValueParameterDescriptorImpl]

'calleeExpression' @ [44:27] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [44:45] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'checkCallElement' @ [44:51] ==> private final fun checkCallElement(ktElement: KtElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'it' @ [44:68] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [44:72] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkCallElement[ValueParameterDescriptorImpl]

'ktName' @ [49:13] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'text' @ [49:20] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'isUnderscoreOnlyName' @ [49:25] ==> private final fun String.isUnderscoreOnlyName(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'trace' @ [50:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'report' @ [50:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNDERSCORE_USAGE_WITHOUT_BACKTICKS' @ [50:33] ==> public final val UNDERSCORE_USAGE_WITHOUT_BACKTICKS: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [50:68] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'ktName' @ [50:71] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'descriptor' @ [55:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'name' @ [55:24] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [55:29] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'isUnderscoreOnlyName' @ [55:40] ==> private final fun String.isUnderscoreOnlyName(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'checkSimpleNameUsage' @ [56:13] ==> private final fun checkSimpleNameUsage(ktName: KtSimpleNameExpression, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker[SimpleFunctionDescriptorImpl]

'ktName' @ [56:34] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'trace' @ [56:42] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.checkSimpleNameUsage[ValueParameterDescriptorImpl]

'isNotEmpty' @ [61:13] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'all' @ [61:29] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [61:35] ==> value-parameter it: Char defined in org.jetbrains.kotlin.resolve.calls.checkers.UnderscoreUsageChecker.isUnderscoreOnlyName.<anonymous>[ValueParameterDescriptorImpl]

