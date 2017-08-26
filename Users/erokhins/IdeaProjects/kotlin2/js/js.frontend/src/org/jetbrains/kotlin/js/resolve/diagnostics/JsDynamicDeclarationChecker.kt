'if (declaration is KtProperty && descriptor is VariableDescriptorWithAccessors) {
            declaration.delegateExpression?.let { delegateExpression ->
                val provideDelegateCall = bindingContext[BindingContext.PROVIDE_DELEGATE_RESOLVED_CALL, descriptor]
                if (provideDelegateCall != null && provideDelegateCall.resultingDescriptor.returnType?.isDynamic() == true ||
                    bindingContext.getType(delegateExpression)?.isDynamic() == true
                ) {
                    diagnosticHolder.report(ErrorsJs.PROPERTY_DELEGATION_BY_DYNAMIC.on(delegateExpression))
                }
            }
        }
        else if (declaration is KtClassOrObject) {
            for (delegateDecl in declaration.superTypeListEntries.filterIsInstance<KtDelegatedSuperTypeEntry>()) {
                val delegateExpr = delegateDecl.delegateExpression ?: continue
                if (bindingContext.getType(delegateExpr)?.isDynamic() == true) {
                    diagnosticHolder.report(ErrorsJs.DELEGATION_BY_DYNAMIC.on(delegateExpr))
                }
            }
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'declaration' @ [35:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [35:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [36:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'delegateExpression' @ [36:25] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [36:45] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'bindingContext' @ [37:43] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'PROVIDE_DELEGATE_RESOLVED_CALL' @ [37:73] ==> public final val PROVIDE_DELEGATE_RESOLVED_CALL: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [37:105] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'provideDelegateCall' @ [38:21] ==> val provideDelegateCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check.<anonymous>[LocalVariableDescriptor]

'provideDelegateCall' @ [38:52] ==> val provideDelegateCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [38:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'returnType' @ [38:92] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isDynamic' @ [38:104] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [39:21] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'getType' @ [39:36] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'delegateExpression' @ [39:44] ==> value-parameter delegateExpression: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'isDynamic' @ [39:65] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'diagnosticHolder' @ [41:21] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'report' @ [41:38] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'PROPERTY_DELEGATION_BY_DYNAMIC' @ [41:54] ==> public final val PROPERTY_DELEGATION_BY_DYNAMIC: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [41:85] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegateExpression' @ [41:88] ==> value-parameter delegateExpression: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [45:18] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [46:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [46:46] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'filterIsInstance' @ [46:67] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtDelegatedSuperTypeEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDelegatedSuperTypeEntry

'delegateDecl' @ [47:36] ==> val delegateDecl: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[LocalVariableDescriptor]

'delegateExpression' @ [47:49] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'bindingContext' @ [48:21] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'getType' @ [48:36] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'delegateExpr' @ [48:44] ==> val delegateExpr: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[LocalVariableDescriptor]

'isDynamic' @ [48:59] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'diagnosticHolder' @ [49:21] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[ValueParameterDescriptorImpl]

'report' @ [49:38] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'DELEGATION_BY_DYNAMIC' @ [49:54] ==> public final val DELEGATION_BY_DYNAMIC: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [49:76] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegateExpr' @ [49:79] ==> val delegateExpr: KtExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsDynamicDeclarationChecker.check[LocalVariableDescriptor]

