'AbstractKotlinInspection' @ [36:39] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [39:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [41:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitIfExpression' @ [41:23] ==> public open fun visitIfExpression(@NotNull p0: KtIfExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [41:41] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'expression' @ [43:33] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'condition' @ [43:44] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'condition' @ [45:31] ==> val condition: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'analyze' @ [45:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [45:65] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'condition' @ [46:37] ==> val condition: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'constantBooleanValue' @ [46:47] ==> private fun KtExpression.constantBooleanValue(context: BindingContext): Boolean? defined in org.jetbrains.kotlin.idea.inspections in file ConstantConditionIfInspection.kt[SimpleFunctionDescriptorImpl]

'context' @ [46:68] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'mutableListOf' @ [48:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalQuickFix

'expression' @ [50:21] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'branch' @ [50:32] ==> private fun KtIfExpression.branch(thenBranch: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.inspections in file ConstantConditionIfInspection.kt[SimpleFunctionDescriptorImpl]

'constantValue' @ [50:39] ==> val constantValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'fixes' @ [51:21] ==> val fixes: MutableList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'SimplifyFix' @ [51:30] ==> public constructor SimplifyFix(conditionValue: Boolean, isUsedAsExpression: Boolean) defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix[ClassConstructorDescriptorImpl]

'constantValue' @ [51:42] ==> val constantValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'expression' @ [51:57] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [51:68] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [51:87] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'!' @ [54:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [54:22] ==> val constantValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'expression' @ [54:39] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'`else`' @ [54:50] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'fixes' @ [55:21] ==> val fixes: MutableList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'RemoveFix' @ [55:30] ==> public constructor RemoveFix() defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.RemoveFix[ClassConstructorDescriptorImpl]

'holder' @ [58:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [58:24] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @Nullable vararg p2: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'condition' @ [58:40] ==> val condition: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'constantValue' @ [59:63] ==> val constantValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'fixes' @ [60:41] ==> val fixes: MutableList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'toTypedArray' @ [60:47] ==> public inline fun <reified T> Collection<LocalQuickFix>.toTypedArray(): Array<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LocalQuickFix

'name' @ [69:40] ==> public final val ConstantConditionIfInspection.SimplifyFix.name: String[MyPropertyDescriptor]

'descriptor' @ [74:32] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [74:43] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [74:54] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtIfExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIfExpression

'ifExpression' @ [76:26] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'branch' @ [76:39] ==> private fun KtIfExpression.branch(thenBranch: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.inspections in file ConstantConditionIfInspection.kt[SimpleFunctionDescriptorImpl]

'conditionValue' @ [76:46] ==> private final val conditionValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix[PropertyDescriptorImpl]

'unwrapBlockOrParenthesis' @ [76:63] ==> public fun KtExpression.unwrapBlockOrParenthesis(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'ifExpression' @ [78:13] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'replaceWithBranch' @ [78:26] ==> public fun KtExpression.replaceWithBranch(branch: KtExpression, isUsedAsExpression: Boolean): Unit defined in org.jetbrains.kotlin.idea.inspections in file ConstantConditionIfInspection.kt[SimpleFunctionDescriptorImpl]

'branch' @ [78:44] ==> val branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'isUsedAsExpression' @ [78:52] ==> private final val isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.SimplifyFix[PropertyDescriptorImpl]

'name' @ [83:40] ==> public final val ConstantConditionIfInspection.RemoveFix.name: String[MyPropertyDescriptor]

'descriptor' @ [88:32] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.RemoveFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [88:43] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [88:54] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtIfExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIfExpression

'ifExpression' @ [89:13] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.ConstantConditionIfInspection.RemoveFix.applyFix[LocalVariableDescriptor]

'delete' @ [89:26] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaMethodDescriptor]

'if (thenBranch) then else `else`' @ [94:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'thenBranch' @ [94:62] ==> value-parameter thenBranch: Boolean defined in org.jetbrains.kotlin.idea.inspections.branch[ValueParameterDescriptorImpl]

'then' @ [94:74] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'`else`' @ [94:84] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'getType' @ [97:16] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [97:24] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.constantBooleanValue[ValueParameterDescriptorImpl]

'ConstantExpressionEvaluator' @ [99:25] ==> public companion object defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[FakeCallableDescriptorForObject]

'getConstant' @ [99:53] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [99:65] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.constantBooleanValue[ReceiverParameterDescriptorImpl]

'context' @ [99:71] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.constantBooleanValue[ValueParameterDescriptorImpl]

'toConstantValue' @ [99:81] ==> public abstract fun toConstantValue(expectedType: KotlinType): ConstantValue<Any?> defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'type' @ [99:97] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.constantBooleanValue[LocalVariableDescriptor]

'constantValue' @ [100:12] ==> val constantValue: ConstantValue<Any?>? defined in org.jetbrains.kotlin.idea.inspections.constantBooleanValue[LocalVariableDescriptor]

'value' @ [100:27] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'when {
        branch !is KtBlockExpression -> replaced(branch)
        isUsedAsExpression -> {
            val factory = KtPsiFactory(this)
            replaced(factory.createExpressionByPattern("run $0", branch.text))
        }
        else -> {
            val firstChild = branch.firstChild.nextSibling

            if (firstChild == branch.lastChild) {
                delete()
            }
            else {
                val lastChild = branch.lastChild.prevSibling
                val parent = parent
                parent.addRangeAfter(firstChild, lastChild, this)
                delete()
            }

            null
        }
    }' @ [104:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'branch' @ [105:9] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'replaced' @ [105:41] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'branch' @ [105:50] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [106:9] ==> value-parameter isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [107:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [107:40] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ReceiverParameterDescriptorImpl]

'replaced' @ [108:13] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'factory' @ [108:22] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'createExpressionByPattern' @ [108:30] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'branch' @ [108:66] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'text' @ [108:73] ==> public final val KtBlockExpression.text: (String..String?)[MyPropertyDescriptor]

'branch' @ [111:30] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'firstChild' @ [111:37] ==> public final val KtBlockExpression.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextSibling' @ [111:48] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (firstChild == branch.lastChild) {
                delete()
            }
            else {
                val lastChild = branch.lastChild.prevSibling
                val parent = parent
                parent.addRangeAfter(firstChild, lastChild, this)
                delete()
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChild' @ [113:17] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'branch' @ [113:31] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'lastChild' @ [113:38] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [114:17] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'branch' @ [117:33] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'lastChild' @ [117:40] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'prevSibling' @ [117:50] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [118:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [119:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'addRangeAfter' @ [119:24] ==> public abstract fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'firstChild' @ [119:38] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'lastChild' @ [119:50] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'this' @ [119:61] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ReceiverParameterDescriptorImpl]

'delete' @ [120:17] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'branch' @ [127:22] ==> value-parameter branch: KtExpression defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[ValueParameterDescriptorImpl]

'findExistingEditor' @ [127:29] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections[DeserializedSimpleFunctionDescriptor]

'caretModel' @ [127:51] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'caretModel' @ [128:5] ==> val caretModel: CaretModel? defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'moveToOffset' @ [128:17] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'lastExpression' @ [128:30] ==> val lastExpression: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.replaceWithBranch[LocalVariableDescriptor]

'startOffset' @ [128:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

