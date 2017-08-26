'SelfTargetingIntention<KtExpression>' @ [32:26] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtExpression

'java' @ [32:83] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'when (element) {
            is KtOperationReferenceExpression -> isOperatorValid(element)
            is KtIfExpression -> getFirstValidOperator(element) != null && element.ifKeyword.textRange.containsOffset(caretOffset)
            else -> false
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [34:22] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isOperatorValid' @ [35:50] ==> private final fun isOperatorValid(element: KtOperationReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention[SimpleFunctionDescriptorImpl]

'element' @ [35:66] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getFirstValidOperator' @ [36:34] ==> private final fun getFirstValidOperator(element: KtIfExpression): KtOperationReferenceExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention[SimpleFunctionDescriptorImpl]

'element' @ [36:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [36:76] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isApplicableTo[ValueParameterDescriptorImpl]

'ifKeyword' @ [36:84] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [36:94] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [36:104] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [36:119] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isApplicableTo[ValueParameterDescriptorImpl]

'when (element) {
            is KtIfExpression -> getFirstValidOperator(element)!!
            else -> element as KtOperationReferenceExpression
        }' @ [42:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtOperationReferenceExpression, entry1: KtOperationReferenceExpression): KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtOperationReferenceExpression

'element' @ [42:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[ValueParameterDescriptorImpl]

'getFirstValidOperator' @ [43:34] ==> private final fun getFirstValidOperator(element: KtIfExpression): KtOperationReferenceExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention[SimpleFunctionDescriptorImpl]

'element' @ [43:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [44:21] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[ValueParameterDescriptorImpl]

'operator' @ [47:28] ==> val operator: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [47:37] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtIfExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIfExpression

'CommentSaver' @ [49:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'ifExpression' @ [49:41] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'operator' @ [51:26] ==> val operator: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'parent' @ [51:35] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'safeDeparenthesize' @ [52:41] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'getRight' @ [52:60] ==> private final fun getRight(element: KtBinaryExpression, condition: KtExpression, commentSaver: CommentSaver): KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention[SimpleFunctionDescriptorImpl]

'expression' @ [52:69] ==> val expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'ifExpression' @ [52:81] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'condition' @ [52:94] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'commentSaver' @ [52:107] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'safeDeparenthesize' @ [53:40] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [53:59] ==> val expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'left' @ [53:70] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [54:26] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'then' @ [54:39] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [55:26] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'`else`' @ [55:39] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [57:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [57:39] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[ValueParameterDescriptorImpl]

'psiFactory' @ [59:23] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createIf' @ [59:34] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'rightExpression' @ [59:43] ==> val rightExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'thenBranch' @ [59:60] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'elseBranch' @ [59:72] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'when (operator.getReferencedNameElementType()) {
            KtTokens.ANDAND -> psiFactory.createIf(leftExpression, psiFactory.createSingleStatementBlock(innerIf), elseBranch)

            KtTokens.OROR -> {
                val container = ifExpression.parent

                if (container is KtBlockExpression && elseBranch == null && thenBranch.lastBlockStatementOrThis().isExitStatement()) { // special case
                    val secondIf = container.addAfter(innerIf, ifExpression)
                    container.addAfter(psiFactory.createNewLine(), ifExpression)
                    val firstIf = ifExpression.replace(psiFactory.createIf(leftExpression, thenBranch))
                    commentSaver.restore(PsiChildRange(firstIf, secondIf))
                    return
                }
                else {
                    psiFactory.createIf(leftExpression, thenBranch, innerIf)
                }
            }

            else -> throw IllegalArgumentException()
        }' @ [61:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtIfExpression, entry1: KtIfExpression, entry2: KtIfExpression): KtIfExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtIfExpression

'operator' @ [61:27] ==> val operator: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'getReferencedNameElementType' @ [61:36] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'ANDAND' @ [62:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psiFactory' @ [62:32] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createIf' @ [62:43] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'leftExpression' @ [62:52] ==> val leftExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'psiFactory' @ [62:68] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createSingleStatementBlock' @ [62:79] ==> public final fun createSingleStatementBlock(statement: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'innerIf' @ [62:106] ==> val innerIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'elseBranch' @ [62:116] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'OROR' @ [64:22] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ifExpression' @ [65:33] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'parent' @ [65:46] ==> public final val KtIfExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (container is KtBlockExpression && elseBranch == null && thenBranch.lastBlockStatementOrThis().isExitStatement()) { // special case
                    val secondIf = container.addAfter(innerIf, ifExpression)
                    container.addAfter(psiFactory.createNewLine(), ifExpression)
                    val firstIf = ifExpression.replace(psiFactory.createIf(leftExpression, thenBranch))
                    commentSaver.restore(PsiChildRange(firstIf, secondIf))
                    return
                }
                else {
                    psiFactory.createIf(leftExpression, thenBranch, innerIf)
                }' @ [67:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtIfExpression, elseBranch: KtIfExpression): KtIfExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtIfExpression

'container' @ [67:21] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'elseBranch' @ [67:55] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'thenBranch' @ [67:77] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'lastBlockStatementOrThis' @ [67:88] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isExitStatement' @ [67:115] ==> public fun KtExpression.isExitStatement(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'container' @ [68:36] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'addAfter' @ [68:46] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'innerIf' @ [68:55] ==> val innerIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'ifExpression' @ [68:64] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'container' @ [69:21] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'addAfter' @ [69:31] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [69:40] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createNewLine' @ [69:51] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [69:68] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'ifExpression' @ [70:35] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'replace' @ [70:48] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIfExpression[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [70:56] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createIf' @ [70:67] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'leftExpression' @ [70:76] ==> val leftExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'thenBranch' @ [70:92] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [71:21] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'restore' @ [71:34] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'PsiChildRange' @ [71:42] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'firstIf' @ [71:56] ==> val firstIf: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'secondIf' @ [71:65] ==> val secondIf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'psiFactory' @ [75:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'createIf' @ [75:32] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'leftExpression' @ [75:41] ==> val leftExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'thenBranch' @ [75:57] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'innerIf' @ [75:69] ==> val innerIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'IllegalArgumentException' @ [79:27] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'ifExpression' @ [82:22] ==> val ifExpression: KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'replace' @ [82:35] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIfExpression[DeserializedSimpleFunctionDescriptor]

'newIf' @ [82:43] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [83:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'restore' @ [83:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'result' @ [83:30] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.applyTo[LocalVariableDescriptor]

'condition' @ [88:30] ==> value-parameter condition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'range' @ [88:40] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'element' @ [89:27] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'right' @ [89:35] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'startOffset' @ [89:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'conditionRange' @ [89:57] ==> val conditionRange: TextRange defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'start' @ [89:72] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'conditionRange' @ [90:25] ==> val conditionRange: TextRange defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'length' @ [90:40] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'condition' @ [91:27] ==> value-parameter condition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'text' @ [91:37] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [91:42] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [91:52] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'endOffset' @ [91:65] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'KtPsiFactory' @ [93:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [93:39] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'createExpression' @ [93:48] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'rightString' @ [93:65] ==> val rightString: String defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'commentSaver' @ [94:9] ==> value-parameter commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'elementCreatedByText' @ [94:22] ==> public final fun elementCreatedByText(createdElement: PsiElement, original: PsiElement, rangeInOriginal: TextRange): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'expression' @ [94:43] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'condition' @ [94:55] ==> value-parameter condition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[ValueParameterDescriptorImpl]

'TextRange' @ [94:66] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [94:76] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'endOffset' @ [94:89] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'expression' @ [95:16] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getRight[LocalVariableDescriptor]

'element' @ [99:25] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getFirstValidOperator[ValueParameterDescriptorImpl]

'condition' @ [99:33] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'findChildrenOfType' @ [100:28] ==> @NotNull public open fun <T : (PsiElement..PsiElement?)> findChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<out (KtOperationReferenceExpression..KtOperationReferenceExpression?)>): (MutableCollection<(KtOperationReferenceExpression..KtOperationReferenceExpression?)>..Collection<(KtOperationReferenceExpression..KtOperationReferenceExpression?)>) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtOperationReferenceExpression..org.jetbrains.kotlin.psi.KtOperationReferenceExpression?)

'condition' @ [100:47] ==> val condition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getFirstValidOperator[LocalVariableDescriptor]

'KtOperationReferenceExpression' @ [100:58] ==> public constructor KtOperationReferenceExpression(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedClassConstructorDescriptor]

'java' @ [100:96] ==> public val <T> KClass<KtOperationReferenceExpression>.java: Class<KtOperationReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtOperationReferenceExpression

'firstOrNull' @ [101:18] ==> public inline fun <T> Iterable<(KtOperationReferenceExpression..KtOperationReferenceExpression?)>.firstOrNull(predicate: ((KtOperationReferenceExpression..KtOperationReferenceExpression?)) -> Boolean): KtOperationReferenceExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtOperationReferenceExpression..org.jetbrains.kotlin.psi.KtOperationReferenceExpression?)

'isOperatorValid' @ [101:32] ==> private final fun isOperatorValid(element: KtOperationReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention[SimpleFunctionDescriptorImpl]

'it' @ [101:48] ==> value-parameter it: (KtOperationReferenceExpression..KtOperationReferenceExpression?) defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.getFirstValidOperator.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [105:24] ==> value-parameter element: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [105:32] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'operator' @ [106:13] ==> val operator: IElementType defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'ANDAND' @ [106:34] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operator' @ [106:44] ==> val operator: IElementType defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'OROR' @ [106:65] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [108:26] ==> value-parameter element: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[ValueParameterDescriptorImpl]

'parent' @ [108:34] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [110:13] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'right' @ [110:24] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'expression' @ [110:41] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'left' @ [110:52] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [113:13] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'expression' @ [113:26] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'parent' @ [113:37] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [114:17] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'operationToken' @ [114:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operator' @ [114:46] ==> val operator: IElementType defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'expression' @ [117:28] ==> var expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'parent' @ [117:39] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [117:46] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ifExpression' @ [119:13] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'condition' @ [119:26] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'!' @ [120:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAncestor' @ [120:26] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'ifExpression' @ [120:37] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'condition' @ [120:50] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'element' @ [120:61] ==> value-parameter element: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[ValueParameterDescriptorImpl]

'ifExpression' @ [122:13] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.SplitIfIntention.isOperatorValid[LocalVariableDescriptor]

'then' @ [122:26] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

