'resolvedCall' @ [31:22] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [31:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'!' @ [32:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callee' @ [32:14] ==> val callee: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'isDynamic' @ [32:21] ==> public fun DeclarationDescriptor.isDynamic(): Boolean defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'checkSpreadOperator' @ [33:20] ==> private final fun checkSpreadOperator(resolvedCall: ResolvedCall<*>, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [33:40] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [33:54] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [36:23] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'call' @ [36:36] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [36:41] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'when (element) {
            is KtArrayAccessExpression -> {
                if (element.indexExpressions.size > 1) {
                    context.trace.report(ErrorsJs.WRONG_OPERATION_WITH_DYNAMIC.on(reportOn, "indexed access with more than one index"))
                }
            }

            is KtWhenConditionInRange -> {
                reportInOperation(context, reportOn)
            }

            is KtBinaryExpression -> {
                val token = element.operationToken
                when (token) {
                    in OperatorConventions.IN_OPERATIONS -> {
                        reportInOperation(context, reportOn)
                    }
                    KtTokens.RANGE -> {
                        context.trace.report(ErrorsJs.WRONG_OPERATION_WITH_DYNAMIC.on(reportOn, "`..` operation"))
                    }
                }
            }

            is KtDestructuringDeclarationEntry -> {
                if (!reportedOn(context, element.node.treeParent.psi)) {
                    context.trace.report(ErrorsJs.WRONG_OPERATION_WITH_DYNAMIC.on(element.parent, "destructuring declaration"))
                }
            }
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [37:15] ==> val element: KtElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'element' @ [39:21] ==> val element: KtElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'indexExpressions' @ [39:29] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'size' @ [39:46] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'context' @ [40:21] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [40:29] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [40:35] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [40:51] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [40:80] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [40:83] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'reportInOperation' @ [45:17] ==> private final fun reportInOperation(context: CallCheckerContext, reportOn: PsiElement): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker[SimpleFunctionDescriptorImpl]

'context' @ [45:35] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'reportOn' @ [45:44] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'element' @ [49:29] ==> val element: KtElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'operationToken' @ [49:37] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'when (token) {
                    in OperatorConventions.IN_OPERATIONS -> {
                        reportInOperation(context, reportOn)
                    }
                    KtTokens.RANGE -> {
                        context.trace.report(ErrorsJs.WRONG_OPERATION_WITH_DYNAMIC.on(reportOn, "`..` operation"))
                    }
                }' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'token' @ [50:23] ==> val token: IElementType defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'in' @ [51:21] ==> public operator fun <@OnlyInputTypes T> Iterable<(IElementType..IElementType?)>.contains(element: (IElementType..IElementType?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'IN_OPERATIONS' @ [51:44] ==> public final val IN_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'reportInOperation' @ [52:25] ==> private final fun reportInOperation(context: CallCheckerContext, reportOn: PsiElement): Unit defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker[SimpleFunctionDescriptorImpl]

'context' @ [52:43] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'reportOn' @ [52:52] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'RANGE' @ [54:30] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'context' @ [55:25] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [55:33] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [55:39] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [55:55] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [55:84] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [55:87] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'!' @ [61:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reportedOn' @ [61:22] ==> private final fun reportedOn(context: CallCheckerContext, element: PsiElement): Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker[SimpleFunctionDescriptorImpl]

'context' @ [61:33] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'element' @ [61:42] ==> val element: KtElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'node' @ [61:50] ==> public final val KtDestructuringDeclarationEntry.node: ASTNode[MyPropertyDescriptor]

'treeParent' @ [61:55] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'psi' @ [61:66] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'context' @ [62:21] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [62:29] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [62:35] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [62:51] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [62:80] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [62:83] ==> val element: KtElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'parent' @ [62:91] ==> public final val KtDestructuringDeclarationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'resolvedCall' @ [67:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'call' @ [67:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'valueArguments' @ [67:44] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'argument' @ [68:13] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[LocalVariableDescriptor]

'getSpreadElement' @ [68:22] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'let' @ [68:42] ==> @InlineOnly public inline fun <T, R> LeafPsiElement.let(block: (LeafPsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LeafPsiElement
    <R> -> Unit

'context' @ [69:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [69:25] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [69:31] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SPREAD_OPERATOR_IN_DYNAMIC_CALL' @ [69:47] ==> public final val SPREAD_OPERATOR_IN_DYNAMIC_CALL: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [69:79] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [69:82] ==> value-parameter it: LeafPsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [75:21] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[ValueParameterDescriptorImpl]

'call' @ [75:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'valueArguments' @ [75:39] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'arg' @ [76:33] ==> val arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[LocalVariableDescriptor]

'getArgumentExpression' @ [76:37] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'context' @ [77:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[ValueParameterDescriptorImpl]

'trace' @ [77:25] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'bindingContext' @ [77:31] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'getType' @ [77:46] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'argExpression' @ [77:54] ==> val argExpression: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[LocalVariableDescriptor]

'isDynamic' @ [77:70] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'arg' @ [77:93] ==> val arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[LocalVariableDescriptor]

'getSpreadElement' @ [77:97] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'context' @ [78:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[ValueParameterDescriptorImpl]

'trace' @ [78:25] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [78:31] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [78:47] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [78:76] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'arg' @ [78:79] ==> val arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.checkSpreadOperator[LocalVariableDescriptor]

'asElement' @ [78:83] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'context' @ [84:9] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.reportInOperation[ValueParameterDescriptorImpl]

'trace' @ [84:17] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [84:23] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [84:39] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [84:68] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [84:71] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.reportInOperation[ValueParameterDescriptorImpl]

'context' @ [88:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.reportedOn[ValueParameterDescriptorImpl]

'trace' @ [88:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'bindingContext' @ [88:27] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'diagnostics' @ [88:42] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [88:54] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'element' @ [88:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.reportedOn[ValueParameterDescriptorImpl]

'any' @ [88:74] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [88:80] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicCallChecker.reportedOn.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [88:83] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'WRONG_OPERATION_WITH_DYNAMIC' @ [88:103] ==> public final val WRONG_OPERATION_WITH_DYNAMIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

