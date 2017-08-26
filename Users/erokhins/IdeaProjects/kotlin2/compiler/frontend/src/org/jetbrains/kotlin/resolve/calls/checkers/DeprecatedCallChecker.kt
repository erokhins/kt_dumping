'check' @ [39:9] ==> private final fun check(targetDescriptor: CallableDescriptor, trace: BindingTrace, element: PsiElement, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [39:15] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [39:28] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'context' @ [39:49] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [39:57] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'reportOn' @ [39:64] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [39:74] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [39:82] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'targetDescriptor' @ [46:13] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [48:28] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'getDeprecations' @ [48:45] ==> public fun DeclarationDescriptor.getDeprecations(languageVersionSettings: LanguageVersionSettings): List<Deprecation> defined in org.jetbrains.kotlin.resolve in file deprecationUtil.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [48:61] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'toMutableList' @ [48:86] ==> public fun <T> Collection<Deprecation>.toMutableList(): MutableList<Deprecation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Deprecation

'targetDescriptor' @ [51:13] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'deprecations' @ [52:13] ==> val deprecations: MutableList<Deprecation> defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[LocalVariableDescriptor]

'targetDescriptor' @ [52:29] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'correspondingProperty' @ [52:46] ==> public final val PropertySetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'getDeprecations' @ [52:68] ==> public fun DeclarationDescriptor.getDeprecations(languageVersionSettings: LanguageVersionSettings): List<Deprecation> defined in org.jetbrains.kotlin.resolve in file deprecationUtil.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [52:84] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'if (deprecations.isNotEmpty()) {
            for (deprecation in deprecations) {
                trace.report(createDeprecationDiagnostic(element, deprecation, languageVersionSettings))
            }
        }
        else if (targetDescriptor is PropertyDescriptor && shouldCheckPropertyGetter(element)) {
            targetDescriptor.getter?.let { check(it, trace, element, languageVersionSettings) }
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'deprecations' @ [55:13] ==> val deprecations: MutableList<Deprecation> defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[LocalVariableDescriptor]

'isNotEmpty' @ [55:26] ==> @InlineOnly public inline fun <T> Collection<Deprecation>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Deprecation

'deprecations' @ [56:33] ==> val deprecations: MutableList<Deprecation> defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[LocalVariableDescriptor]

'trace' @ [57:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'report' @ [57:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'createDeprecationDiagnostic' @ [57:30] ==> internal fun createDeprecationDiagnostic(element: PsiElement, deprecation: Deprecation, languageVersionSettings: LanguageVersionSettings): Diagnostic defined in org.jetbrains.kotlin.resolve in file deprecationUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [57:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'deprecation' @ [57:67] ==> val deprecation: Deprecation defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[LocalVariableDescriptor]

'languageVersionSettings' @ [57:80] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [60:18] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'shouldCheckPropertyGetter' @ [60:60] ==> internal final fun shouldCheckPropertyGetter(expression: PsiElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[SimpleFunctionDescriptorImpl]

'element' @ [60:86] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [61:13] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'getter' @ [61:30] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [61:38] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> Unit

'check' @ [61:44] ==> private final fun check(targetDescriptor: CallableDescriptor, trace: BindingTrace, element: PsiElement, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[SimpleFunctionDescriptorImpl]

'it' @ [61:50] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [61:54] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'element' @ [61:61] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [61:70] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.check[ValueParameterDescriptorImpl]

'create' @ [65:52] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'ALL_ASSIGNMENTS' @ [65:69] ==> public final val ALL_ASSIGNMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'types' @ [65:85] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'PLUSPLUS' @ [65:101] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [65:120] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getParentOfType' @ [69:44] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtBinaryExpression..KtBinaryExpression?)>): KtBinaryExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtBinaryExpression

'expression' @ [69:80] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [69:92] ==> public constructor KtBinaryExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [69:118] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'binaryExpression' @ [70:13] ==> val binaryExpression: KtBinaryExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'binaryExpression' @ [71:24] ==> val binaryExpression: KtBinaryExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'left' @ [71:41] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'left' @ [72:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'expression' @ [72:25] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

'binaryExpression' @ [72:39] ==> val binaryExpression: KtBinaryExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'operationToken' @ [72:56] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'PROPERTY_SET_OPERATIONS' @ [72:74] ==> private final val PROPERTY_SET_OPERATIONS: TokenSet defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[PropertyDescriptorImpl]

'getChildrenOfType' @ [74:52] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtReferenceExpression..KtReferenceExpression?)>): (Array<(KtReferenceExpression..KtReferenceExpression?)>?..Array<out (KtReferenceExpression..KtReferenceExpression?)>?) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtReferenceExpression

'left' @ [74:93] ==> val left: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'java' @ [74:128] ==> public val <T> KClass<KtReferenceExpression>.java: Class<KtReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtReferenceExpression

'referenceExpressions' @ [75:17] ==> val referenceExpressions: (Array<(KtReferenceExpression..KtReferenceExpression?)>?..Array<out (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'referenceExpressions' @ [76:30] ==> val referenceExpressions: (Array<(KtReferenceExpression..KtReferenceExpression?)>?..Array<out (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'expr' @ [78:25] ==> val expr: (KtReferenceExpression..KtReferenceExpression?) defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'expression' @ [78:33] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

'binaryExpression' @ [78:47] ==> val binaryExpression: KtBinaryExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'operationToken' @ [78:64] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'PROPERTY_SET_OPERATIONS' @ [78:82] ==> private final val PROPERTY_SET_OPERATIONS: TokenSet defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[PropertyDescriptorImpl]

'getParentOfType' @ [83:43] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtUnaryExpression..KtUnaryExpression?)>): KtUnaryExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtUnaryExpression..org.jetbrains.kotlin.psi.KtUnaryExpression?)

'expression' @ [83:59] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

'KtUnaryExpression' @ [83:71] ==> public constructor KtUnaryExpression(node: (ASTNode..ASTNode?)) defined in org.jetbrains.kotlin.psi.KtUnaryExpression[JavaClassConstructorDescriptor]

'java' @ [83:96] ==> public val <T> KClass<KtUnaryExpression>.java: Class<KtUnaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtUnaryExpression

'unaryExpression' @ [85:13] ==> val unaryExpression: KtUnaryExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'operationReference' @ [85:30] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [85:50] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'PROPERTY_SET_OPERATIONS' @ [85:84] ==> private final val PROPERTY_SET_OPERATIONS: TokenSet defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[PropertyDescriptorImpl]

'getParentOfType' @ [87:46] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtCallableReferenceExpression..KtCallableReferenceExpression?)>): KtCallableReferenceExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallableReferenceExpression..org.jetbrains.kotlin.psi.KtCallableReferenceExpression?)

'expression' @ [87:62] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

'KtCallableReferenceExpression' @ [87:74] ==> public constructor KtCallableReferenceExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[JavaClassConstructorDescriptor]

'java' @ [87:111] ==> public val <T> KClass<KtCallableReferenceExpression>.java: Class<KtCallableReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableReferenceExpression

'callableExpression' @ [89:13] ==> val callableExpression: KtCallableReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'callableExpression' @ [89:43] ==> val callableExpression: KtCallableReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[LocalVariableDescriptor]

'callableReference' @ [89:62] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'expression' @ [89:83] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker.shouldCheckPropertyGetter[ValueParameterDescriptorImpl]

