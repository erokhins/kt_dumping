'KtPsiFactory' @ [26:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [26:32] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ReceiverParameterDescriptorImpl]

'when (this) {
        is KtWhenConditionIsPattern -> {
            val op = if (isNegated) "!is" else "is"
            factory.createExpressionByPattern("$0 $op $1", subject ?: "_", typeReference ?: "")
        }

        is KtWhenConditionInRange -> {
            val op = operationReference.text
            factory.createExpressionByPattern("$0 $op $1", subject ?: "_", rangeExpression ?: "")
        }

        is KtWhenConditionWithExpression -> {
            if (subject != null) {
                factory.createExpressionByPattern("$0 == $1", subject, expression ?: "")
            }
            else {
                expression!!
            }
        }

        else -> throw IllegalArgumentException("Unknown JetWhenCondition type: $this")
    }' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression, entry3: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'this' @ [27:18] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ReceiverParameterDescriptorImpl]

'if (isNegated) "!is" else "is"' @ [29:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNegated' @ [29:26] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'factory' @ [30:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[LocalVariableDescriptor]

'createExpressionByPattern' @ [30:21] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'op' @ [30:52] ==> val op: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[LocalVariableDescriptor]

'subject' @ [30:60] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ValueParameterDescriptorImpl]

'typeReference' @ [30:76] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'operationReference' @ [34:22] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'text' @ [34:41] ==> public final val KtOperationReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'factory' @ [35:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[LocalVariableDescriptor]

'createExpressionByPattern' @ [35:21] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'op' @ [35:52] ==> val op: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[LocalVariableDescriptor]

'subject' @ [35:60] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ValueParameterDescriptorImpl]

'rangeExpression' @ [35:76] ==> public final val KtWhenConditionInRange.rangeExpression: KtExpression?[MyPropertyDescriptor]

'if (subject != null) {
                factory.createExpressionByPattern("$0 == $1", subject, expression ?: "")
            }
            else {
                expression!!
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'subject' @ [39:17] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ValueParameterDescriptorImpl]

'factory' @ [40:17] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[LocalVariableDescriptor]

'createExpressionByPattern' @ [40:25] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'subject' @ [40:63] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ValueParameterDescriptorImpl]

'expression' @ [40:72] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'expression' @ [43:17] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'IllegalArgumentException' @ [47:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [47:81] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.toExpression[ReceiverParameterDescriptorImpl]

'subjectExpression' @ [52:9] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'entries' @ [55:19] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [56:26] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'conditions' @ [56:32] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'entry' @ [57:14] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'isElse' @ [57:20] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'conditions' @ [57:30] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'isEmpty' @ [57:41] ==> @InlineOnly public inline fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'conditions' @ [59:27] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'condition' @ [60:17] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'condition' @ [62:29] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'expression' @ [62:39] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'getWhenConditionSubjectCandidate' @ [62:51] ==> private fun KtExpression?.getWhenConditionSubjectCandidate(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'if (lastCandidate == null) {
                lastCandidate = candidate
            }
            else if (!lastCandidate.matches(candidate)) {
                return null
            }' @ [64:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'lastCandidate' @ [64:17] ==> var lastCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'lastCandidate' @ [65:17] ==> var lastCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'candidate' @ [65:33] ==> val candidate: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'!' @ [67:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lastCandidate' @ [67:23] ==> var lastCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'matches' @ [67:37] ==> public fun PsiElement?.matches(e: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'candidate' @ [67:45] ==> val candidate: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'lastCandidate' @ [74:12] ==> var lastCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getSubjectToIntroduce[LocalVariableDescriptor]

'when(this) {
        is KtIsExpression -> leftHandSide

        is KtBinaryExpression -> {
            val lhs = left
            val op = operationToken
            when (op) {
                KtTokens.IN_KEYWORD, KtTokens.NOT_IN -> lhs
                KtTokens.EQEQ -> lhs as? KtNameReferenceExpression ?: right
                KtTokens.OROR -> {
                    val leftCandidate = lhs.getWhenConditionSubjectCandidate()
                    val rightCandidate = right.getWhenConditionSubjectCandidate()
                    if (leftCandidate.matches(rightCandidate)) leftCandidate else null
                }
                else -> null
            }

        }

        else -> null
    }' @ [78:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'this' @ [78:17] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[ReceiverParameterDescriptorImpl]

'leftHandSide' @ [79:30] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'left' @ [82:23] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'operationToken' @ [83:22] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'when (op) {
                KtTokens.IN_KEYWORD, KtTokens.NOT_IN -> lhs
                KtTokens.EQEQ -> lhs as? KtNameReferenceExpression ?: right
                KtTokens.OROR -> {
                    val leftCandidate = lhs.getWhenConditionSubjectCandidate()
                    val rightCandidate = right.getWhenConditionSubjectCandidate()
                    if (leftCandidate.matches(rightCandidate)) leftCandidate else null
                }
                else -> null
            }' @ [84:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'op' @ [84:19] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'IN_KEYWORD' @ [85:26] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [85:47] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lhs' @ [85:57] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'EQEQ' @ [86:26] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lhs' @ [86:34] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'right' @ [86:71] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'OROR' @ [87:26] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lhs' @ [88:41] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'getWhenConditionSubjectCandidate' @ [88:45] ==> private fun KtExpression?.getWhenConditionSubjectCandidate(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'right' @ [89:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'getWhenConditionSubjectCandidate' @ [89:48] ==> private fun KtExpression?.getWhenConditionSubjectCandidate(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'if (leftCandidate.matches(rightCandidate)) leftCandidate else null' @ [90:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'leftCandidate' @ [90:25] ==> val leftCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'matches' @ [90:39] ==> public fun PsiElement?.matches(e: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'rightCandidate' @ [90:47] ==> val rightCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'leftCandidate' @ [90:64] ==> val leftCandidate: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.getWhenConditionSubjectCandidate[LocalVariableDescriptor]

'getSubjectToIntroduce' @ [102:19] ==> public fun KtWhenExpression.getSubjectToIntroduce(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'CommentSaver' @ [104:24] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'this' @ [104:37] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[ReceiverParameterDescriptorImpl]

'KtPsiFactory' @ [106:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [106:39] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[ReceiverParameterDescriptorImpl]

'buildExpression' @ [106:45] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [107:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [107:34] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'subject' @ [107:51] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'appendFixedText' @ [107:60] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'entries' @ [109:23] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [110:36] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'expression' @ [110:42] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'if (entry.isElse) {
                appendFixedText("else")
            }
            else {
                for ((i, condition) in entry.conditions.withIndex()) {
                    if (i > 0) appendFixedText(",")

                    val conditionExpression = (condition as KtWhenConditionWithExpression).expression
                    appendConditionWithSubjectRemoved(conditionExpression, subject)
                }
            }' @ [112:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'entry' @ [112:17] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'isElse' @ [112:23] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'appendFixedText' @ [113:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'component1' @ [116:23] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [116:26] ==> public final operator fun component2(): (KtWhenCondition..KtWhenCondition?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'entry' @ [116:40] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'conditions' @ [116:46] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'withIndex' @ [116:57] ==> public fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.withIndex(): Iterable<IndexedValue<(KtWhenCondition..KtWhenCondition?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'i' @ [117:25] ==> val i: Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [117:32] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'condition' @ [119:48] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'expression' @ [119:92] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'appendConditionWithSubjectRemoved' @ [120:21] ==> private fun BuilderByPattern<KtExpression>.appendConditionWithSubjectRemoved(conditionExpression: KtExpression?, subject: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations[SimpleFunctionDescriptorImpl]

'conditionExpression' @ [120:55] ==> val conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'subject' @ [120:76] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'appendFixedText' @ [123:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [125:13] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'branchExpression' @ [125:30] ==> val branchExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [126:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [129:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'replaced' @ [132:18] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtWhenExpression): KtWhenExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenExpression

'whenExpression' @ [132:27] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'commentSaver' @ [133:5] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'restore' @ [133:18] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'result' @ [133:26] ==> val result: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'result' @ [134:12] ==> val result: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.introduceSubject[LocalVariableDescriptor]

'when (conditionExpression) {
        is KtIsExpression -> {
            if (conditionExpression.isNegated) {
                appendFixedText("!")
            }
            appendFixedText("is ")
            appendNonFormattedText(conditionExpression.typeReference?.text ?: "")
        }

        is KtBinaryExpression -> {
            val lhs = conditionExpression.left
            val rhs = conditionExpression.right
            val op = conditionExpression.operationToken
            when (op) {
                KtTokens.IN_KEYWORD -> appendFixedText("in ").appendExpression(rhs)
                KtTokens.NOT_IN -> appendFixedText("!in ").appendExpression(rhs)
                KtTokens.EQEQ -> appendExpression(if (subject.matches(lhs)) rhs else lhs)
                KtTokens.OROR -> {
                    appendConditionWithSubjectRemoved(lhs, subject)
                    appendFixedText(", ")
                    appendConditionWithSubjectRemoved(rhs, subject)
                }
                else -> throw IllegalStateException()
            }
        }

        else -> throw IllegalStateException()
    }' @ [138:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'conditionExpression' @ [138:11] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'conditionExpression' @ [140:17] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'isNegated' @ [140:37] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'appendFixedText' @ [141:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [143:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendNonFormattedText' @ [144:13] ==> public final fun appendNonFormattedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'conditionExpression' @ [144:36] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'typeReference' @ [144:56] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [144:71] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'conditionExpression' @ [148:23] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'left' @ [148:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'conditionExpression' @ [149:23] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'right' @ [149:43] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'conditionExpression' @ [150:22] ==> value-parameter conditionExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'operationToken' @ [150:42] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'when (op) {
                KtTokens.IN_KEYWORD -> appendFixedText("in ").appendExpression(rhs)
                KtTokens.NOT_IN -> appendFixedText("!in ").appendExpression(rhs)
                KtTokens.EQEQ -> appendExpression(if (subject.matches(lhs)) rhs else lhs)
                KtTokens.OROR -> {
                    appendConditionWithSubjectRemoved(lhs, subject)
                    appendFixedText(", ")
                    appendConditionWithSubjectRemoved(rhs, subject)
                }
                else -> throw IllegalStateException()
            }' @ [151:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'op' @ [151:19] ==> val op: IElementType defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'IN_KEYWORD' @ [152:26] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'appendFixedText' @ [152:40] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [152:63] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'rhs' @ [152:80] ==> val rhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'NOT_IN' @ [153:26] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'appendFixedText' @ [153:36] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [153:60] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'rhs' @ [153:77] ==> val rhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'EQEQ' @ [154:26] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'appendExpression' @ [154:34] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'if (subject.matches(lhs)) rhs else lhs' @ [154:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'subject' @ [154:55] ==> value-parameter subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'matches' @ [154:63] ==> public fun PsiElement?.matches(e: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'lhs' @ [154:71] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'rhs' @ [154:77] ==> val rhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'lhs' @ [154:86] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'OROR' @ [155:26] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'appendConditionWithSubjectRemoved' @ [156:21] ==> private fun BuilderByPattern<KtExpression>.appendConditionWithSubjectRemoved(conditionExpression: KtExpression?, subject: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations[SimpleFunctionDescriptorImpl]

'lhs' @ [156:55] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'subject' @ [156:60] ==> value-parameter subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'appendFixedText' @ [157:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendConditionWithSubjectRemoved' @ [158:21] ==> private fun BuilderByPattern<KtExpression>.appendConditionWithSubjectRemoved(conditionExpression: KtExpression?, subject: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations[SimpleFunctionDescriptorImpl]

'rhs' @ [158:55] ==> val rhs: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[LocalVariableDescriptor]

'subject' @ [158:60] ==> value-parameter subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.appendConditionWithSubjectRemoved[ValueParameterDescriptorImpl]

'IllegalStateException' @ [160:31] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [164:23] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'when (conditions.size) {
    0 -> null
    1 -> conditions[0].toExpression(subject)
    else -> buildExpression {
        appendExpressions(conditions.map { it.toExpression(subject) }, separator = "||")
    }
}' @ [168:102] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'conditions' @ [168:108] ==> value-parameter conditions: Array<KtWhenCondition> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions[ValueParameterDescriptorImpl]

'size' @ [168:119] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'conditions' @ [170:10] ==> value-parameter conditions: Array<KtWhenCondition> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions[ValueParameterDescriptorImpl]

'toExpression' @ [170:24] ==> public fun KtWhenCondition.toExpression(subject: KtExpression?): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'subject' @ [170:37] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions[ValueParameterDescriptorImpl]

'buildExpression' @ [171:13] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpressions' @ [172:9] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'conditions' @ [172:27] ==> value-parameter conditions: Array<KtWhenCondition> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions[ValueParameterDescriptorImpl]

'map' @ [172:38] ==> public inline fun <T, R> Array<out KtWhenCondition>.map(transform: (KtWhenCondition) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenCondition
    <R> -> KtExpression

'it' @ [172:44] ==> value-parameter it: KtWhenCondition defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toExpression' @ [172:47] ==> public fun KtWhenCondition.toExpression(subject: KtExpression?): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'subject' @ [172:60] ==> value-parameter subject: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.combineWhenConditions[ValueParameterDescriptorImpl]

