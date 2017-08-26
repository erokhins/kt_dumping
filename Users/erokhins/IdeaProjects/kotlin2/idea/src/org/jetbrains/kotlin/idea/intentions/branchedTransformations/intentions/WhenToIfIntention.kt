'SelfTargetingRangeIntention<KtWhenExpression>' @ [30:27] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtWhenExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtWhenExpression

'KtWhenExpression' @ [30:73] ==> public constructor KtWhenExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaClassConstructorDescriptor]

'java' @ [30:97] ==> public val <T> KClass<KtWhenExpression>.java: Class<KtWhenExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'element' @ [32:23] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[ValueParameterDescriptorImpl]

'entries' @ [32:31] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entries' @ [33:13] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[LocalVariableDescriptor]

'isEmpty' @ [33:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'entries' @ [34:25] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[LocalVariableDescriptor]

'last' @ [34:33] ==> public fun <T> List<(KtWhenEntry..KtWhenEntry?)>.last(): (KtWhenEntry..KtWhenEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'entries' @ [35:13] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[LocalVariableDescriptor]

'any' @ [35:21] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.any(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [35:27] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'lastEntry' @ [35:33] ==> val lastEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[LocalVariableDescriptor]

'it' @ [35:46] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'isElse' @ [35:49] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'entries' @ [36:13] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[LocalVariableDescriptor]

'all' @ [36:21] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.all(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [36:27] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'isElse' @ [36:30] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'element' @ [37:16] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applicabilityRange[ValueParameterDescriptorImpl]

'whenKeyword' @ [37:24] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [37:36] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'CommentSaver' @ [41:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [41:41] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [43:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [43:36] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[ValueParameterDescriptorImpl]

'factory' @ [44:28] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[LocalVariableDescriptor]

'buildExpression' @ [44:36] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [45:27] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[ValueParameterDescriptorImpl]

'entries' @ [45:35] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'component1' @ [46:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [46:22] ==> public final operator fun component2(): (KtWhenEntry..KtWhenEntry?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'entries' @ [46:32] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'withIndex' @ [46:40] ==> public fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.withIndex(): Iterable<IndexedValue<(KtWhenEntry..KtWhenEntry?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'i' @ [47:21] ==> val i: Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [48:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'entry' @ [50:30] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'expression' @ [50:36] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'if (entry.isElse) {
                    appendExpression(branch)
                }
                else {
                    val condition = factory.combineWhenConditions(entry.conditions, element.subjectExpression)
                    appendFixedText("if (")
                    appendExpression(condition)
                    appendFixedText(")")
                    if (branch is KtIfExpression) {
                        appendFixedText("{ ")
                    }
                    appendExpression(branch)
                    if (branch is KtIfExpression) {
                        appendFixedText(" }")
                    }
                }' @ [51:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'entry' @ [51:21] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isElse' @ [51:27] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'appendExpression' @ [52:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'branch' @ [52:38] ==> val branch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'factory' @ [55:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[LocalVariableDescriptor]

'combineWhenConditions' @ [55:45] ==> public fun KtPsiFactory.combineWhenConditions(conditions: Array<KtWhenCondition>, subject: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'entry' @ [55:67] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'conditions' @ [55:73] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'element' @ [55:85] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[ValueParameterDescriptorImpl]

'subjectExpression' @ [55:93] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'appendFixedText' @ [56:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [57:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'condition' @ [57:38] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [58:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'branch' @ [59:25] ==> val branch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [60:25] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [62:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'branch' @ [62:38] ==> val branch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'branch' @ [63:25] ==> val branch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [64:25] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'i' @ [67:21] ==> val i: Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'entries' @ [67:26] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'lastIndex' @ [67:34] ==> public val <T> List<(KtWhenEntry..KtWhenEntry?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'appendFixedText' @ [68:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [73:22] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [73:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtWhenExpression[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [73:38] ==> val ifExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [74:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[LocalVariableDescriptor]

'restore' @ [74:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'result' @ [74:30] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.WhenToIfIntention.applyTo[LocalVariableDescriptor]

