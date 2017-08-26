'IntentionBasedInspection<KtCallExpression>' @ [24:40] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtCallExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallExpression

'ReplaceSingleLineLetIntention' @ [24:83] ==> public constructor ReplaceSingleLineLetIntention() defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[ClassConstructorDescriptorImpl]

'element' @ [25:64] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetInspection.inspectionTarget[ValueParameterDescriptorImpl]

'calleeExpression' @ [25:72] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'SelfTargetingOffsetIndependentIntention<KtCallExpression>' @ [28:39] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtCallExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtCallExpression

'KtCallExpression' @ [29:9] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [29:33] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'element' @ [33:9] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'lambdaArguments' @ [33:17] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [33:33] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [33:48] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [33:71] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'children' @ [33:87] ==> public final val KtBlockExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [33:97] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'let' @ [33:113] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'when (it) {
                is KtDotQualifiedExpression -> it.applyTo(element)
                is KtBinaryExpression -> it.applyTo(element)
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'it' @ [34:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [35:48] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'applyTo' @ [35:51] ==> private final fun KtDotQualifiedExpression.applyTo(element: KtCallExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'element' @ [35:59] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'it' @ [36:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'applyTo' @ [36:45] ==> private final fun KtBinaryExpression.applyTo(element: KtCallExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'element' @ [36:53] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'left' @ [42:20] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [43:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [43:36] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [43:44] ==> public final val KtCallExpression.project: Project[MyPropertyDescriptor]

'element' @ [44:22] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [44:30] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtQualifiedExpression -> {
                val receiver = parent.receiverExpression
                val newLeft = when (left) {
                    is KtDotQualifiedExpression -> left.replaceFirstReceiver(factory, receiver, parent is KtSafeQualifiedExpression)
                    else -> receiver
                }
                val newExpression = factory.createExpressionByPattern("$0 $1 $2", newLeft, operationReference, right!!)
                parent.replace(newExpression)
            }
            else -> {
                val newLeft = when (left) {
                    is KtDotQualifiedExpression -> left.deleteFirstReceiver()
                    else -> factory.createThisExpression()
                }
                val newExpression = factory.createExpressionByPattern("$0 $1 $2", newLeft, operationReference, right!!)
                element.replace(newExpression)
            }
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [45:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'parent' @ [47:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [47:39] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'when (left) {
                    is KtDotQualifiedExpression -> left.replaceFirstReceiver(factory, receiver, parent is KtSafeQualifiedExpression)
                    else -> receiver
                }' @ [48:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'left' @ [48:37] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'left' @ [49:52] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'replaceFirstReceiver' @ [49:57] ==> public fun KtDotQualifiedExpression.replaceFirstReceiver(factory: KtPsiFactory, newReceiver: KtExpression, safeAccess: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'factory' @ [49:78] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'receiver' @ [49:87] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'parent' @ [49:97] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'receiver' @ [50:29] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'factory' @ [52:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [52:45] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newLeft' @ [52:83] ==> val newLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'operationReference' @ [52:92] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'right' @ [52:112] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'parent' @ [53:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'replace' @ [53:24] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newExpression' @ [53:32] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'when (left) {
                    is KtDotQualifiedExpression -> left.deleteFirstReceiver()
                    else -> factory.createThisExpression()
                }' @ [56:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'left' @ [56:37] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'left' @ [57:52] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'deleteFirstReceiver' @ [57:57] ==> public fun KtDotQualifiedExpression.deleteFirstReceiver(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'factory' @ [58:29] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'createThisExpression' @ [58:37] ==> public final fun createThisExpression(): KtThisExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [60:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [60:45] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newLeft' @ [60:83] ==> val newLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'operationReference' @ [60:92] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'right' @ [60:112] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [61:17] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [61:25] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [61:33] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'element' @ [67:22] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [67:30] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtQualifiedExpression -> {
                val factory = KtPsiFactory(element.project)
                val receiver = parent.receiverExpression
                parent.replace(replaceFirstReceiver(factory, receiver, parent is KtSafeQualifiedExpression))
            }
            else -> {
                element.replace(deleteFirstReceiver())
            }
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [68:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [70:31] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [70:44] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [70:52] ==> public final val KtCallExpression.project: Project[MyPropertyDescriptor]

'parent' @ [71:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [71:39] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'parent' @ [72:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'replace' @ [72:24] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'replaceFirstReceiver' @ [72:32] ==> public fun KtDotQualifiedExpression.replaceFirstReceiver(factory: KtPsiFactory, newReceiver: KtExpression, safeAccess: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'factory' @ [72:53] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'receiver' @ [72:62] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'parent' @ [72:72] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[LocalVariableDescriptor]

'element' @ [75:17] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [75:25] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'deleteFirstReceiver' @ [75:33] ==> public fun KtDotQualifiedExpression.deleteFirstReceiver(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'!' @ [81:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [81:14] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isLetMethodCall' @ [81:22] ==> private final fun KtCallExpression.isLetMethodCall(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'element' @ [82:32] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lambdaArguments' @ [82:40] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [82:56] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [82:71] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'lambdaExpression' @ [83:29] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'getParameterName' @ [83:46] ==> private final fun KtLambdaExpression.getParameterName(): String? defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'lambdaExpression' @ [84:30] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'bodyExpression' @ [84:47] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'children' @ [84:63] ==> public final val KtBlockExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [84:73] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'when (bodyExpression) {
            is KtBinaryExpression -> element.parent !is KtSafeQualifiedExpression && bodyExpression.isApplicable(parameterName)
            is KtDotQualifiedExpression -> bodyExpression.isApplicable(parameterName)
            else -> false
        }' @ [86:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'bodyExpression' @ [86:22] ==> val bodyExpression: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [87:38] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [87:46] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'bodyExpression' @ [87:86] ==> val bodyExpression: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'isApplicable' @ [87:101] ==> private final fun KtBinaryExpression.isApplicable(parameterName: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'parameterName' @ [87:114] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'bodyExpression' @ [88:44] ==> val bodyExpression: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'isApplicable' @ [88:59] ==> private final fun KtDotQualifiedExpression.isApplicable(parameterName: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'parameterName' @ [88:72] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicableTo[LocalVariableDescriptor]

'left' @ [94:20] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'when (left) {
            is KtNameReferenceExpression -> if (left.text != parameterName) return false
            is KtDotQualifiedExpression -> if (!left.isApplicable(parameterName)) return false
            else -> return false
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'left' @ [95:15] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'left' @ [96:49] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'text' @ [96:54] ==> public final val KtNameReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'parameterName' @ [96:62] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'!' @ [97:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'left' @ [97:49] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'isApplicable' @ [97:54] ==> private final fun KtDotQualifiedExpression.isApplicable(parameterName: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'parameterName' @ [97:67] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'right' @ [101:21] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'when (right) {
            is KtNameReferenceExpression -> right.text != parameterName
            is KtDotQualifiedExpression -> !right.hasLambdaExpression() && !right.nameUsed(parameterName)
            is KtConstantExpression -> true
            else -> false
        }' @ [102:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'right' @ [102:22] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'right' @ [103:45] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'text' @ [103:51] ==> public final val KtNameReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'parameterName' @ [103:59] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'!' @ [104:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'right' @ [104:45] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'hasLambdaExpression' @ [104:51] ==> private final fun KtDotQualifiedExpression.hasLambdaExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'!' @ [104:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'right' @ [104:77] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[LocalVariableDescriptor]

'nameUsed' @ [104:83] ==> private final fun KtExpression.nameUsed(name: String, except: KtNameReferenceExpression? = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'parameterName' @ [104:92] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasLambdaExpression' @ [111:14] ==> private final fun KtDotQualifiedExpression.hasLambdaExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'getLeftMostReceiverExpression' @ [111:39] ==> public fun KtDotQualifiedExpression.getLeftMostReceiverExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'let' @ [111:71] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'receiver' @ [112:17] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [113:17] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [113:26] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [113:49] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'!' @ [114:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nameUsed' @ [114:18] ==> private final fun KtExpression.nameUsed(name: String, except: KtNameReferenceExpression? = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention[SimpleFunctionDescriptorImpl]

'parameterName' @ [114:27] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable[ValueParameterDescriptorImpl]

'receiver' @ [114:51] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'selectorExpression' @ [118:15] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'anyDescendantOfType' @ [118:35] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtLambdaExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLambdaExpression

'calleeExpression' @ [121:13] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [121:31] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'isMethodCall' @ [121:48] ==> public fun KtCallExpression.isMethodCall(fqMethodName: String): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'valueParameters' @ [124:26] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameters' @ [125:13] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.getParameterName[LocalVariableDescriptor]

'size' @ [125:24] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'if (parameters.size == 1) parameters[0].text else "it"' @ [126:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'parameters' @ [126:20] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.getParameterName[LocalVariableDescriptor]

'size' @ [126:31] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [126:42] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.getParameterName[LocalVariableDescriptor]

'text' @ [126:56] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'anyDescendantOfType' @ [130:13] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtNameReferenceExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'it' @ [130:62] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.nameUsed.<anonymous>[ValueParameterDescriptorImpl]

'except' @ [130:68] ==> value-parameter except: KtNameReferenceExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.nameUsed[ValueParameterDescriptorImpl]

'it' @ [130:78] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.nameUsed.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [130:81] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [130:104] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSingleLineLetIntention.nameUsed[ValueParameterDescriptorImpl]

