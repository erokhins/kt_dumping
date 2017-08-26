'IntentionBasedInspection<KtBinaryExpression>' @ [33:48] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtBinaryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'SimplifyBooleanWithConstantsIntention' @ [33:93] ==> public constructor SimplifyBooleanWithConstantsIntention() defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[ClassConstructorDescriptorImpl]

'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [35:47] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [35:107] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [35:133] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'?:' @ [38:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBinaryExpression?, right: KtBinaryExpression): KtBinaryExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBinaryExpression

'getTopmostParentOfType' @ [38:37] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getTopmostParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtBinaryExpression..KtBinaryExpression?)>): KtBinaryExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtBinaryExpression

'element' @ [38:60] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [38:69] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [38:95] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [38:104] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'areThereExpressionsToBeSimplified' @ [39:16] ==> private final fun areThereExpressionsToBeSimplified(element: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'topBinary' @ [39:50] ==> val topBinary: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [43:13] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'when (element) {
            is KtParenthesizedExpression -> return areThereExpressionsToBeSimplified(element.expression)

            is KtBinaryExpression -> {
                val op = element.operationToken
                if (op == ANDAND || op == OROR || op == EQEQ || op == EXCLEQ) {
                    if (areThereExpressionsToBeSimplified(element.left) && element.right.hasBooleanType()) return true
                    if (areThereExpressionsToBeSimplified(element.right) && element.left.hasBooleanType()) return true
                }
            }
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [44:15] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'areThereExpressionsToBeSimplified' @ [45:52] ==> private final fun areThereExpressionsToBeSimplified(element: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'element' @ [45:86] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'expression' @ [45:94] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'element' @ [48:26] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'operationToken' @ [48:34] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'op' @ [49:21] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[LocalVariableDescriptor]

'ANDAND' @ [49:27] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [49:37] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[LocalVariableDescriptor]

'OROR' @ [49:43] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [49:51] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[LocalVariableDescriptor]

'EQEQ' @ [49:57] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [49:65] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[LocalVariableDescriptor]

'EXCLEQ' @ [49:71] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'areThereExpressionsToBeSimplified' @ [50:25] ==> private final fun areThereExpressionsToBeSimplified(element: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'element' @ [50:59] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'left' @ [50:67] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [50:76] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'right' @ [50:84] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'hasBooleanType' @ [50:90] ==> private final fun KtExpression?.hasBooleanType(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'areThereExpressionsToBeSimplified' @ [51:25] ==> private final fun areThereExpressionsToBeSimplified(element: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'element' @ [51:59] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'right' @ [51:67] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [51:77] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'left' @ [51:85] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'hasBooleanType' @ [51:90] ==> private final fun KtExpression?.hasBooleanType(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'element' @ [55:16] ==> value-parameter element: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.areThereExpressionsToBeSimplified[ValueParameterDescriptorImpl]

'canBeReducedToBooleanConstant' @ [55:24] ==> private final fun KtExpression.canBeReducedToBooleanConstant(constant: Boolean? = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'?:' @ [59:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBinaryExpression?, right: KtBinaryExpression): KtBinaryExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBinaryExpression

'getTopmostParentOfType' @ [59:37] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getTopmostParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtBinaryExpression..KtBinaryExpression?)>): KtBinaryExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtBinaryExpression

'element' @ [59:60] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.applyTo[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [59:69] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [59:95] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [59:104] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.applyTo[ValueParameterDescriptorImpl]

'toSimplifiedExpression' @ [60:26] ==> private final fun toSimplifiedExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'topBinary' @ [60:49] ==> val topBinary: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.applyTo[LocalVariableDescriptor]

'topBinary' @ [61:9] ==> val topBinary: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.applyTo[LocalVariableDescriptor]

'replace' @ [61:19] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'safeDeparenthesize' @ [61:37] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression, p1: Boolean): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'simplified' @ [61:56] ==> val simplified: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [65:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [65:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'when  {
            expression.canBeReducedToTrue() -> {
                return psiFactory.createExpression("true")
            }

            expression.canBeReducedToFalse() -> {
                return psiFactory.createExpression("false")
            }

            expression is KtParenthesizedExpression -> {
                val expr = expression.expression
                if (expr != null) {
                    val simplified = toSimplifiedExpression(expr)
                    return if (simplified is KtBinaryExpression) {
                        // wrap in new parentheses to keep the user's original format
                        psiFactory.createExpressionByPattern("($0)", simplified)
                    }
                    else {
                        // if we now have a simpleName, constant, or parenthesized we don't need parentheses
                        simplified
                    }
                }
            }

            expression is KtBinaryExpression -> {
                val left = expression.left
                val right = expression.right
                val op = expression.operationToken
                if (left != null && right != null && (op == ANDAND || op == OROR || op == EQEQ || op == EXCLEQ)) {
                    val simpleLeft = simplifyExpression(left)
                    val simpleRight = simplifyExpression(right)
                    return when {
                        simpleLeft.canBeReducedToTrue() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(true, simpleRight, op)

                        simpleLeft.canBeReducedToFalse() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(false, simpleRight, op)

                        simpleRight.canBeReducedToTrue() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(true, simpleLeft, op)

                        simpleRight.canBeReducedToFalse() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(false, simpleLeft, op)

                        else -> {
                            val opText = expression.operationReference.text
                            psiFactory.createExpressionByPattern("$0 $opText $1", simpleLeft, simpleRight)
                        }
                    }
                }
            }
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'expression' @ [68:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'canBeReducedToTrue' @ [68:24] ==> private final fun KtExpression.canBeReducedToTrue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'psiFactory' @ [69:24] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'createExpression' @ [69:35] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [72:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'canBeReducedToFalse' @ [72:24] ==> private final fun KtExpression.canBeReducedToFalse(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'psiFactory' @ [73:24] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'createExpression' @ [73:35] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [76:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [77:28] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [77:39] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'expr' @ [78:21] ==> val expr: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'toSimplifiedExpression' @ [79:38] ==> private final fun toSimplifiedExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'expr' @ [79:61] ==> val expr: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'if (simplified is KtBinaryExpression) {
                        // wrap in new parentheses to keep the user's original format
                        psiFactory.createExpressionByPattern("($0)", simplified)
                    }
                    else {
                        // if we now have a simpleName, constant, or parenthesized we don't need parentheses
                        simplified
                    }' @ [80:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'simplified' @ [80:32] ==> val simplified: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'psiFactory' @ [82:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'createExpressionByPattern' @ [82:36] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'simplified' @ [82:70] ==> val simplified: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simplified' @ [86:25] ==> val simplified: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'expression' @ [91:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [92:28] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'left' @ [92:39] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [93:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'right' @ [93:40] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'expression' @ [94:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'operationToken' @ [94:37] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'left' @ [95:21] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'right' @ [95:37] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'op' @ [95:55] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'ANDAND' @ [95:61] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [95:71] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'OROR' @ [95:77] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [95:85] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'EQEQ' @ [95:91] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'op' @ [95:99] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'EXCLEQ' @ [95:105] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'simplifyExpression' @ [96:38] ==> private final fun simplifyExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'left' @ [96:57] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simplifyExpression' @ [97:39] ==> private final fun simplifyExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'right' @ [97:58] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'when {
                        simpleLeft.canBeReducedToTrue() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(true, simpleRight, op)

                        simpleLeft.canBeReducedToFalse() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(false, simpleRight, op)

                        simpleRight.canBeReducedToTrue() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(true, simpleLeft, op)

                        simpleRight.canBeReducedToFalse() -> toSimplifiedBooleanBinaryExpressionWithConstantOperand(false, simpleLeft, op)

                        else -> {
                            val opText = expression.operationReference.text
                            psiFactory.createExpressionByPattern("$0 $opText $1", simpleLeft, simpleRight)
                        }
                    }' @ [98:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression, entry3: KtExpression, entry4: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'simpleLeft' @ [99:25] ==> val simpleLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'canBeReducedToTrue' @ [99:36] ==> private final fun KtExpression.canBeReducedToTrue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'toSimplifiedBooleanBinaryExpressionWithConstantOperand' @ [99:60] ==> private final fun toSimplifiedBooleanBinaryExpressionWithConstantOperand(constantOperand: Boolean, otherOperand: KtExpression, operation: IElementType): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'simpleRight' @ [99:121] ==> val simpleRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'op' @ [99:134] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simpleLeft' @ [101:25] ==> val simpleLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'canBeReducedToFalse' @ [101:36] ==> private final fun KtExpression.canBeReducedToFalse(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'toSimplifiedBooleanBinaryExpressionWithConstantOperand' @ [101:61] ==> private final fun toSimplifiedBooleanBinaryExpressionWithConstantOperand(constantOperand: Boolean, otherOperand: KtExpression, operation: IElementType): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'simpleRight' @ [101:123] ==> val simpleRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'op' @ [101:136] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simpleRight' @ [103:25] ==> val simpleRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'canBeReducedToTrue' @ [103:37] ==> private final fun KtExpression.canBeReducedToTrue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'toSimplifiedBooleanBinaryExpressionWithConstantOperand' @ [103:61] ==> private final fun toSimplifiedBooleanBinaryExpressionWithConstantOperand(constantOperand: Boolean, otherOperand: KtExpression, operation: IElementType): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'simpleLeft' @ [103:122] ==> val simpleLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'op' @ [103:134] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simpleRight' @ [105:25] ==> val simpleRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'canBeReducedToFalse' @ [105:37] ==> private final fun KtExpression.canBeReducedToFalse(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'toSimplifiedBooleanBinaryExpressionWithConstantOperand' @ [105:62] ==> private final fun toSimplifiedBooleanBinaryExpressionWithConstantOperand(constantOperand: Boolean, otherOperand: KtExpression, operation: IElementType): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'simpleLeft' @ [105:124] ==> val simpleLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'op' @ [105:136] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'expression' @ [108:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'operationReference' @ [108:53] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'text' @ [108:72] ==> public final val KtOperationReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'psiFactory' @ [109:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'createExpressionByPattern' @ [109:40] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'opText' @ [109:71] ==> val opText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simpleLeft' @ [109:83] ==> val simpleLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'simpleRight' @ [109:95] ==> val simpleRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[LocalVariableDescriptor]

'expression' @ [116:16] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedExpression[ValueParameterDescriptorImpl]

'copied' @ [116:27] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'KtPsiFactory' @ [120:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'otherOperand' @ [120:36] ==> value-parameter otherOperand: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'when (operation) {
            OROR -> {
                if (constantOperand) return factory.createExpression("true")
            }
            ANDAND -> {
                if (!constantOperand) return factory.createExpression("false")
            }
            EQEQ, EXCLEQ -> toSimplifiedExpression(otherOperand).let {
                return if (constantOperand == (operation == EQEQ)) it
                else factory.createExpressionByPattern("!$0", it)
            }
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'operation' @ [121:15] ==> value-parameter operation: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'OROR' @ [122:13] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'constantOperand' @ [123:21] ==> value-parameter constantOperand: Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'factory' @ [123:45] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[LocalVariableDescriptor]

'createExpression' @ [123:53] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ANDAND' @ [125:13] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [126:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constantOperand' @ [126:22] ==> value-parameter constantOperand: Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'factory' @ [126:46] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[LocalVariableDescriptor]

'createExpression' @ [126:54] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'EQEQ' @ [128:13] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [128:19] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'toSimplifiedExpression' @ [128:29] ==> private final fun toSimplifiedExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'otherOperand' @ [128:52] ==> value-parameter otherOperand: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'let' @ [128:66] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'if (constantOperand == (operation == EQEQ)) it
                else factory.createExpressionByPattern("!$0", it)' @ [129:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'constantOperand' @ [129:28] ==> value-parameter constantOperand: Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'operation' @ [129:48] ==> value-parameter operation: IElementType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'EQEQ' @ [129:61] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [129:68] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [130:22] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[LocalVariableDescriptor]

'createExpressionByPattern' @ [130:30] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'it' @ [130:63] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand.<anonymous>[ValueParameterDescriptorImpl]

'toSimplifiedExpression' @ [133:16] ==> private final fun toSimplifiedExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'otherOperand' @ [133:39] ==> value-parameter otherOperand: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.toSimplifiedBooleanBinaryExpressionWithConstantOperand[ValueParameterDescriptorImpl]

'expression' @ [136:64] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.simplifyExpression[ValueParameterDescriptorImpl]

'replaced' @ [136:75] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'toSimplifiedExpression' @ [136:84] ==> private final fun toSimplifiedExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'expression' @ [136:107] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.simplifyExpression[ValueParameterDescriptorImpl]

'this' @ [139:20] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.hasBooleanType[ReceiverParameterDescriptorImpl]

'getType' @ [139:26] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [139:34] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.hasBooleanType[ReceiverParameterDescriptorImpl]

'analyze' @ [139:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'isBoolean' @ [140:31] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [140:41] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.hasBooleanType[LocalVariableDescriptor]

'!' @ [140:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [140:51] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.hasBooleanType[LocalVariableDescriptor]

'isFlexible' @ [140:56] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'canBeReducedToBooleanConstant' @ [144:41] ==> public open fun canBeReducedToBooleanConstant(@Nullable p0: KtExpression?, @NotNull p1: BindingContext, @Nullable p2: Boolean?): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'this' @ [144:71] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.canBeReducedToBooleanConstant[ReceiverParameterDescriptorImpl]

'this' @ [144:77] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.canBeReducedToBooleanConstant[ReceiverParameterDescriptorImpl]

'analyze' @ [144:82] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'constant' @ [144:93] ==> value-parameter constant: Boolean? = ... defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention.canBeReducedToBooleanConstant[ValueParameterDescriptorImpl]

'canBeReducedToBooleanConstant' @ [147:53] ==> private final fun KtExpression.canBeReducedToBooleanConstant(constant: Boolean? = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'canBeReducedToBooleanConstant' @ [149:54] ==> private final fun KtExpression.canBeReducedToBooleanConstant(constant: Boolean? = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

