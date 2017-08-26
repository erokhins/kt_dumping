'editor' @ [29:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'caretModel' @ [29:29] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'editor' @ [30:26] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'selectionModel' @ [30:33] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'if (declaration is KtSecondaryConstructor) {
        caretModel.moveToOffset(declaration.getConstructorKeyword().endOffset)
    }
    else {
        caretModel.moveToOffset(declaration.nameIdentifier!!.endOffset)
    }' @ [32:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [32:9] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'caretModel' @ [33:9] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'moveToOffset' @ [33:20] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [33:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [33:45] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'endOffset' @ [33:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretModel' @ [36:9] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'moveToOffset' @ [36:20] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [36:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'nameIdentifier' @ [36:45] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'endOffset' @ [36:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'left' @ [40:20] ==> value-parameter left: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[ValueParameterDescriptorImpl]

'siblings' @ [40:25] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [40:70] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [40:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween.<anonymous>[ValueParameterDescriptorImpl]

'right' @ [41:18] ==> value-parameter right: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[ValueParameterDescriptorImpl]

'siblings' @ [41:24] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [41:70] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [41:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [42:27] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[LocalVariableDescriptor]

'startOffset' @ [42:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'to' @ [43:25] ==> val to: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[LocalVariableDescriptor]

'endOffset' @ [43:28] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretModel' @ [44:9] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'moveToOffset' @ [44:20] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'endOffset' @ [44:33] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[LocalVariableDescriptor]

'selectionModel' @ [45:9] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'setSelection' @ [45:24] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'startOffset' @ [45:37] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[LocalVariableDescriptor]

'endOffset' @ [45:50] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.positionBetween[LocalVariableDescriptor]

'when (declaration) {
        is KtNamedFunction, is KtSecondaryConstructor -> {
            ((declaration as KtFunction).bodyExpression as? KtBlockExpression)?.let {
                positionBetween(it.lBrace!!, it.rBrace!!)
            }
        }
        is KtClassOrObject -> {
            caretModel.moveToOffset(declaration.startOffset)
        }
        is KtProperty -> {
            caretModel.moveToOffset(declaration.endOffset)
        }
    }' @ [48:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'declaration' @ [48:11] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'declaration' @ [50:15] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'bodyExpression' @ [50:42] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [50:81] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> Unit

'positionBetween' @ [51:17] ==> local final fun positionBetween(left: PsiElement, right: PsiElement): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[SimpleFunctionDescriptorImpl]

'it' @ [51:33] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.<anonymous>[ValueParameterDescriptorImpl]

'lBrace' @ [51:36] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'it' @ [51:46] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [51:49] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'caretModel' @ [55:13] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'moveToOffset' @ [55:24] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [55:37] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'startOffset' @ [55:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretModel' @ [58:13] ==> val caretModel: CaretModel defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[LocalVariableDescriptor]

'moveToOffset' @ [58:24] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [58:37] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'endOffset' @ [58:49] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [61:5] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.setupEditorSelection[ValueParameterDescriptorImpl]

'scrollingModel' @ [61:12] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollToCaret' @ [61:27] ==> public abstract fun scrollToCaret(@NotNull p0: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'CENTER' @ [61:52] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

