'KtElementImpl' @ [23:50] ==> public constructor KtElementImpl(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtElementImpl[JavaClassConstructorDescriptor]

'node' @ [23:64] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtExpressionImpl.<init>[ValueParameterDescriptorImpl]

'visitor' @ [25:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtExpressionImpl.accept[ValueParameterDescriptorImpl]

'visitExpression' @ [25:77] ==> public open fun visitExpression(@NotNull expression: KtExpression, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [25:93] ==> <this> defined in org.jetbrains.kotlin.psi.KtExpressionImpl[LazyClassReceiverParameterDescriptor]

'data' @ [25:99] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtExpressionImpl.accept[ValueParameterDescriptorImpl]

'findChildByType' @ [28:29] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): KtContainerNode? defined in org.jetbrains.kotlin.psi.KtExpressionImpl[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtContainerNode

'type' @ [28:62] ==> value-parameter type: KtNodeType defined in org.jetbrains.kotlin.psi.KtExpressionImpl.findExpressionUnder[ValueParameterDescriptorImpl]

'containerNode' @ [29:16] ==> val containerNode: KtContainerNode defined in org.jetbrains.kotlin.psi.KtExpressionImpl.findExpressionUnder[LocalVariableDescriptor]

'findChildByClass' @ [29:30] ==> @Override protected/*protected and package*/ open fun <T : (Any..Any?)> findChildByClass(aClass: (Class<(KtExpression..KtExpression?)>..Class<(KtExpression..KtExpression?)>?)): KtExpression? defined in org.jetbrains.kotlin.psi.KtContainerNode[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'java' @ [29:81] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'replaceExpression' @ [33:16] ==> public final fun replaceExpression(expression: KtExpression, newElement: PsiElement, rawReplaceHandler: (PsiElement) -> PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion[SimpleFunctionDescriptorImpl]

'this' @ [33:34] ==> <this> defined in org.jetbrains.kotlin.psi.KtExpressionImpl[LazyClassReceiverParameterDescriptor]

'newElement' @ [33:40] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.replace[ValueParameterDescriptorImpl]

'super' @ [33:54] ==> <this> defined in org.jetbrains.kotlin.psi.KtExpressionImpl[LazyClassReceiverParameterDescriptor]

'replace' @ [33:60] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElementImpl[JavaMethodDescriptor]

'it' @ [33:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.replace.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [38:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'parent' @ [38:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'newElement' @ [40:17] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'when (parent) {
                    is KtExpression, is KtValueArgument -> {
                        if (KtPsiUtil.areParenthesesNecessary(newElement, expression, parent as KtElement)) {
                            return rawReplaceHandler(KtPsiFactory(expression).createExpressionByPattern("($0)", newElement))
                        }
                    }
                    is KtSimpleNameStringTemplateEntry -> {
                        if (newElement !is KtSimpleNameExpression) {
                            val newEntry = parent.replace(KtPsiFactory(expression).createBlockStringTemplateEntry(newElement)) as KtBlockStringTemplateEntry
                            return newEntry.expression!!
                        }
                    }
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [41:23] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[LocalVariableDescriptor]

'areParenthesesNecessary' @ [43:39] ==> public open fun areParenthesesNecessary(@NotNull innerExpression: KtExpression, @NotNull currentInner: KtExpression, @NotNull parentElement: KtElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'newElement' @ [43:63] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'expression' @ [43:75] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'parent' @ [43:87] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[LocalVariableDescriptor]

'invoke' @ [44:36] ==> public abstract operator fun invoke(p1: PsiElement): PsiElement defined in kotlin.Function1[FunctionInvokeDescriptor]

'KtPsiFactory' @ [44:54] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'expression' @ [44:67] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [44:79] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]

'newElement' @ [44:113] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'newElement' @ [48:29] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'parent' @ [49:44] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[LocalVariableDescriptor]

'replace' @ [49:51] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [49:59] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'expression' @ [49:72] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'createBlockStringTemplateEntry' @ [49:84] ==> public final fun createBlockStringTemplateEntry(expression: KtExpression): KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'newElement' @ [49:115] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

'newEntry' @ [50:36] ==> val newEntry: KtBlockStringTemplateEntry defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[LocalVariableDescriptor]

'expression' @ [50:45] ==> public final val KtBlockStringTemplateEntry.expression: KtExpression?[MyPropertyDescriptor]

'invoke' @ [56:20] ==> public abstract operator fun invoke(p1: PsiElement): PsiElement defined in kotlin.Function1[FunctionInvokeDescriptor]

'newElement' @ [56:38] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionImpl.Companion.replaceExpression[ValueParameterDescriptorImpl]

