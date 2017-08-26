'MoveElementLeftRightHandler' @ [23:36] ==> public constructor MoveElementLeftRightHandler() defined in com.intellij.codeInsight.editorActions.moveLeftRight.MoveElementLeftRightHandler[JavaClassConstructorDescriptor]

'when (element) {
            is KtParameterList -> return element.parameters.toTypedArray()
            is KtValueArgumentList -> return element.arguments.toTypedArray()
            is KtArrayAccessExpression -> return element.indexExpressions.toTypedArray()
            is KtTypeParameterList -> return element.parameters.toTypedArray()
            is KtSuperTypeList -> return element.entries.toTypedArray()
            //TODO
//            is KtClass -> if (element.isEnum()) return element.declarations.filterIsInstance<KtEnumEntry>().toTypedArray()
        }' @ [25:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [25:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'element' @ [26:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'parameters' @ [26:50] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'toTypedArray' @ [26:61] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'element' @ [27:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'arguments' @ [27:54] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'toTypedArray' @ [27:64] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'element' @ [28:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'indexExpressions' @ [28:58] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'toTypedArray' @ [28:75] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'element' @ [29:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'parameters' @ [29:54] ==> public final val KtTypeParameterList.parameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'toTypedArray' @ [29:65] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'element' @ [30:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.KotlinMoveLeftRightHandler.getMovableSubElements[ValueParameterDescriptorImpl]

'entries' @ [30:50] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'toTypedArray' @ [30:58] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'emptyArray' @ [35:16] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

