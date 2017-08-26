'KotlinQuickFixAction<PsiElement>' @ [49:58] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'psiElement' @ [49:91] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix.<init>[ValueParameterDescriptorImpl]

'text' @ [50:44] ==> public final val ExclExclCallFix.text: String[MyPropertyDescriptor]

'file' @ [54:82] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'ExclExclCallFix' @ [57:55] ==> public constructor ExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix[ClassConstructorDescriptorImpl]

'psiElement' @ [57:71] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.<init>[ValueParameterDescriptorImpl]

'message' @ [58:51] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'super' @ [61:11] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [61:17] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix[SimpleFunctionDescriptorImpl]

'project' @ [61:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [61:38] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [61:46] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'getExclExclPostfixExpression' @ [61:55] ==> private final fun getExclExclPostfixExpression(): KtPostfixExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix[SimpleFunctionDescriptorImpl]

'!' @ [64:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [64:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [64:52] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'file' @ [64:72] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.invoke[ValueParameterDescriptorImpl]

'getExclExclPostfixExpression' @ [66:33] ==> private final fun getExclExclPostfixExpression(): KtPostfixExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [67:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [67:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [67:48] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'postfixExpression' @ [67:65] ==> val postfixExpression: KtPostfixExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.invoke[LocalVariableDescriptor]

'baseExpression' @ [67:83] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [67:100] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'postfixExpression' @ [68:9] ==> val postfixExpression: KtPostfixExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.invoke[LocalVariableDescriptor]

'replace' @ [68:27] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtPostfixExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [68:35] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.invoke[LocalVariableDescriptor]

'element' @ [72:31] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix[PropertyDescriptorImpl]

'parent' @ [72:40] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'operationParent' @ [73:13] ==> val operationParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.getExclExclPostfixExpression[LocalVariableDescriptor]

'operationParent' @ [73:55] ==> val operationParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.getExclExclPostfixExpression[LocalVariableDescriptor]

'baseExpression' @ [73:71] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'operationParent' @ [74:20] ==> val operationParent: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.getExclExclPostfixExpression[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [79:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'RemoveExclExclCallFix' @ [81:15] ==> public constructor RemoveExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix[ClassConstructorDescriptorImpl]

'diagnostic' @ [81:37] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveExclExclCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [81:48] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'ExclExclCallFix' @ [85:89] ==> public constructor ExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix[ClassConstructorDescriptorImpl]

'psiElement' @ [85:105] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.<init>[ValueParameterDescriptorImpl]

'this' @ [86:43] ==> public constructor AddExclExclCallFix(psiElement: PsiElement, checkImplicitReceivers: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[ClassConstructorDescriptorImpl]

'psiElement' @ [86:48] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.<init>[ValueParameterDescriptorImpl]

'message' @ [88:43] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'super' @ [91:15] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [91:21] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ExclExclCallFix[SimpleFunctionDescriptorImpl]

'project' @ [91:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [91:42] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [91:50] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.isAvailable[ValueParameterDescriptorImpl]

'getExpressionForIntroduceCall' @ [92:15] ==> private final fun getExpressionForIntroduceCall(): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'!' @ [95:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [95:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [95:52] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'file' @ [95:72] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[ValueParameterDescriptorImpl]

'getExpressionForIntroduceCall' @ [97:20] ==> private final fun getExpressionForIntroduceCall(): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'expr' @ [98:34] ==> val expr: AddExclExclCallFix.ExpressionForCall defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'expression' @ [98:39] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.ExpressionForCall[PropertyDescriptorImpl]

'if (expr.implicitReceiver) {
            KtPsiFactory(project).createExpressionByPattern("this!!.$0", modifiedExpression)
        } else {
            KtPsiFactory(project).createExpressionByPattern("$0!!", modifiedExpression)
        }' @ [99:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'expr' @ [99:38] ==> val expr: AddExclExclCallFix.ExpressionForCall defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'implicitReceiver' @ [99:43] ==> public final val implicitReceiver: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.ExpressionForCall[PropertyDescriptorImpl]

'KtPsiFactory' @ [100:13] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [100:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [100:35] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'modifiedExpression' @ [100:74] ==> val modifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'KtPsiFactory' @ [102:13] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [102:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [102:35] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'modifiedExpression' @ [102:69] ==> val modifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'modifiedExpression' @ [104:9] ==> val modifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'replace' @ [104:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'exclExclExpression' @ [104:36] ==> val exclExclExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.invoke[LocalVariableDescriptor]

'this' @ [109:86] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.expressionForCall[ReceiverParameterDescriptorImpl]

'let' @ [109:92] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> AddExclExclCallFix.ExpressionForCall): AddExclExclCallFix.ExpressionForCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> ExpressionForCall

'ExpressionForCall' @ [109:98] ==> public constructor ExpressionForCall(expression: KtExpression, implicitReceiver: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.ExpressionForCall[ClassConstructorDescriptorImpl]

'it' @ [109:116] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.expressionForCall.<anonymous>[ValueParameterDescriptorImpl]

'implicitReceiver' @ [109:120] ==> value-parameter implicitReceiver: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.expressionForCall[ValueParameterDescriptorImpl]

'element' @ [112:26] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[PropertyDescriptorImpl]

'psiElement' @ [113:14] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'isNullExpression' @ [113:43] ==> public fun KtExpression?.isNullExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'psiElement' @ [116:13] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'psiElement' @ [116:45] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'elementType' @ [116:56] ==> public final val LeafPsiElement.elementType: IElementType[MyPropertyDescriptor]

'DOT' @ [116:80] ==> public final val DOT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psiElement' @ [117:21] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'prevSibling' @ [117:32] ==> public final val LeafPsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expressionForCall' @ [117:62] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'when (psiElement) {
            is KtArrayAccessExpression -> psiElement.arrayExpression.expressionForCall()
            is KtOperationReferenceExpression -> {
                val parent = psiElement.parent
                when (parent) {
                    is KtUnaryExpression -> parent.baseExpression.expressionForCall()
                    is KtBinaryExpression -> {
                        val receiver = if (KtPsiUtil.isInOrNotInOperation(parent)) parent.right else parent.left
                        receiver.expressionForCall()
                    }
                    else -> null
                }
            }
            is KtExpression -> {
                val context = psiElement.analyze()
                if (checkImplicitReceivers && psiElement.getResolvedCall(context)?.getImplicitReceiverValue() != null) {
                    val expressionToReplace = psiElement.parent as? KtCallExpression ?: psiElement
                    expressionToReplace.expressionForCall(implicitReceiver = true)
                }
                else {
                    context[BindingContext.EXPRESSION_TYPE_INFO, psiElement]?.let {
                        val type = it.type
                        if (type != null) {
                            val nullability = it.dataFlowInfo.getStableNullability(
                                    DataFlowValueFactory.createDataFlowValue(psiElement, type, context, psiElement.findModuleDescriptor())
                            )
                            if (!nullability.canBeNonNull()) return null
                        }
                    }
                    psiElement.expressionForCall()
                }
            }
            else -> null
        }' @ [119:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AddExclExclCallFix.ExpressionForCall?, entry1: AddExclExclCallFix.ExpressionForCall?, entry2: AddExclExclCallFix.ExpressionForCall?, entry3: AddExclExclCallFix.ExpressionForCall?): AddExclExclCallFix.ExpressionForCall?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExpressionForCall?

'psiElement' @ [119:22] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'psiElement' @ [120:43] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'arrayExpression' @ [120:54] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'expressionForCall' @ [120:70] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'psiElement' @ [122:30] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'parent' @ [122:41] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                    is KtUnaryExpression -> parent.baseExpression.expressionForCall()
                    is KtBinaryExpression -> {
                        val receiver = if (KtPsiUtil.isInOrNotInOperation(parent)) parent.right else parent.left
                        receiver.expressionForCall()
                    }
                    else -> null
                }' @ [123:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AddExclExclCallFix.ExpressionForCall?, entry1: AddExclExclCallFix.ExpressionForCall?, entry2: AddExclExclCallFix.ExpressionForCall?): AddExclExclCallFix.ExpressionForCall?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExpressionForCall?

'parent' @ [123:23] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'parent' @ [124:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'baseExpression' @ [124:52] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'expressionForCall' @ [124:67] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'if (KtPsiUtil.isInOrNotInOperation(parent)) parent.right else parent.left' @ [126:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'isInOrNotInOperation' @ [126:54] ==> public open fun isInOrNotInOperation(@NotNull p0: KtBinaryExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parent' @ [126:75] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'parent' @ [126:84] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'right' @ [126:91] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'parent' @ [126:102] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'left' @ [126:109] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'receiver' @ [127:25] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'expressionForCall' @ [127:34] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'psiElement' @ [133:31] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'analyze' @ [133:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (checkImplicitReceivers && psiElement.getResolvedCall(context)?.getImplicitReceiverValue() != null) {
                    val expressionToReplace = psiElement.parent as? KtCallExpression ?: psiElement
                    expressionToReplace.expressionForCall(implicitReceiver = true)
                }
                else {
                    context[BindingContext.EXPRESSION_TYPE_INFO, psiElement]?.let {
                        val type = it.type
                        if (type != null) {
                            val nullability = it.dataFlowInfo.getStableNullability(
                                    DataFlowValueFactory.createDataFlowValue(psiElement, type, context, psiElement.findModuleDescriptor())
                            )
                            if (!nullability.canBeNonNull()) return null
                        }
                    }
                    psiElement.expressionForCall()
                }' @ [134:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AddExclExclCallFix.ExpressionForCall?, elseBranch: AddExclExclCallFix.ExpressionForCall?): AddExclExclCallFix.ExpressionForCall?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpressionForCall?

'checkImplicitReceivers' @ [134:21] ==> public final val checkImplicitReceivers: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[PropertyDescriptorImpl]

'psiElement' @ [134:47] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'getResolvedCall' @ [134:58] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [134:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'getImplicitReceiverValue' @ [134:84] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [135:47] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'parent' @ [135:58] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiElement' @ [135:89] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'expressionToReplace' @ [136:21] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'expressionForCall' @ [136:41] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'context' @ [139:21] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'EXPRESSION_TYPE_INFO' @ [139:44] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'psiElement' @ [139:66] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'let' @ [139:79] ==> @InlineOnly public inline fun <T, R> KotlinTypeInfo.let(block: (KotlinTypeInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinTypeInfo
    <R> -> Unit

'it' @ [140:36] ==> value-parameter it: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [140:39] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'type' @ [141:29] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall.<anonymous>[LocalVariableDescriptor]

'it' @ [142:47] ==> value-parameter it: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall.<anonymous>[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [142:50] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'getStableNullability' @ [142:63] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'createDataFlowValue' @ [143:58] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [143:78] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'type' @ [143:90] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall.<anonymous>[LocalVariableDescriptor]

'context' @ [143:96] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'psiElement' @ [143:105] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'findModuleDescriptor' @ [143:116] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'!' @ [145:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullability' @ [145:34] ==> val nullability: Nullability defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall.<anonymous>[LocalVariableDescriptor]

'canBeNonNull' @ [145:46] ==> public open fun canBeNonNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'psiElement' @ [148:21] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.getExpressionForIntroduceCall[LocalVariableDescriptor]

'expressionForCall' @ [148:32] ==> private final fun KtExpression?.expressionForCall(implicitReceiver: Boolean = ...): AddExclExclCallFix.ExpressionForCall? defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[SimpleFunctionDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [155:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'AddExclExclCallFix' @ [156:78] ==> public constructor AddExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[ClassConstructorDescriptorImpl]

'diagnostic' @ [156:97] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [156:108] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [160:47] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [162:13] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[ValueParameterDescriptorImpl]

'factory' @ [162:24] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'SMARTCAST_IMPOSSIBLE' @ [162:43] ==> public final val SMARTCAST_IMPOSSIBLE: (DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnostic' @ [163:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [163:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [165:23] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'analyze' @ [165:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [165:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'analyze' @ [166:20] ==> val analyze: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'getType' @ [166:28] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [166:36] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'type' @ [167:13] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'!' @ [167:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [167:40] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [167:55] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'SMARTCAST_IMPOSSIBLE' @ [169:47] ==> public final val SMARTCAST_IMPOSSIBLE: (DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [169:68] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'diagnostic' @ [169:73] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[ValueParameterDescriptorImpl]

'diagnosticWithParameters' @ [170:28] ==> val diagnosticWithParameters: DiagnosticWithParameters3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)> defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'a' @ [170:53] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (String..String?), (String..String?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <C : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'isNullableType' @ [171:23] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [171:38] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'makeNullable' @ [172:46] ==> @NotNull public open fun makeNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [172:59] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'!' @ [173:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [173:14] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'isSubtypeOf' @ [173:19] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'nullableExpectedType' @ [173:31] ==> val nullableExpectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'AddExclExclCallFix' @ [175:16] ==> public constructor AddExclExclCallFix(psiElement: PsiElement, checkImplicitReceivers: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[ClassConstructorDescriptorImpl]

'element' @ [175:35] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SmartCastImpossibleExclExclFixFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [179:44] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [181:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [181:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [183:23] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'analyze' @ [183:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [183:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'analyze' @ [184:20] ==> val analyze: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'getType' @ [184:28] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [184:36] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'type' @ [185:13] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'!' @ [185:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [185:40] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [185:55] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'type' @ [187:26] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'constructor' @ [187:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [187:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classifierDescriptor' @ [190:17] ==> value-parameter classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.hasIteratorFunction[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [192:31] ==> value-parameter classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.hasIteratorFunction[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [192:52] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'memberScope' @ [193:29] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.hasIteratorFunction[LocalVariableDescriptor]

'getContributedFunctions' @ [193:41] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'ITERATOR' @ [193:89] ==> @field:JvmField public final val ITERATOR: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'FROM_IDE' @ [193:116] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'functions' @ [195:20] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.hasIteratorFunction[LocalVariableDescriptor]

'any' @ [195:30] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.any(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [195:36] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.hasIteratorFunction.<anonymous>[ValueParameterDescriptorImpl]

'isValidOperator' @ [195:39] ==> public fun FunctionDescriptor.isValidOperator(): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'when (descriptor) {
            is TypeParameterDescriptor -> {
                if (descriptor.upperBounds.none { hasIteratorFunction(it.constructor.declarationDescriptor) }) return null
            }
            is ClassifierDescriptor -> {
                if (!hasIteratorFunction(descriptor)) return null
            }
            else -> return null
        }' @ [198:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [198:15] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'descriptor' @ [200:21] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'upperBounds' @ [200:32] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'none' @ [200:44] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.none(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'hasIteratorFunction' @ [200:51] ==> local final fun hasIteratorFunction(classifierDescriptor: ClassifierDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[SimpleFunctionDescriptorImpl]

'it' @ [200:71] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [200:74] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [200:86] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'!' @ [203:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasIteratorFunction' @ [203:22] ==> local final fun hasIteratorFunction(classifierDescriptor: ClassifierDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[SimpleFunctionDescriptorImpl]

'descriptor' @ [203:42] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

'AddExclExclCallFix' @ [208:16] ==> public constructor AddExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[ClassConstructorDescriptorImpl]

'element' @ [208:35] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.MissingIteratorExclExclFixFactory.createAction[LocalVariableDescriptor]

