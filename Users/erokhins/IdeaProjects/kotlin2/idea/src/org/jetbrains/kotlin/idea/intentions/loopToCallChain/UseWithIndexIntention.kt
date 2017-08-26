'IntentionBasedInspection<KtForExpression>' @ [28:32] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtForExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'UseWithIndexIntention' @ [28:74] ==> public constructor UseWithIndexIntention() defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention[ClassConstructorDescriptorImpl]

'SelfTargetingRangeIntention<KtForExpression>' @ [30:31] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtForExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'KtForExpression' @ [31:9] ==> public constructor KtForExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtForExpression[JavaClassConstructorDescriptor]

'java' @ [31:32] ==> public val <T> KClass<KtForExpression>.java: Class<KtForExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtForExpression

'if (matchIndexToIntroduce(element) != null) element.forKeyword.textRange else null' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'matchIndexToIntroduce' @ [35:20] ==> public fun matchIndexToIntroduce(loop: KtForExpression): IntroduceIndexData? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'element' @ [35:42] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [35:60] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applicabilityRange[ValueParameterDescriptorImpl]

'forKeyword' @ [35:68] ==> public final val KtForExpression.forKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [35:79] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'component1' @ [39:14] ==> public final operator fun component1(): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.IntroduceIndexData[SimpleFunctionDescriptorImpl]

'component2' @ [39:29] ==> public final operator fun component2(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.IntroduceIndexData[SimpleFunctionDescriptorImpl]

'component3' @ [39:54] ==> public final operator fun component3(): KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.IntroduceIndexData[SimpleFunctionDescriptorImpl]

'matchIndexToIntroduce' @ [39:77] ==> public fun matchIndexToIntroduce(loop: KtForExpression): IntroduceIndexData? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'element' @ [39:99] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [41:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [41:36] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [42:25] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[ValueParameterDescriptorImpl]

'loopRange' @ [42:33] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'element' @ [43:29] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[ValueParameterDescriptorImpl]

'loopParameter' @ [43:37] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'factory' @ [45:28] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [45:36] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'loopRange' @ [45:80] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'loopRange' @ [46:9] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'replace' @ [46:19] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'newLoopRange' @ [46:27] ==> val newLoopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'!!' @ [48:30] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtParameter?): KtParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtParameter

'factory' @ [48:31] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [48:39] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'indexVariable' @ [48:89] ==> val indexVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'nameAsSafeName' @ [48:103] ==> public final val KtCallableDeclaration.nameAsSafeName: Name[MyPropertyDescriptor]

'loopParameter' @ [48:119] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'text' @ [48:133] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'loopParameter' @ [48:159] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'loopParameter' @ [49:9] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'replace' @ [49:23] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'multiParameter' @ [49:31] ==> val multiParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'initializationStatement' @ [51:9] ==> val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'delete' @ [51:33] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'if (incrementExpression.parent is KtBlockExpression) {
            incrementExpression.delete()
        }
        else {
            removePlusPlus(incrementExpression)
        }' @ [52:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'incrementExpression' @ [52:13] ==> val incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'parent' @ [52:33] ==> public final val KtUnaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'incrementExpression' @ [53:13] ==> val incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

'delete' @ [53:33] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtUnaryExpression[JavaMethodDescriptor]

'removePlusPlus' @ [56:13] ==> public fun removePlusPlus(indexPlusPlus: KtUnaryExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'incrementExpression' @ [56:28] ==> val incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.UseWithIndexIntention.applyTo[LocalVariableDescriptor]

