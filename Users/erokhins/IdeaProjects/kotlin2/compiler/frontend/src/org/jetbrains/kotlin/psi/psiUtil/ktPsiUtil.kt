'calleeExpression' @ [46:28] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when (calleeExpression) {
        is KtSimpleNameExpression -> calleeExpression
        is KtConstructorCalleeExpression -> calleeExpression.constructorReferenceExpression
        else -> null
    }' @ [48:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameExpression?, entry1: KtSimpleNameExpression?, entry2: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameExpression?

'calleeExpression' @ [48:18] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getCallNameExpression[LocalVariableDescriptor]

'calleeExpression' @ [49:38] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getCallNameExpression[LocalVariableDescriptor]

'calleeExpression' @ [50:45] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getCallNameExpression[LocalVariableDescriptor]

'constructorReferenceExpression' @ [50:62] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'?:' @ [60:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtReferenceExpression?, right: KtReferenceExpression): KtReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtReferenceExpression

'parent' @ [60:27] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [60:59] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[ReceiverParameterDescriptorImpl]

'baseExpression' @ [61:18] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'parent' @ [61:33] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtQualifiedExpression -> if (parent.selectorExpression == baseExpression) parent else baseExpression
        is KtUserType -> if (parent.referenceExpression == baseExpression) parent else baseExpression
        else -> baseExpression
    }' @ [62:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement, entry1: KtElement, entry2: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement

'parent' @ [62:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'if (parent.selectorExpression == baseExpression) parent else baseExpression' @ [63:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'parent' @ [63:41] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'selectorExpression' @ [63:48] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'baseExpression' @ [63:70] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'parent' @ [63:86] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'baseExpression' @ [63:98] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'if (parent.referenceExpression == baseExpression) parent else baseExpression' @ [64:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'parent' @ [64:30] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'referenceExpression' @ [64:37] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'baseExpression' @ [64:60] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'parent' @ [64:76] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'baseExpression' @ [64:88] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'baseExpression' @ [65:17] ==> val baseExpression: KtReferenceExpression defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElement[LocalVariableDescriptor]

'parent' @ [70:18] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [71:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementOrCallableRef[LocalVariableDescriptor]

'parent' @ [71:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementOrCallableRef[LocalVariableDescriptor]

'callableReference' @ [71:59] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'this' @ [71:80] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementOrCallableRef[ReceiverParameterDescriptorImpl]

'parent' @ [71:93] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementOrCallableRef[LocalVariableDescriptor]

'getQualifiedElement' @ [73:12] ==> public fun KtSimpleNameExpression.getQualifiedElement(): KtElement defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'generateSequence' @ [77:12] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: KtExpression?, nextFunction: (KtExpression) -> KtExpression?): Sequence<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtExpression

'this' @ [77:43] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentQualifiedExpressionForSelector[ReceiverParameterDescriptorImpl]

'it' @ [78:31] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentQualifiedExpressionForSelector.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [78:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parentQualified?.selectorExpression == it) parentQualified else null' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'parentQualified' @ [79:13] ==> val parentQualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentQualifiedExpressionForSelector.<anonymous>[LocalVariableDescriptor]

'selectorExpression' @ [79:30] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'it' @ [79:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentQualifiedExpressionForSelector.<anonymous>[ValueParameterDescriptorImpl]

'parentQualified' @ [79:56] ==> val parentQualified: KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getTopmostParentQualifiedExpressionForSelector.<anonymous>[LocalVariableDescriptor]

'last' @ [80:7] ==> public fun <T> Sequence<KtExpression>.last(): KtExpression defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'when (this) {
        is KtSimpleNameExpression -> this
        is KtCallExpression -> calleeExpression
        is KtQualifiedExpression -> {
            val selector = selectorExpression
            (selector as? KtCallExpression)?.calleeExpression ?: selector
        }
        is KtUserType -> referenceExpression
        else -> null
    }' @ [87:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?, entry3: KtElement?, entry4: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'this' @ [87:18] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementSelector[ReceiverParameterDescriptorImpl]

'this' @ [88:38] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementSelector[ReceiverParameterDescriptorImpl]

'calleeExpression' @ [89:32] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'selectorExpression' @ [91:28] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'?:' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement?

'selector' @ [92:14] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementSelector[LocalVariableDescriptor]

'calleeExpression' @ [92:46] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'selector' @ [92:66] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementSelector[LocalVariableDescriptor]

'referenceExpression' @ [94:26] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'parent' @ [100:18] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
        parent is KtQualifiedExpression -> {
            val receiverExpression = parent.receiverExpression
            // Name expression can't be receiver for itself
            if (receiverExpression != this) {
                return receiverExpression
            }
        }
        parent is KtCallExpression -> {
            //This is in case `a().b()`
            val grandParent = parent.parent
            if (grandParent is KtQualifiedExpression) {
                val parentsReceiver = grandParent.receiverExpression
                if (parentsReceiver != parent) {
                    return parentsReceiver
                }
            }
        }
        parent is KtBinaryExpression && parent.operationReference == this -> {
            return if (parent.operationToken in OperatorConventions.IN_OPERATIONS) parent.right else parent.left
        }
        parent is KtUnaryExpression && parent.operationReference == this -> {
            return parent.baseExpression
        }
        parent is KtUserType -> {
            val qualifier = parent.qualifier
            if (qualifier != null) {
                return qualifier.referenceExpression!!
            }
        }
    }' @ [101:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [102:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [103:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'receiverExpression' @ [103:45] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'receiverExpression' @ [105:17] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'this' @ [105:39] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [106:24] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [109:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [111:31] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [111:38] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'grandParent' @ [112:17] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'grandParent' @ [113:39] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'receiverExpression' @ [113:51] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'parentsReceiver' @ [114:21] ==> val parentsReceiver: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [114:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parentsReceiver' @ [115:28] ==> val parentsReceiver: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [119:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [119:41] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'operationReference' @ [119:48] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'this' @ [119:70] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[ReceiverParameterDescriptorImpl]

'if (parent.operationToken in OperatorConventions.IN_OPERATIONS) parent.right else parent.left' @ [120:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'parent' @ [120:24] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'operationToken' @ [120:31] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'IN_OPERATIONS' @ [120:69] ==> public final val IN_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'parent' @ [120:84] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'right' @ [120:91] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'parent' @ [120:102] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'left' @ [120:109] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'parent' @ [122:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [122:40] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'operationReference' @ [122:47] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'this' @ [122:69] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[ReceiverParameterDescriptorImpl]

'parent' @ [123:20] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'baseExpression' @ [123:27] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'parent' @ [125:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'parent' @ [126:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'qualifier' @ [126:36] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'qualifier' @ [127:17] ==> val qualifier: KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'qualifier' @ [128:24] ==> val qualifier: KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression[LocalVariableDescriptor]

'referenceExpression' @ [128:34] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'parent' @ [137:18] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtQualifiedExpression && parent.selectorExpression == this) parent else null' @ [138:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtQualifiedExpression?, elseBranch: KtQualifiedExpression?): KtQualifiedExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtQualifiedExpression?

'parent' @ [138:16] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelector[LocalVariableDescriptor]

'parent' @ [138:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelector[LocalVariableDescriptor]

'selectorExpression' @ [138:58] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'this' @ [138:80] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelector[ReceiverParameterDescriptorImpl]

'parent' @ [138:86] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelector[LocalVariableDescriptor]

'getQualifiedExpressionForSelector' @ [142:12] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [142:51] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelectorOrThis[ReceiverParameterDescriptorImpl]

'parent' @ [146:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtQualifiedExpression && parent.receiverExpression == this) parent else null' @ [147:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtQualifiedExpression?, elseBranch: KtQualifiedExpression?): KtQualifiedExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtQualifiedExpression?

'parent' @ [147:16] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForReceiver[LocalVariableDescriptor]

'parent' @ [147:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForReceiver[LocalVariableDescriptor]

'receiverExpression' @ [147:58] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'this' @ [147:80] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForReceiver[ReceiverParameterDescriptorImpl]

'parent' @ [147:86] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForReceiver[LocalVariableDescriptor]

'getQualifiedExpressionForReceiver' @ [151:12] ==> public fun KtExpression.getQualifiedExpressionForReceiver(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [151:51] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForReceiverOrThis[ReceiverParameterDescriptorImpl]

'==' @ [155:9] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'parent' @ [155:10] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverExpression' @ [155:48] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'this' @ [155:70] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isDotReceiver[ReceiverParameterDescriptorImpl]

'if (this is KtBlockExpression) statements.asSequence() else sequenceOf(this)' @ [160:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<KtElement>, elseBranch: Sequence<KtElement>): Sequence<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<KtElement>

'this' @ [160:13] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.blockExpressionsOrSingle[ReceiverParameterDescriptorImpl]

'statements' @ [160:40] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'asSequence' @ [160:51] ==> public fun <T> Iterable<(KtExpression..KtExpression?)>.asSequence(): Sequence<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'sequenceOf' @ [160:69] ==> public fun <T> sequenceOf(vararg elements: KtElement): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'this' @ [160:80] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.blockExpressionsOrSingle[ReceiverParameterDescriptorImpl]

'?:' @ [163:11] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'this' @ [163:12] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.lastBlockStatementOrThis[ReceiverParameterDescriptorImpl]

'statements' @ [163:41] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [163:53] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'this' @ [163:69] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.lastBlockStatementOrThis[ReceiverParameterDescriptorImpl]

'lBrace' @ [166:18] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'nextSibling' @ [166:26] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'firstChild' @ [166:41] ==> public final val KtBlockExpression.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [167:15] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [168:15] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [168:29] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.contentRange.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [169:18] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'first' @ [170:9] ==> val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'rBrace' @ [170:18] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'PsiChildRange' @ [170:33] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'EMPTY' @ [170:47] ==> public final val EMPTY: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[PropertyDescriptorImpl]

'rBrace' @ [171:16] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'siblings' @ [172:14] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'first' @ [173:14] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [173:22] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.contentRange.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [174:9] ==> val last: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'lBrace' @ [174:17] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'PsiChildRange' @ [174:32] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'EMPTY' @ [174:46] ==> public final val EMPTY: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[PropertyDescriptorImpl]

'PsiChildRange' @ [175:12] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'first' @ [175:26] ==> val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'last' @ [175:33] ==> val last: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.contentRange[LocalVariableDescriptor]

'isInterface' @ [180:37] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'hasModifier' @ [180:54] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [180:75] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'result' @ [190:9] ==> value-parameter result: MutableList<String> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[ValueParameterDescriptorImpl]

'add' @ [190:16] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'referencedName' @ [190:20] ==> value-parameter referencedName: String defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[ValueParameterDescriptorImpl]

'containingFile' @ [192:20] ==> public final val <T : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>.containingFile: PsiFile[MyPropertyDescriptor]
Inferred types:
    <T : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> Captured(out KotlinClassOrObjectStub<out KtClassOrObject>)

'file' @ [193:13] ==> val file: PsiFile defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'file' @ [194:29] ==> val file: PsiFile defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'findImportByAlias' @ [194:34] ==> @Nullable public open fun findImportByAlias(@NotNull name: String): KtImportDirective? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'referencedName' @ [194:52] ==> value-parameter referencedName: String defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[ValueParameterDescriptorImpl]

'directive' @ [195:17] ==> val directive: KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'directive' @ [196:33] ==> val directive: KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'importedReference' @ [196:43] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'reference' @ [197:24] ==> var reference: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'reference' @ [198:21] ==> var reference: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'reference' @ [198:33] ==> var reference: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'selectorExpression' @ [198:43] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'reference' @ [200:21] ==> var reference: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'result' @ [201:21] ==> value-parameter result: MutableList<String> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[ValueParameterDescriptorImpl]

'add' @ [201:28] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'reference' @ [201:32] ==> var reference: KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames.addSuperName[LocalVariableDescriptor]

'getReferencedName' @ [201:42] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'require' @ [207:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [207:13] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[ReceiverParameterDescriptorImpl]

'this' @ [207:94] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[ReceiverParameterDescriptorImpl]

'java' @ [207:106] ==> public val <T> KClass<out StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>>.java: Class<out StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>)

'name' @ [207:111] ==> public final val <T : (Any..Any?)> Class<out StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>)

'stub' @ [209:16] ==> public final val <T : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> StubBasedPsiElementBase<out KotlinClassOrObjectStub<out KtClassOrObject>>.stub: KotlinClassOrObjectStub<out KtClassOrObject>?[MyPropertyDescriptor]
Inferred types:
    <T : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> Captured(out KotlinClassOrObjectStub<out KtClassOrObject>)

'stub' @ [210:9] ==> val stub: KotlinClassOrObjectStub<out KtClassOrObject>? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'stub' @ [211:16] ==> val stub: KotlinClassOrObjectStub<out KtClassOrObject>? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'getSuperNames' @ [211:21] ==> public abstract fun getSuperNames(): List<String> defined in org.jetbrains.kotlin.psi.stubs.KotlinClassOrObjectStub[SimpleFunctionDescriptorImpl]

'this' @ [214:23] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[ReceiverParameterDescriptorImpl]

'superTypeListEntries' @ [214:48] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'specifiers' @ [215:9] ==> val specifiers: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'isEmpty' @ [215:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [215:50] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ArrayList' @ [217:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'specifiers' @ [218:23] ==> val specifiers: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'specifier' @ [219:25] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'typeAsUserType' @ [219:35] ==> public final val KtSuperTypeListEntry.typeAsUserType: KtUserType?[MyPropertyDescriptor]

'superType' @ [220:13] ==> val superType: KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'superType' @ [221:34] ==> val superType: KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'referencedName' @ [221:44] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'referencedName' @ [222:17] ==> val referencedName: String? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'addSuperName' @ [223:17] ==> local final fun addSuperName(result: MutableList<String>, referencedName: String): Unit defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[SimpleFunctionDescriptorImpl]

'result' @ [223:30] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'referencedName' @ [223:38] ==> val referencedName: String? defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'result' @ [228:12] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.psi.psiUtil.getSuperNames[LocalVariableDescriptor]

'parent' @ [235:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtAnnotatedExpression -> parent.annotationEntries
        is KtLabeledExpression -> parent.getAnnotationEntries()
        else -> emptyList<KtAnnotationEntry>()
    }' @ [236:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtAnnotationEntry>, entry1: List<KtAnnotationEntry>, entry2: List<KtAnnotationEntry>): List<KtAnnotationEntry>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtAnnotationEntry>

'parent' @ [236:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getAnnotationEntries[LocalVariableDescriptor]

'parent' @ [237:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getAnnotationEntries[LocalVariableDescriptor]

'annotationEntries' @ [237:44] ==> public final val KtAnnotatedExpression.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'parent' @ [238:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.getAnnotationEntries[LocalVariableDescriptor]

'getAnnotationEntries' @ [238:42] ==> public fun KtExpression.getAnnotationEntries(): List<KtAnnotationEntry> defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [239:17] ==> public fun <T> emptyList(): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'when (this) {
        is StubBasedPsiElementBase<*> -> getStub()?.collectAnnotationEntriesFromStubElement() ?: collectAnnotationEntriesFromPsi()
        else -> collectAnnotationEntriesFromPsi()
    }' @ [244:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtAnnotationEntry>, entry1: List<KtAnnotationEntry>): List<KtAnnotationEntry>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtAnnotationEntry>

'this' @ [244:18] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromStubOrPsi[ReceiverParameterDescriptorImpl]

'getStub' @ [245:42] ==> @Nullable public open fun getStub(): raw (StubElement<(PsiElement..PsiElement?)>?..StubElement<*>?) defined in com.intellij.extapi.psi.StubBasedPsiElementBase[JavaMethodDescriptor]

'collectAnnotationEntriesFromStubElement' @ [245:53] ==> private fun StubElement<*>.collectAnnotationEntriesFromStubElement(): List<KtAnnotationEntry> defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'collectAnnotationEntriesFromPsi' @ [245:98] ==> private fun KtAnnotationsContainer.collectAnnotationEntriesFromPsi(): List<KtAnnotationEntry> defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'collectAnnotationEntriesFromPsi' @ [246:17] ==> private fun KtAnnotationsContainer.collectAnnotationEntriesFromPsi(): List<KtAnnotationEntry> defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'childrenStubs' @ [251:12] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<out (PsiElement..PsiElement?)>.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> Captured(*)

'flatMap' @ [251:26] ==> public inline fun <T, R> Iterable<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>.flatMap(transform: (raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)) -> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>): List<(KtAnnotationEntry..KtAnnotationEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.psi.stubs.StubElement<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..com.intellij.psi.stubs.StubElement<*>?)
    <R> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'when (child.stubType) {
            KtNodeTypes.ANNOTATION_ENTRY -> listOf(child.psi as KtAnnotationEntry)
            KtNodeTypes.ANNOTATION -> (child.psi as KtAnnotation).entries
            else -> emptyList<KtAnnotationEntry>()
        }' @ [253:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?), entry1: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?), entry2: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)): (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.List<(org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)>?)

'child' @ [253:15] ==> value-parameter child: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromStubElement.<anonymous>[ValueParameterDescriptorImpl]

'stubType' @ [253:21] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.stubType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'ANNOTATION_ENTRY' @ [254:25] ==> public final val ANNOTATION_ENTRY: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'listOf' @ [254:45] ==> public fun <T> listOf(element: KtAnnotationEntry): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'child' @ [254:52] ==> value-parameter child: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromStubElement.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [254:58] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'ANNOTATION' @ [255:25] ==> public final val ANNOTATION: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'child' @ [255:40] ==> value-parameter child: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromStubElement.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [255:46] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'entries' @ [255:67] ==> public final val KtAnnotation.entries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)[MyPropertyDescriptor]

'emptyList' @ [256:21] ==> public fun <T> emptyList(): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'children' @ [262:12] ==> public final val KtAnnotationsContainer.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'flatMap' @ [262:21] ==> public inline fun <T, R> Array<out (PsiElement..PsiElement?)>.flatMap(transform: ((PsiElement..PsiElement?)) -> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>): List<(KtAnnotationEntry..KtAnnotationEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'when (child) {
            is KtAnnotationEntry -> listOf(child)
            is KtAnnotation -> child.entries
            else -> emptyList<KtAnnotationEntry>()
        }' @ [263:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?), entry1: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?), entry2: (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)): (List<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.List<(org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)>?)

'child' @ [263:15] ==> value-parameter child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromPsi.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [264:37] ==> public fun <T> listOf(element: KtAnnotationEntry): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'child' @ [264:44] ==> value-parameter child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromPsi.<anonymous>[ValueParameterDescriptorImpl]

'child' @ [265:32] ==> value-parameter child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.collectAnnotationEntriesFromPsi.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [265:38] ==> public final val KtAnnotation.entries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>?)[MyPropertyDescriptor]

'emptyList' @ [266:21] ==> public fun <T> emptyList(): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'KtTreeVisitorVoid' @ [276:21] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [278:13] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfTypeVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [278:19] ==> public open fun visitKtElement(@NotNull element: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'element' @ [278:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfTypeVisitor.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'element' @ [279:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfTypeVisitor.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'invoke' @ [280:17] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [280:23] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.psiUtil.forEachDescendantOfTypeVisitor.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'forEachDescendantOfTypeVisitor' @ [287:12] ==> public inline fun <reified T : KtElement> forEachDescendantOfTypeVisitor(noinline block: (T) -> Unit): KtVisitorVoid defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtElement> -> T

'accumulator' @ [287:48] ==> value-parameter accumulator: MutableCollection<R> defined in org.jetbrains.kotlin.psi.psiUtil.flatMapDescendantsOfTypeVisitor[ValueParameterDescriptorImpl]

'addAll' @ [287:60] ==> public abstract fun addAll(elements: Collection<R>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'invoke' @ [287:67] ==> public abstract operator fun invoke(p1: T): Collection<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [287:71] ==> value-parameter it: T defined in org.jetbrains.kotlin.psi.psiUtil.flatMapDescendantsOfTypeVisitor.<anonymous>[ValueParameterDescriptorImpl]

'when(this) {
        is KtClass -> getDeclarations() + getPrimaryConstructorParameters().filter { p -> p.hasValOrVar() }
        else -> declarations
    }' @ [293:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtDeclaration>, entry1: List<KtDeclaration>): List<KtDeclaration>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtDeclaration>

'this' @ [293:17] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.effectiveDeclarations[ReceiverParameterDescriptorImpl]

'getDeclarations' @ [294:23] ==> public open fun getDeclarations(): List<KtDeclaration> defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'getPrimaryConstructorParameters' @ [294:43] ==> public open fun getPrimaryConstructorParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'filter' @ [294:77] ==> public inline fun <T> Iterable<KtParameter>.filter(predicate: (KtParameter) -> Boolean): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'p' @ [294:91] ==> value-parameter p: KtParameter defined in org.jetbrains.kotlin.psi.psiUtil.effectiveDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [294:93] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'declarations' @ [295:17] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'when (this) {
        is KtNamedFunction, is KtProperty -> this as KtCallableDeclaration
        is KtPropertyAccessor -> getNonStrictParentOfType<KtProperty>()
        else -> null
    }' @ [300:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallableDeclaration?, entry1: KtCallableDeclaration?, entry2: KtCallableDeclaration?): KtCallableDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallableDeclaration?

'this' @ [300:50] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isExtensionDeclaration[ReceiverParameterDescriptorImpl]

'this' @ [301:46] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isExtensionDeclaration[ReceiverParameterDescriptorImpl]

'getNonStrictParentOfType' @ [302:34] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'callable' @ [306:12] ==> val callable: KtCallableDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil.isExtensionDeclaration[LocalVariableDescriptor]

'receiverTypeReference' @ [306:22] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'this' @ [309:50] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isObjectLiteral[ReceiverParameterDescriptorImpl]

'isObjectLiteral' @ [309:81] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'parent' @ [313:18] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
        this is KtParameter && parent is KtParameterList -> parent.parameters.indexOf(this)
        this is PsiParameter && parent is PsiParameterList -> parent.getParameterIndex(this)
        else -> -1
    }' @ [314:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'this' @ [315:9] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[ReceiverParameterDescriptorImpl]

'parent' @ [315:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[LocalVariableDescriptor]

'parent' @ [315:61] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[LocalVariableDescriptor]

'parameters' @ [315:68] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [315:79] ==> public abstract fun indexOf(element: (KtParameter..KtParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [315:87] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[ReceiverParameterDescriptorImpl]

'this' @ [316:9] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[ReceiverParameterDescriptorImpl]

'parent' @ [316:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[LocalVariableDescriptor]

'parent' @ [316:63] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[LocalVariableDescriptor]

'getParameterIndex' @ [316:70] ==> public abstract fun getParameterIndex(@NotNull p0: PsiParameter): Int defined in com.intellij.psi.PsiParameterList[JavaMethodDescriptor]

'this' @ [316:88] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.parameterIndex[ReceiverParameterDescriptorImpl]

'-' @ [317:17] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'hasModifier' @ [321:48] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [321:69] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasModifier' @ [323:50] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [323:71] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [326:18] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [327:12] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isImportDirectiveExpression[LocalVariableDescriptor]

'parent' @ [327:43] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isImportDirectiveExpression[LocalVariableDescriptor]

'parent' @ [327:50] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [331:18] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [332:12] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isPackageDirectiveExpression[LocalVariableDescriptor]

'parent' @ [332:44] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isPackageDirectiveExpression[LocalVariableDescriptor]

'parent' @ [332:51] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parents' @ [336:12] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'takeWhile' @ [336:20] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [336:32] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isInImportDirective.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [336:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isInImportDirective.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [336:83] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [336:89] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isInImportDirective.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [340:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtLambdaArgument -> true
        is KtLabeledExpression -> parent.isLambdaOutsideParentheses()
        else -> false
    }' @ [341:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [341:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isLambdaOutsideParentheses[LocalVariableDescriptor]

'parent' @ [343:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isLambdaOutsideParentheses[LocalVariableDescriptor]

'isLambdaOutsideParentheses' @ [343:42] ==> public fun KtExpression.isLambdaOutsideParentheses(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'parent' @ [349:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (KtPsiUtil.isAssignment(parent) && parent.left == this) parent else null' @ [350:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBinaryExpression?, elseBranch: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBinaryExpression?

'isAssignment' @ [350:26] ==> public open fun isAssignment(@NotNull element: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parent' @ [350:39] ==> val parent: KtBinaryExpression defined in org.jetbrains.kotlin.psi.psiUtil.getAssignmentByLHS[LocalVariableDescriptor]

'parent' @ [350:50] ==> val parent: KtBinaryExpression defined in org.jetbrains.kotlin.psi.psiUtil.getAssignmentByLHS[LocalVariableDescriptor]

'left' @ [350:57] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'this' @ [350:65] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getAssignmentByLHS[ReceiverParameterDescriptorImpl]

'parent' @ [350:71] ==> val parent: KtBinaryExpression defined in org.jetbrains.kotlin.psi.psiUtil.getAssignmentByLHS[LocalVariableDescriptor]

'node' @ [354:17] ==> public final val KtStringTemplateExpression.node: ASTNode[MyPropertyDescriptor]

'firstChildNode' @ [354:22] ==> public final val ASTNode.firstChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'textLength' @ [354:37] ==> public final val ASTNode.textLength: Int[MyPropertyDescriptor]

'node' @ [355:21] ==> public final val KtStringTemplateExpression.node: ASTNode[MyPropertyDescriptor]

'lastChildNode' @ [355:26] ==> public final val ASTNode.lastChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'textLength' @ [356:18] ==> public final val KtStringTemplateExpression.textLength: Int[MyPropertyDescriptor]

'TextRange' @ [357:12] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'start' @ [357:22] ==> val start: Int defined in org.jetbrains.kotlin.psi.psiUtil.getContentRange[LocalVariableDescriptor]

'if (lastChild.elementType == KtTokens.CLOSING_QUOTE) length - lastChild.textLength else length' @ [357:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'lastChild' @ [357:33] ==> val lastChild: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.psi.psiUtil.getContentRange[LocalVariableDescriptor]

'elementType' @ [357:43] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'CLOSING_QUOTE' @ [357:67] ==> public final val CLOSING_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'length' @ [357:82] ==> val length: Int defined in org.jetbrains.kotlin.psi.psiUtil.getContentRange[LocalVariableDescriptor]

'lastChild' @ [357:91] ==> val lastChild: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.psi.psiUtil.getContentRange[LocalVariableDescriptor]

'textLength' @ [357:101] ==> public final val ASTNode.textLength: Int[MyPropertyDescriptor]

'length' @ [357:117] ==> val length: Int defined in org.jetbrains.kotlin.psi.psiUtil.getContentRange[LocalVariableDescriptor]

'parent' @ [365:18] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtCallElement -> parent.calleeExpression == this
        is KtBinaryExpression -> parent.operationReference == this
        else -> {
            val callElement =
                    getStrictParentOfType<KtUserType>()
                    ?.getStrictParentOfType<KtTypeReference>()
                    ?.getStrictParentOfType<KtConstructorCalleeExpression>()
                    ?.getStrictParentOfType<KtCallElement>()

            if (callElement != null) {
                val ktConstructorCalleeExpression = callElement.calleeExpression as? KtConstructorCalleeExpression
                (ktConstructorCalleeExpression?.typeReference?.typeElement as? KtUserType)?.referenceExpression == this
            }
            else {
                false
            }
        }
    }' @ [366:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [366:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'parent' @ [367:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'calleeExpression' @ [367:36] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [367:56] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[ReceiverParameterDescriptorImpl]

'parent' @ [368:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'operationReference' @ [368:41] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'this' @ [368:63] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[ReceiverParameterDescriptorImpl]

'getStrictParentOfType' @ [371:21] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'getStrictParentOfType' @ [372:23] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'getStrictParentOfType' @ [373:23] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtConstructorCalleeExpression

'getStrictParentOfType' @ [374:23] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'if (callElement != null) {
                val ktConstructorCalleeExpression = callElement.calleeExpression as? KtConstructorCalleeExpression
                (ktConstructorCalleeExpression?.typeReference?.typeElement as? KtUserType)?.referenceExpression == this
            }
            else {
                false
            }' @ [376:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'callElement' @ [376:17] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'callElement' @ [377:53] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'calleeExpression' @ [377:65] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'==' @ [378:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'ktConstructorCalleeExpression' @ [378:18] ==> val ktConstructorCalleeExpression: KtConstructorCalleeExpression? defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[LocalVariableDescriptor]

'typeReference' @ [378:49] ==> public final val KtConstructorCalleeExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [378:64] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'referenceExpression' @ [378:93] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'this' @ [378:116] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isCallee[ReceiverParameterDescriptorImpl]

'getContentRange' @ [388:13] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'substring' @ [388:31] ==> @NotNull public open fun substring(@NotNull p0: String): String defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'text' @ [388:41] ==> public final val KtStringTemplateExpression.text: (String..String?)[MyPropertyDescriptor]

'node' @ [391:11] ==> public final val KtStringTemplateExpression.node: ASTNode[MyPropertyDescriptor]

'firstChildNode' @ [391:16] ==> public final val ASTNode.firstChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'textLength' @ [391:31] ==> public final val ASTNode.textLength: Int[MyPropertyDescriptor]

'getValueParameterList' @ [394:12] ==> public fun KtNamedDeclaration.getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'parameters' @ [394:37] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'emptyList' @ [394:63] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'when (this) {
        is KtCallableDeclaration -> valueParameterList
        is KtClass -> getPrimaryConstructorParameterList()
        else -> null
    }' @ [398:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtParameterList?, entry1: KtParameterList?, entry2: KtParameterList?): KtParameterList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtParameterList?

'this' @ [398:18] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getValueParameterList[ReceiverParameterDescriptorImpl]

'valueParameterList' @ [399:37] ==> public final val KtCallableDeclaration.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'getPrimaryConstructorParameterList' @ [400:23] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'parent' @ [406:26] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [407:24] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.psi.psiUtil.getLambdaArgumentName[LocalVariableDescriptor]

'getResolvedCall' @ [407:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [407:55] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.psi.psiUtil.getLambdaArgumentName[ValueParameterDescriptorImpl]

'resolvedCall' @ [408:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi.psiUtil.getLambdaArgumentName[LocalVariableDescriptor]

'getArgumentMapping' @ [408:27] ==> @NotNull public abstract fun getArgumentMapping(@NotNull valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'this' @ [408:46] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getLambdaArgumentName[ReceiverParameterDescriptorImpl]

'valueParameter' @ [408:72] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'name' @ [408:88] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'if (KtPsiUtil.isAssignment(this)) this as KtBinaryExpression else null' @ [412:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBinaryExpression?, elseBranch: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBinaryExpression?

'isAssignment' @ [412:23] ==> public open fun isAssignment(@NotNull element: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [412:36] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.asAssignment[ReceiverParameterDescriptorImpl]

'this' @ [412:43] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.asAssignment[ReceiverParameterDescriptorImpl]

'modifierList' @ [415:24] ==> public final val KtDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'set' @ [416:12] ==> value-parameter set: TokenSet defined in org.jetbrains.kotlin.psi.psiUtil.modifierFromTokenSet[ValueParameterDescriptorImpl]

'types' @ [416:16] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'asSequence' @ [417:14] ==> public fun <T> Array<out (IElementType..IElementType?)>.asSequence(): Sequence<(IElementType..IElementType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'map' @ [418:14] ==> public fun <T, R> Sequence<(IElementType..IElementType?)>.map(transform: ((IElementType..IElementType?)) -> PsiElement?): Sequence<PsiElement?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)
    <R> -> PsiElement?

'modifierList' @ [418:20] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.psi.psiUtil.modifierFromTokenSet[LocalVariableDescriptor]

'getModifier' @ [418:33] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'it' @ [418:45] ==> value-parameter it: (IElementType..IElementType?) defined in org.jetbrains.kotlin.psi.psiUtil.modifierFromTokenSet.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [419:14] ==> public inline fun <T> Sequence<PsiElement?>.firstOrNull(predicate: (PsiElement?) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'it' @ [419:28] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.modifierFromTokenSet.<anonymous>[ValueParameterDescriptorImpl]

'modifierFromTokenSet' @ [423:42] ==> private fun KtDeclaration.modifierFromTokenSet(set: TokenSet): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'VISIBILITY_MODIFIERS' @ [423:72] ==> public final val VISIBILITY_MODIFIERS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'visibilityModifier' @ [426:11] ==> public fun KtDeclaration.visibilityModifier(): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'node' @ [426:33] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [426:39] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'create' @ [428:43] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [429:18] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [429:45] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SEALED_KEYWORD' @ [429:69] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [429:94] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifierFromTokenSet' @ [432:40] ==> private fun KtDeclaration.modifierFromTokenSet(set: TokenSet): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'MODALITY_MODIFIERS' @ [432:61] ==> private val MODALITY_MODIFIERS: TokenSet defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[PropertyDescriptorImpl]

'entries' @ [434:44] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'all' @ [434:52] ==> public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.all(predicate: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'it' @ [434:58] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.psiUtil.isPlain.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [435:55] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'all' @ [435:63] ==> public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.all(predicate: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'it' @ [435:69] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.psiUtil.isPlainWithEscapes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [435:107] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi.psiUtil.isPlainWithEscapes.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [440:17] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [440:24] ==> @InlineOnly public inline fun <T, R> (PsiElement..PsiElement?).let(block: ((PsiElement..PsiElement?)) -> KtClassOrObject?): KtClassOrObject? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> KtClassOrObject?

'when (it) {
                is KtClassBody -> it.parent as? KtClassOrObject
                is KtClassOrObject -> it
                is KtParameterList -> (it.parent as? KtPrimaryConstructor)?.getContainingClassOrObject()
                else -> null
            }' @ [441:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtClassOrObject?, entry1: KtClassOrObject?, entry2: KtClassOrObject?, entry3: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtClassOrObject?

'it' @ [441:19] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-containingClassOrObject>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [442:35] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-containingClassOrObject>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [442:38] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [443:39] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-containingClassOrObject>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [444:40] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.<get-containingClassOrObject>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [444:43] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getContainingClassOrObject' @ [444:77] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'?:' @ [450:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'parentsWithSelf' @ [450:13] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'zip' @ [450:29] ==> public infix fun <T, R> Sequence<PsiElement>.zip(other: Sequence<PsiElement>): Sequence<Pair<PsiElement, PsiElement>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'parents' @ [450:33] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'firstOrNull' @ [450:43] ==> public inline fun <T> Sequence<Pair<PsiElement, PsiElement>>.firstOrNull(predicate: (Pair<PsiElement, PsiElement>) -> Boolean): Pair<PsiElement, PsiElement>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<PsiElement, PsiElement>

'component1' @ [451:14] ==> public final operator fun component1(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [451:23] ==> public final operator fun component2(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [451:33] ==> value-parameter it: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[ValueParameterDescriptorImpl]

'when (parent) {
            is KtParenthesizedExpression -> false
            is KtAnnotatedExpression -> parent.baseExpression != element
            is KtLabeledExpression -> parent.baseExpression != element
            else -> true
        }' @ [452:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [452:15] ==> val parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[LocalVariableDescriptor]

'parent' @ [454:41] ==> val parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[LocalVariableDescriptor]

'baseExpression' @ [454:48] ==> public final val KtAnnotatedExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [454:66] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[LocalVariableDescriptor]

'parent' @ [455:39] ==> val parent: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[LocalVariableDescriptor]

'baseExpression' @ [455:46] ==> public final val baseExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[PropertyDescriptorImpl]

'element' @ [455:64] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis.<anonymous>[LocalVariableDescriptor]

'first' @ [458:8] ==> public final val first: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'this' @ [458:34] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getOutermostParenthesizerOrThis[ReceiverParameterDescriptorImpl]

'this' @ [461:52] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isFunctionalExpression[ReceiverParameterDescriptorImpl]

'nameIdentifier' @ [461:79] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'Regex' @ [463:63] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'element' @ [466:21] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.canPlaceAfterSimpleNameEntry[ValueParameterDescriptorImpl]

'text' @ [466:30] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'!' @ [467:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'BAD_NEIGHBOUR_FOR_SIMPLE_TEMPLATE_ENTRY_PATTERN' @ [467:13] ==> private val BAD_NEIGHBOUR_FOR_SIMPLE_TEMPLATE_ENTRY_PATTERN: Regex defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[PropertyDescriptorImpl]

'matches' @ [467:61] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'entryText' @ [467:69] ==> val entryText: String defined in org.jetbrains.kotlin.psi.psiUtil.canPlaceAfterSimpleNameEntry[LocalVariableDescriptor]

'getPreviousWord' @ [471:15] ==> @Nullable public open fun getPreviousWord(@NotNull element: PsiElement, @NotNull word: String): PsiElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [471:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedPrefixWord[ValueParameterDescriptorImpl]

'word' @ [471:40] ==> value-parameter word: String defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedPrefixWord[ValueParameterDescriptorImpl]

'let' @ [471:47] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'sink' @ [472:9] ==> value-parameter sink: DiagnosticSink defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedPrefixWord[ValueParameterDescriptorImpl]

'report' @ [472:14] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'UNSUPPORTED' @ [472:28] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [472:40] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [472:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedPrefixWord.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [472:47] ==> value-parameter message: String defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedPrefixWord[ValueParameterDescriptorImpl]

'expression' @ [478:9] ==> value-parameter expression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[ValueParameterDescriptorImpl]

'getReferencedName' @ [478:21] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'expression' @ [480:22] ==> value-parameter expression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[ValueParameterDescriptorImpl]

'getIdentifier' @ [480:33] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'identifier' @ [482:9] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[LocalVariableDescriptor]

'node' @ [482:20] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [482:25] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [482:49] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'==' @ [482:63] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'identifier' @ [482:74] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[LocalVariableDescriptor]

'text' @ [482:85] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'sink' @ [483:9] ==> value-parameter sink: DiagnosticSink defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[ValueParameterDescriptorImpl]

'report' @ [483:14] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'YIELD_IS_RESERVED' @ [483:28] ==> public final val YIELD_IS_RESERVED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [483:46] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'identifier' @ [483:49] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYield[LocalVariableDescriptor]

'getPreviousWord' @ [490:15] ==> @Nullable public open fun getPreviousWord(@NotNull element: PsiElement, @NotNull word: String): PsiElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [490:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYieldBeforeLambda[ValueParameterDescriptorImpl]

'let' @ [490:50] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'sink' @ [491:9] ==> value-parameter sink: DiagnosticSink defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYieldBeforeLambda[ValueParameterDescriptorImpl]

'report' @ [491:14] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'YIELD_IS_RESERVED' @ [491:28] ==> public final val YIELD_IS_RESERVED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [491:46] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [491:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.checkReservedYieldBeforeLambda.<anonymous>[ValueParameterDescriptorImpl]

'MESSAGE_FOR_YIELD_BEFORE_LAMBDA' @ [491:53] ==> public val MESSAGE_FOR_YIELD_BEFORE_LAMBDA: String defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[PropertyDescriptorImpl]

'generateSequence' @ [496:12] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: KtClass?, nextFunction: (KtClass) -> KtClass?): Sequence<KtClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtClass

'containingClass' @ [496:29] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'if (it.isInner()) it.containingClass() else null' @ [496:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClass?, elseBranch: KtClass?): KtClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClass?

'it' @ [496:54] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.psi.psiUtil.nonStaticOuterClasses.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [496:57] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'it' @ [496:68] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.psi.psiUtil.nonStaticOuterClasses.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [496:71] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'getStrictParentOfType' @ [499:45] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtClass

'declarations' @ [502:12] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [502:25] ==> public inline fun <T> Iterable<KtDeclaration>.firstOrNull(predicate: (KtDeclaration) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [502:39] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [502:59] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [502:62] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'name' @ [502:70] ==> value-parameter name: String defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [503:15] ==> public final val KtClassOrObject.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'firstOrNull' @ [503:44] ==> public inline fun <T> Iterable<KtParameter>.firstOrNull(predicate: (KtParameter) -> Boolean): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'it' @ [503:58] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [503:61] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'it' @ [503:78] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [503:81] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'name' @ [503:89] ==> value-parameter name: String defined in org.jetbrains.kotlin.psi.psiUtil.findPropertyByName[ValueParameterDescriptorImpl]

'e' @ [507:18] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isTypeConstructorReference[ValueParameterDescriptorImpl]

'parent' @ [507:20] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [508:12] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isTypeConstructorReference[LocalVariableDescriptor]

'parent' @ [508:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.isTypeConstructorReference[LocalVariableDescriptor]

'referenceExpression' @ [508:43] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'e' @ [508:66] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.isTypeConstructorReference[ValueParameterDescriptorImpl]

'ownerFunction' @ [511:41] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'hasValOrVar' @ [511:82] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'expression' @ [513:55] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.isDoubleColonReceiver[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [513:66] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtDoubleColonExpression.() -> PsiElement?): KtDoubleColonExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtDoubleColonExpression

'this' @ [513:118] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.isDoubleColonReceiver.<anonymous>[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [513:123] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'valueParameterList' @ [516:5] ==> public final val KtFunctionLiteral.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'let' @ [516:25] ==> @InlineOnly public inline fun <T, R> KtParameterList.let(block: (KtParameterList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameterList
    <R> -> Nothing

'it' @ [516:38] ==> value-parameter it: KtParameterList defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [518:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [518:35] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[ReceiverParameterDescriptorImpl]

'lBrace' @ [520:18] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'addAfter' @ [521:28] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'psiFactory' @ [521:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'createLambdaParameterList' @ [521:48] ==> public final fun createLambdaParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'anchor' @ [521:80] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'newParameterList' @ [522:5] ==> val newParameterList: KtParameterList defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'removeParameter' @ [522:22] ==> public open fun removeParameter(index: Int): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'arrow' @ [523:9] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'psiFactory' @ [524:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'createWhitespaceAndArrow' @ [524:45] ==> public final fun createWhitespaceAndArrow(): Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'addRangeAfter' @ [525:9] ==> public open fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'whitespaceAndArrow' @ [525:23] ==> val whitespaceAndArrow: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'first' @ [525:42] ==> public final val first: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'whitespaceAndArrow' @ [525:49] ==> val whitespaceAndArrow: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'second' @ [525:68] ==> public final val second: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'newParameterList' @ [525:76] ==> val newParameterList: KtParameterList defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'newParameterList' @ [527:12] ==> val newParameterList: KtParameterList defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateParameterList[LocalVariableDescriptor]

'valueArgumentList' @ [531:5] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'let' @ [531:24] ==> @InlineOnly public inline fun <T, R> KtValueArgumentList.let(block: (KtValueArgumentList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgumentList
    <R> -> Nothing

'it' @ [531:37] ==> value-parameter it: KtValueArgumentList defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateValueArgumentList.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [532:12] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [532:21] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [532:34] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.getOrCreateValueArgumentList[ReceiverParameterDescriptorImpl]

'createCallArguments' @ [532:40] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'typeArgumentList' @ [533:21] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'calleeExpression' @ [533:41] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when (this) {
    is KtFunction -> hasBody()
    is KtProperty -> hasBody()
    else -> false
}' @ [536:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [536:37] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.hasBody[ReceiverParameterDescriptorImpl]

'hasBody' @ [537:22] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'hasBody' @ [538:22] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'if (this is KtCallExpression) calleeExpression else this' @ [544:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'this' @ [544:14] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.referenceExpression[ReceiverParameterDescriptorImpl]

'calleeExpression' @ [544:40] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [544:62] ==> <this> defined in org.jetbrains.kotlin.psi.psiUtil.referenceExpression[ReceiverParameterDescriptorImpl]

'parents' @ [547:5] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'forEach' @ [547:13] ==> public inline fun <T> Sequence<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (it) {
            is KtLabeledExpression -> if (it.getLabelName() == labelName) return it
            is KtParenthesizedExpression, is KtAnnotatedExpression, is KtLambdaExpression -> return@forEach
            else -> return null
        }' @ [548:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'it' @ [548:15] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getLabeledParent.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [549:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getLabeledParent.<anonymous>[ValueParameterDescriptorImpl]

'getLabelName' @ [549:46] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[SimpleFunctionDescriptorImpl]

'labelName' @ [549:64] ==> value-parameter labelName: String defined in org.jetbrains.kotlin.psi.psiUtil.getLabeledParent[ValueParameterDescriptorImpl]

'it' @ [549:82] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.getLabeledParent.<anonymous>[ValueParameterDescriptorImpl]

