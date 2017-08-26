'SelfTargetingIntention<KtExpression>' @ [36:37] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtExpression

'java' @ [36:94] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'element' @ [39:25] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePrefix[ValueParameterDescriptorImpl]

'operationReference' @ [39:33] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'!' @ [40:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'opRef' @ [40:18] ==> val opRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePrefix[LocalVariableDescriptor]

'textRange' @ [40:24] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [40:34] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [40:49] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePrefix[ValueParameterDescriptorImpl]

'when (opRef.getReferencedNameElementType()) {
                KtTokens.PLUS, KtTokens.MINUS, KtTokens.PLUSPLUS, KtTokens.MINUSMINUS, KtTokens.EXCL -> true
                else -> false
            }' @ [41:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'opRef' @ [41:26] ==> val opRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePrefix[LocalVariableDescriptor]

'getReferencedNameElementType' @ [41:32] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'PLUS' @ [42:26] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUS' @ [42:41] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PLUSPLUS' @ [42:57] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [42:76] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCL' @ [42:97] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [48:25] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePostfix[ValueParameterDescriptorImpl]

'operationReference' @ [48:33] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'!' @ [49:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'opRef' @ [49:18] ==> val opRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePostfix[LocalVariableDescriptor]

'textRange' @ [49:24] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [49:34] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [49:49] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePostfix[ValueParameterDescriptorImpl]

'element' @ [50:17] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePostfix[ValueParameterDescriptorImpl]

'baseExpression' @ [50:25] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'when (opRef.getReferencedNameElementType()) {
                KtTokens.PLUSPLUS, KtTokens.MINUSMINUS -> true
                else -> false
            }' @ [51:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'opRef' @ [51:26] ==> val opRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicablePostfix[LocalVariableDescriptor]

'getReferencedNameElementType' @ [51:32] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'PLUSPLUS' @ [52:26] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [52:45] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [58:25] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableBinary[ValueParameterDescriptorImpl]

'operationReference' @ [58:33] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'!' @ [59:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'opRef' @ [59:18] ==> val opRef: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableBinary[LocalVariableDescriptor]

'textRange' @ [59:24] ==> public final val KtOperationReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [59:34] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [59:49] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableBinary[ValueParameterDescriptorImpl]

'when (opRef.getReferencedNameElementType()) {
                KtTokens.PLUS, KtTokens.MINUS, KtTokens.MUL, KtTokens.DIV, KtTokens.PERC, KtTokens.RANGE, KtTokens.IN_KEYWORD, KtTokens.NOT_IN, KtTokens.PLUSEQ, KtTokens.MINUSEQ, KtTokens.MULTEQ, KtTokens.DIVEQ, KtTokens.PERCEQ, KtTokens.EQEQ, KtTokens.EXCLEQ, KtTokens.GT, KtTokens.LT, KtTokens.GTEQ, KtTokens.LTEQ -> true
                KtTokens.EQ -> element.left is KtArrayAccessExpression
                else -> false
            }' @ [60:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'opRef' @ [60:26] ==> val opRef: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableBinary[LocalVariableDescriptor]

'getReferencedNameElementType' @ [60:32] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'PLUS' @ [61:26] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUS' @ [61:41] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUL' @ [61:57] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DIV' @ [61:71] ==> public final val DIV: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PERC' @ [61:85] ==> public final val PERC: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RANGE' @ [61:100] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IN_KEYWORD' @ [61:116] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [61:137] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PLUSEQ' @ [61:154] ==> public final val PLUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSEQ' @ [61:171] ==> public final val MINUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MULTEQ' @ [61:189] ==> public final val MULTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DIVEQ' @ [61:206] ==> public final val DIVEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PERCEQ' @ [61:222] ==> public final val PERCEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQ' @ [61:239] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [61:254] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [61:271] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [61:284] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [61:297] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [61:312] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQ' @ [62:26] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [62:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableBinary[ValueParameterDescriptorImpl]

'left' @ [62:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [68:28] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[ValueParameterDescriptorImpl]

'leftBracket' @ [68:36] ==> public final val KtArrayAccessExpression.leftBracket: PsiElement?[MyPropertyDescriptor]

'element' @ [69:28] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[ValueParameterDescriptorImpl]

'rightBracket' @ [69:36] ==> public final val KtArrayAccessExpression.rightBracket: PsiElement?[MyPropertyDescriptor]

'element' @ [71:26] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[ValueParameterDescriptorImpl]

'readWriteAccess' @ [71:34] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'access' @ [72:17] ==> val access: ReferenceAccess defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[LocalVariableDescriptor]

'READ_WRITE' @ [72:43] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'lbracket' @ [74:20] ==> val lbracket: PsiElement defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[LocalVariableDescriptor]

'textRange' @ [74:29] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [74:39] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [74:54] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[ValueParameterDescriptorImpl]

'rbracket' @ [74:70] ==> val rbracket: PsiElement defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[LocalVariableDescriptor]

'textRange' @ [74:79] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [74:89] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [74:104] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableArrayAccess[ValueParameterDescriptorImpl]

'element' @ [78:27] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'valueArgumentList' @ [78:35] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'leftParenthesis' @ [78:54] ==> public final val KtValueArgumentList.leftParenthesis: PsiElement?[MyPropertyDescriptor]

'element' @ [79:30] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'lambdaArguments' @ [79:38] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [79:54] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [79:69] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'leftCurlyBrace' @ [79:92] ==> public final val KtLambdaExpression.leftCurlyBrace: ASTNode[MyPropertyDescriptor]

'!' @ [81:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lbrace' @ [81:18] ==> val lbrace: PsiElement defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[LocalVariableDescriptor]

'textRange' @ [81:25] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [81:35] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [81:50] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'element' @ [83:32] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [83:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [83:56] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'analyze' @ [83:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [84:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[LocalVariableDescriptor]

'resultingDescriptor' @ [84:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [85:17] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[LocalVariableDescriptor]

'descriptor' @ [85:53] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[LocalVariableDescriptor]

'getName' @ [85:64] ==> @NotNull public abstract fun getName(): Name defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'OperatorNameConventions' @ [85:77] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [85:101] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [86:21] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'parent' @ [86:29] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [87:21] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'calleeExpression' @ [87:29] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [87:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'OperatorNameConventions' @ [87:55] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [87:79] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [87:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [88:24] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'valueArgumentList' @ [88:32] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'element' @ [88:61] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isApplicableCall[ValueParameterDescriptorImpl]

'lambdaArguments' @ [88:69] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [88:85] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'element' @ [94:22] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[ValueParameterDescriptorImpl]

'operationReference' @ [94:30] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [94:49] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'when (op) {
                KtTokens.PLUS -> OperatorNameConventions.UNARY_PLUS
                KtTokens.MINUS -> OperatorNameConventions.UNARY_MINUS
                KtTokens.PLUSPLUS -> OperatorNameConventions.INC
                KtTokens.MINUSMINUS -> OperatorNameConventions.DEC
                KtTokens.EXCL -> OperatorNameConventions.NOT
                else -> return element
            }' @ [95:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name, entry1: Name, entry2: Name, entry3: Name, entry4: Name, entry5: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name

'op' @ [95:38] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[LocalVariableDescriptor]

'PLUS' @ [96:26] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [96:34] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'UNARY_PLUS' @ [96:58] ==> @field:JvmField public final val UNARY_PLUS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'MINUS' @ [97:26] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [97:35] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'UNARY_MINUS' @ [97:59] ==> @field:JvmField public final val UNARY_MINUS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'PLUSPLUS' @ [98:26] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [98:38] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INC' @ [98:62] ==> @field:JvmField public final val INC: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'MINUSMINUS' @ [99:26] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [99:40] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'DEC' @ [99:64] ==> @field:JvmField public final val DEC: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'EXCL' @ [100:26] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [100:34] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'NOT' @ [100:58] ==> @field:JvmField public final val NOT: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [101:32] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [104:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [104:44] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [104:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [104:90] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[ValueParameterDescriptorImpl]

'baseExpression' @ [104:98] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'operatorName' @ [104:116] ==> val operatorName: Name defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[LocalVariableDescriptor]

'element' @ [105:20] ==> value-parameter element: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[ValueParameterDescriptorImpl]

'replace' @ [105:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtPrefixExpression[DeserializedSimpleFunctionDescriptor]

'transformed' @ [105:36] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPrefix[LocalVariableDescriptor]

'element' @ [109:22] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[ValueParameterDescriptorImpl]

'operationReference' @ [109:30] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [109:49] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'when (op) {
                KtTokens.PLUSPLUS -> OperatorNameConventions.INC
                KtTokens.MINUSMINUS -> OperatorNameConventions.DEC
                else -> return element
            }' @ [110:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name, entry1: Name, entry2: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name

'op' @ [110:38] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[LocalVariableDescriptor]

'PLUSPLUS' @ [111:26] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [111:38] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INC' @ [111:62] ==> @field:JvmField public final val INC: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'MINUSMINUS' @ [112:26] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorNameConventions' @ [112:40] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'DEC' @ [112:64] ==> @field:JvmField public final val DEC: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [113:32] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [116:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [116:44] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [116:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [116:90] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[ValueParameterDescriptorImpl]

'baseExpression' @ [116:98] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'operatorName' @ [116:116] ==> val operatorName: Name defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[LocalVariableDescriptor]

'element' @ [117:20] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[ValueParameterDescriptorImpl]

'replace' @ [117:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtPostfixExpression[DeserializedSimpleFunctionDescriptor]

'transformed' @ [117:36] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertPostFix[LocalVariableDescriptor]

'element' @ [122:22] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'operationReference' @ [122:30] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [122:49] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [123:24] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'left' @ [123:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [124:25] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'right' @ [124:33] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'op' @ [126:17] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'EQ' @ [126:32] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'left' @ [127:21] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'convertArrayAccess' @ [128:21] ==> private final fun convertArrayAccess(element: KtArrayAccessExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'left' @ [128:40] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'element' @ [130:24] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'element' @ [133:27] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'analyze' @ [133:35] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [133:59] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [134:37] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'getResolvedCall' @ [134:45] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [134:61] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'functionCandidate' @ [135:32] ==> val functionCandidate: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'candidateDescriptor' @ [135:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'name' @ [135:72] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'toString' @ [135:77] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [136:28] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'getType' @ [136:36] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'left' @ [136:44] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'when (op) {
                KtTokens.PLUS -> "$0.plus($1)"
                KtTokens.MINUS -> "$0.minus($1)"
                KtTokens.MUL -> "$0.times($1)"
                KtTokens.DIV -> "$0.div($1)"
                KtTokens.PERC -> "$0.rem($1)"
                KtTokens.RANGE -> "$0.rangeTo($1)"
                KtTokens.IN_KEYWORD -> "$1.contains($0)"
                KtTokens.NOT_IN -> "!$1.contains($0)"
                KtTokens.PLUSEQ -> if (functionName == "plusAssign") "$0.plusAssign($1)" else "$0 = $0.plus($1)"
                KtTokens.MINUSEQ -> if (functionName == "minusAssign") "$0.minusAssign($1)" else "$0 = $0.minus($1)"
                KtTokens.MULTEQ -> if (functionName == "multAssign") "$0.multAssign($1)" else "$0 = $0.mult($1)"
                KtTokens.DIVEQ -> if (functionName == "divAssign") "$0.divAssign($1)" else "$0 = $0.div($1)"
                KtTokens.PERCEQ -> {
                    val remSupported = element.languageVersionSettings.supportsFeature(LanguageFeature.OperatorRem)
                    if (remSupported && functionName == "remAssign") "$0.remAssign($1)"
                    else if (functionName == "modAssign") "$0.modAssign($1)"
                    else if (remSupported) "$0 = $0.rem($1)"
                    else "$0 = $0.mod($1)"
                }
                KtTokens.EQEQ -> if (elemType?.isMarkedNullable ?: true) "$0?.equals($1) ?: ($1 == null)" else "$0.equals($1)"
                KtTokens.EXCLEQ -> if (elemType?.isMarkedNullable ?: true) "!($0?.equals($1) ?: ($1 == null))" else "!$0.equals($1)"
                KtTokens.GT -> "$0.compareTo($1) > 0"
                KtTokens.LT -> "$0.compareTo($1) < 0"
                KtTokens.GTEQ -> "$0.compareTo($1) >= 0"
                KtTokens.LTEQ -> "$0.compareTo($1) <= 0"
                else -> return element
            }' @ [138:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String, entry10: String, entry11: String, entry12: String, entry13: String, entry14: String, entry15: String, entry16: String, entry17: String, entry18: String, entry19: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'op' @ [138:33] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'PLUS' @ [139:26] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUS' @ [140:26] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUL' @ [141:26] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DIV' @ [142:26] ==> public final val DIV: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PERC' @ [143:26] ==> public final val PERC: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RANGE' @ [144:26] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IN_KEYWORD' @ [145:26] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [146:26] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PLUSEQ' @ [147:26] ==> public final val PLUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (functionName == "plusAssign") "$0.plusAssign($1)" else "$0 = $0.plus($1)"' @ [147:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionName' @ [147:40] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'MINUSEQ' @ [148:26] ==> public final val MINUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (functionName == "minusAssign") "$0.minusAssign($1)" else "$0 = $0.minus($1)"' @ [148:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionName' @ [148:41] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'MULTEQ' @ [149:26] ==> public final val MULTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (functionName == "multAssign") "$0.multAssign($1)" else "$0 = $0.mult($1)"' @ [149:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionName' @ [149:40] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'DIVEQ' @ [150:26] ==> public final val DIVEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (functionName == "divAssign") "$0.divAssign($1)" else "$0 = $0.div($1)"' @ [150:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionName' @ [150:39] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'PERCEQ' @ [151:26] ==> public final val PERCEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [152:40] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [152:48] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'supportsFeature' @ [152:72] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [152:88] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'OperatorRem' @ [152:104] ==> enum entry OperatorRem defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'if (remSupported && functionName == "remAssign") "$0.remAssign($1)"
                    else if (functionName == "modAssign") "$0.modAssign($1)"
                    else if (remSupported) "$0 = $0.rem($1)"
                    else "$0 = $0.mod($1)"' @ [153:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'remSupported' @ [153:25] ==> val remSupported: Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'functionName' @ [153:41] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'if (functionName == "modAssign") "$0.modAssign($1)"
                    else if (remSupported) "$0 = $0.rem($1)"
                    else "$0 = $0.mod($1)"' @ [154:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionName' @ [154:30] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'if (remSupported) "$0 = $0.rem($1)"
                    else "$0 = $0.mod($1)"' @ [155:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'remSupported' @ [155:30] ==> val remSupported: Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'EQEQ' @ [158:26] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (elemType?.isMarkedNullable ?: true) "$0?.equals($1) ?: ($1 == null)" else "$0.equals($1)"' @ [158:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'elemType' @ [158:38] ==> val elemType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'isMarkedNullable' @ [158:48] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'EXCLEQ' @ [159:26] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (elemType?.isMarkedNullable ?: true) "!($0?.equals($1) ?: ($1 == null))" else "!$0.equals($1)"' @ [159:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'elemType' @ [159:40] ==> val elemType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'isMarkedNullable' @ [159:50] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'GT' @ [160:26] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [161:26] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [162:26] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [163:26] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [164:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [167:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [167:44] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [167:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'pattern' @ [167:79] ==> val pattern: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'left' @ [167:88] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'right' @ [167:94] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'element' @ [168:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[ValueParameterDescriptorImpl]

'replace' @ [168:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'transformed' @ [168:36] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertBinary[LocalVariableDescriptor]

'element' @ [172:53] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [173:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [173:44] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'buildExpression' @ [173:53] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [174:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [174:34] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'arrayExpression' @ [174:42] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'appendFixedText' @ [176:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'if (isAssignmentLeftSide(element)) {
                    val parent = element.parent
                    expressionToReplace = parent as KtBinaryExpression

                    appendFixedText("set(")
                    appendExpressions(element.indexExpressions)
                    appendFixedText(",")
                    appendExpression(parent.right)
                }
                else {
                    appendFixedText("get(")
                    appendExpressions(element.indexExpressions)
                }' @ [178:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BuilderByPattern<KtExpression>, elseBranch: BuilderByPattern<KtExpression>): BuilderByPattern<KtExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BuilderByPattern<KtExpression>

'isAssignmentLeftSide' @ [178:21] ==> private final fun isAssignmentLeftSide(element: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [178:42] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'element' @ [179:34] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'parent' @ [179:42] ==> public final val KtArrayAccessExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expressionToReplace' @ [180:21] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[LocalVariableDescriptor]

'parent' @ [180:43] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [182:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpressions' @ [183:21] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [183:39] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'indexExpressions' @ [183:47] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'appendFixedText' @ [184:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [185:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'parent' @ [185:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess.<anonymous>[LocalVariableDescriptor]

'right' @ [185:45] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'appendFixedText' @ [188:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpressions' @ [189:21] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [189:39] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[ValueParameterDescriptorImpl]

'indexExpressions' @ [189:47] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'appendFixedText' @ [192:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'expressionToReplace' @ [195:20] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[LocalVariableDescriptor]

'replace' @ [195:40] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'transformed' @ [195:48] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertArrayAccess[LocalVariableDescriptor]

'element' @ [199:26] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isAssignmentLeftSide[ValueParameterDescriptorImpl]

'parent' @ [199:34] ==> public final val KtArrayAccessExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [200:20] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isAssignmentLeftSide[LocalVariableDescriptor]

'parent' @ [200:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isAssignmentLeftSide[LocalVariableDescriptor]

'operationReference' @ [200:59] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [200:78] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'EQ' @ [200:121] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [200:127] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isAssignmentLeftSide[ValueParameterDescriptorImpl]

'parent' @ [200:138] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.isAssignmentLeftSide[LocalVariableDescriptor]

'left' @ [200:145] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [205:26] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[ValueParameterDescriptorImpl]

'calleeExpression' @ [205:34] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [206:29] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[ValueParameterDescriptorImpl]

'valueArgumentList' @ [206:37] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'arguments' @ [207:34] ==> val arguments: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'text' @ [207:45] ==> public final val KtValueArgumentList.text: (String..String?)[MyPropertyDescriptor]

'removeSurrounding' @ [207:51] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [208:31] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[ValueParameterDescriptorImpl]

'lambdaArguments' @ [208:39] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'callee' @ [209:30] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'text' @ [209:37] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'+' @ [210:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'calleeText' @ [210:36] ==> val calleeText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'OperatorNameConventions' @ [210:49] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [210:73] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [210:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (argumentString == null) "()" else "($argumentString)"' @ [211:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'argumentString' @ [211:39] ==> val argumentString: String? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'argumentString' @ [211:76] ==> val argumentString: String? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'KtPsiFactory' @ [212:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [212:44] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[ValueParameterDescriptorImpl]

'createExpression' @ [212:53] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'transformation' @ [212:70] ==> val transformation: String defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'transformed' @ [213:34] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [213:46] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [213:74] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [214:17] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'funcLitArgs' @ [215:17] ==> val funcLitArgs: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'forEach' @ [215:29] ==> @HidesMembers public inline fun <T> Iterable<(KtLambdaArgument..KtLambdaArgument?)>.forEach(action: ((KtLambdaArgument..KtLambdaArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'callExpression' @ [215:39] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'add' @ [215:54] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'it' @ [215:58] ==> value-parameter it: (KtLambdaArgument..KtLambdaArgument?) defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall.<anonymous>[ValueParameterDescriptorImpl]

'argumentString' @ [216:21] ==> val argumentString: String? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'callExpression' @ [217:21] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'valueArgumentList' @ [217:36] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'delete' @ [217:55] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'callee' @ [220:20] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'parent' @ [220:27] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'replace' @ [220:34] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'transformed' @ [220:42] ==> val transformed: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convertCall[LocalVariableDescriptor]

'element' @ [224:39] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'element' @ [225:17] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'isAssignmentLeftSide' @ [225:55] ==> private final fun isAssignmentLeftSide(element: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [225:76] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'elementToBeReplaced' @ [226:17] ==> var elementToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'element' @ [226:39] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'parent' @ [226:47] ==> public final val KtArrayAccessExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'CommentSaver' @ [229:32] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[ClassConstructorDescriptorImpl]

'elementToBeReplaced' @ [229:45] ==> var elementToBeReplaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'when (element) {
                is KtPrefixExpression -> convertPrefix(element)
                is KtPostfixExpression -> convertPostFix(element)
                is KtBinaryExpression -> convertBinary(element)
                is KtArrayAccessExpression -> convertArrayAccess(element)
                is KtCallExpression -> convertCall(element)
                else -> throw IllegalArgumentException(element.toString())
            }' @ [231:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression, entry3: KtExpression, entry4: KtExpression, entry5: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'element' @ [231:32] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'convertPrefix' @ [232:42] ==> private final fun convertPrefix(element: KtPrefixExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [232:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'convertPostFix' @ [233:43] ==> private final fun convertPostFix(element: KtPostfixExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [233:58] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'convertBinary' @ [234:42] ==> private final fun convertBinary(element: KtBinaryExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [234:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'convertArrayAccess' @ [235:47] ==> private final fun convertArrayAccess(element: KtArrayAccessExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [235:66] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'convertCall' @ [236:40] ==> private final fun convertCall(element: KtCallExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [236:52] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [237:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'element' @ [237:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[ValueParameterDescriptorImpl]

'toString' @ [237:64] ==> public open fun toString(): String defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'commentSaver' @ [240:13] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'restore' @ [240:26] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[SimpleFunctionDescriptorImpl]

'result' @ [240:34] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'findCallName' @ [242:28] ==> private final fun findCallName(result: KtExpression): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'result' @ [242:41] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'error' @ [243:31] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [243:62] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'text' @ [243:69] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'result' @ [244:20] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'callName' @ [244:30] ==> val callName: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.convert[LocalVariableDescriptor]

'when (result) {
                is KtBinaryExpression -> {
                    if (KtPsiUtil.isAssignment(result))
                        findCallName(result.right!!)
                    else
                        findCallName(result.left!!)
                }

                is KtUnaryExpression -> {
                    result.baseExpression?.let { findCallName(it) }
                }

                is KtParenthesizedExpression -> result.expression?.let { findCallName(it) }

                else -> result.getQualifiedElementSelector() as KtSimpleNameExpression?
            }' @ [248:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameExpression?, entry1: KtSimpleNameExpression?, entry2: KtSimpleNameExpression?, entry3: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameExpression?

'result' @ [248:26] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'if (KtPsiUtil.isAssignment(result))
                        findCallName(result.right!!)
                    else
                        findCallName(result.left!!)' @ [250:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtSimpleNameExpression?, elseBranch: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtSimpleNameExpression?

'isAssignment' @ [250:35] ==> public open fun isAssignment(@NotNull p0: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'result' @ [250:48] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'findCallName' @ [251:25] ==> private final fun findCallName(result: KtExpression): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'result' @ [251:38] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'right' @ [251:45] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'findCallName' @ [253:25] ==> private final fun findCallName(result: KtExpression): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'result' @ [253:38] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'left' @ [253:45] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'result' @ [257:21] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'baseExpression' @ [257:28] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [257:44] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtSimpleNameExpression?): KtSimpleNameExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtSimpleNameExpression?

'findCallName' @ [257:50] ==> private final fun findCallName(result: KtExpression): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [257:63] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [260:49] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'expression' @ [260:56] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'let' @ [260:68] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtSimpleNameExpression?): KtSimpleNameExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtSimpleNameExpression?

'findCallName' @ [260:74] ==> private final fun findCallName(result: KtExpression): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [260:87] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [262:25] ==> value-parameter result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion.findCallName[ValueParameterDescriptorImpl]

'getQualifiedElementSelector' @ [262:32] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'when (element) {
            is KtPrefixExpression -> isApplicablePrefix(element, caretOffset)
            is KtPostfixExpression -> isApplicablePostfix(element, caretOffset)
            is KtBinaryExpression -> isApplicableBinary(element, caretOffset)
            is KtArrayAccessExpression -> isApplicableArrayAccess(element, caretOffset)
            is KtCallExpression -> isApplicableCall(element, caretOffset)
            else -> false
        }' @ [268:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [268:22] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicablePrefix' @ [269:38] ==> private final fun isApplicablePrefix(element: KtPrefixExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [269:57] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'caretOffset' @ [269:66] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicablePostfix' @ [270:39] ==> private final fun isApplicablePostfix(element: KtPostfixExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [270:59] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'caretOffset' @ [270:68] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicableBinary' @ [271:38] ==> private final fun isApplicableBinary(element: KtBinaryExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [271:57] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'caretOffset' @ [271:66] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicableArrayAccess' @ [272:43] ==> private final fun isApplicableArrayAccess(element: KtArrayAccessExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [272:67] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'caretOffset' @ [272:76] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isApplicableCall' @ [273:36] ==> private final fun isApplicableCall(element: KtCallExpression, caretOffset: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [273:53] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'caretOffset' @ [273:62] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'convert' @ [279:9] ==> public final fun convert(element: KtExpression): Pair<KtExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [279:17] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.applyTo[ValueParameterDescriptorImpl]

