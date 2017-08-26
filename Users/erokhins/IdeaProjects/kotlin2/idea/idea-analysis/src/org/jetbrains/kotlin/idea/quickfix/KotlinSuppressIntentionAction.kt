'SuppressIntentionAction' @ [36:5] ==> public constructor SuppressIntentionAction() defined in com.intellij.codeInspection.SuppressIntentionAction[JavaClassConstructorDescriptor]

'this' @ [39:45] ==> private constructor KotlinSuppressIntentionAction(suppressAt: PsiElement, suppressKey: String, kind: AnnotationHostKind) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[ClassConstructorDescriptorImpl]

'suppressAt' @ [39:50] ==> value-parameter suppressAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'suppressKey' @ [39:76] ==> value-parameter suppressKey: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'kind' @ [39:89] ==> value-parameter kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'this' @ [43:45] ==> private constructor KotlinSuppressIntentionAction(suppressAt: PsiElement, suppressKey: String, kind: AnnotationHostKind) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[ClassConstructorDescriptorImpl]

'suppressAt' @ [43:50] ==> value-parameter suppressAt: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'suppressKey' @ [43:76] ==> value-parameter suppressKey: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'kind' @ [43:89] ==> value-parameter kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.<init>[ValueParameterDescriptorImpl]

'message' @ [45:49] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [46:43] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'suppressKey' @ [46:75] ==> private final val suppressKey: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'kind' @ [46:88] ==> private final val kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'kind' @ [46:93] ==> public final val kind: String defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[PropertyDescriptorImpl]

'kind' @ [46:99] ==> private final val kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'name' @ [46:104] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[PropertyDescriptorImpl]

'element' @ [48:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.isAvailable[ValueParameterDescriptorImpl]

'isValid' @ [48:96] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'!' @ [51:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [51:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [51:52] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'element' @ [51:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[ValueParameterDescriptorImpl]

'suppressKey' @ [53:22] ==> private final val suppressKey: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'when (suppressAt) {
            is KtModifierListOwner ->
                suppressAt.addAnnotation(KotlinBuiltIns.FQ_NAMES.suppress,
                                         id,
                                         whiteSpaceText = if (kind.newLineNeeded) "\n" else " ",
                                         addToExistingAnnotation = { entry ->
                                             addArgumentToSuppressAnnotation(entry, id)
                                             true
                                         })

            is KtAnnotatedExpression ->
                suppressAtAnnotatedExpression(CaretBox(suppressAt, editor), id)

            is KtExpression ->
                suppressAtExpression(CaretBox(suppressAt, editor), id)

            is KtFile ->
                suppressAtFile(suppressAt, id)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'suppressAt' @ [54:15] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'suppressAt' @ [56:17] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'addAnnotation' @ [56:28] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [56:57] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [56:66] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'id' @ [57:42] ==> val id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[LocalVariableDescriptor]

'if (kind.newLineNeeded) "\n" else " "' @ [58:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'kind' @ [58:63] ==> private final val kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'newLineNeeded' @ [58:68] ==> public final val newLineNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[PropertyDescriptorImpl]

'addArgumentToSuppressAnnotation' @ [60:46] ==> private final fun addArgumentToSuppressAnnotation(entry: KtAnnotationEntry, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'entry' @ [60:78] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [60:85] ==> val id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[LocalVariableDescriptor]

'suppressAtAnnotatedExpression' @ [65:17] ==> private final fun suppressAtAnnotatedExpression(suppressAt: CaretBox<KtAnnotatedExpression>, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'CaretBox' @ [65:47] ==> public constructor CaretBox<out E : KtExpression>(expression: KtAnnotatedExpression, editor: Editor?) defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[ClassConstructorDescriptorImpl]
Inferred types:
    <out E : KtExpression> -> KtAnnotatedExpression

'suppressAt' @ [65:56] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'editor' @ [65:68] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[ValueParameterDescriptorImpl]

'id' @ [65:77] ==> val id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[LocalVariableDescriptor]

'suppressAtExpression' @ [68:17] ==> private final fun suppressAtExpression(caretBox: CaretBox<KtExpression>, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'CaretBox' @ [68:38] ==> public constructor CaretBox<out E : KtExpression>(expression: KtExpression, editor: Editor?) defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[ClassConstructorDescriptorImpl]
Inferred types:
    <out E : KtExpression> -> KtExpression

'suppressAt' @ [68:47] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'editor' @ [68:59] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[ValueParameterDescriptorImpl]

'id' @ [68:68] ==> val id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[LocalVariableDescriptor]

'suppressAtFile' @ [71:17] ==> private final fun suppressAtFile(ktFile: KtFile, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'suppressAt' @ [71:32] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'id' @ [71:44] ==> val id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.invoke[LocalVariableDescriptor]

'KtPsiFactory' @ [76:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'suppressAt' @ [76:39] ==> private final val suppressAt: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'ktFile' @ [78:57] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [78:64] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'fileAnnotationList' @ [79:13] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'psiFactory' @ [80:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'createFileAnnotationListWithAnnotation' @ [80:48] ==> public final fun createFileAnnotationListWithAnnotation(annotationText: String): KtFileAnnotationList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'suppressAnnotationText' @ [80:87] ==> private final fun suppressAnnotationText(id: String, withAt: Boolean = ...): String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'id' @ [80:110] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'replaceFileAnnotationList' @ [81:40] ==> public fun replaceFileAnnotationList(file: KtFile, annotationList: KtFileAnnotationList): KtFileAnnotationList defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ktFile' @ [81:66] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'newAnnotationList' @ [81:74] ==> val newAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'ktFile' @ [82:13] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'addAfter' @ [82:20] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'psiFactory' @ [82:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'createWhiteSpace' @ [82:40] ==> private fun KtPsiFactory.createWhiteSpace(kind: AnnotationHostKind): PsiElement defined in org.jetbrains.kotlin.idea.quickfix in file KotlinSuppressIntentionAction.kt[SimpleFunctionDescriptorImpl]

'kind' @ [82:57] ==> private final val kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'createAnnotationList' @ [82:64] ==> val createAnnotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'findSuppressAnnotation' @ [87:54] ==> private final fun findSuppressAnnotation(annotationList: KtFileAnnotationList): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'fileAnnotationList' @ [87:77] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'suppressAnnotation' @ [88:13] ==> val suppressAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'psiFactory' @ [89:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'createFileAnnotation' @ [89:52] ==> public final fun createFileAnnotation(annotationText: String): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'suppressAnnotationText' @ [89:73] ==> private final fun suppressAnnotationText(id: String, withAt: Boolean = ...): String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'id' @ [89:96] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [90:13] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'add' @ [90:32] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFileAnnotationList[JavaMethodDescriptor]

'psiFactory' @ [90:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'createWhiteSpace' @ [90:47] ==> private fun KtPsiFactory.createWhiteSpace(kind: AnnotationHostKind): PsiElement defined in org.jetbrains.kotlin.idea.quickfix in file KotlinSuppressIntentionAction.kt[SimpleFunctionDescriptorImpl]

'kind' @ [90:64] ==> private final val kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[PropertyDescriptorImpl]

'fileAnnotationList' @ [91:13] ==> val fileAnnotationList: KtFileAnnotationList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'add' @ [91:32] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFileAnnotationList[JavaMethodDescriptor]

'newSuppressAnnotation' @ [91:36] ==> val newSuppressAnnotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'addArgumentToSuppressAnnotation' @ [96:9] ==> private final fun addArgumentToSuppressAnnotation(entry: KtAnnotationEntry, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'suppressAnnotation' @ [96:41] ==> val suppressAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[LocalVariableDescriptor]

'id' @ [96:61] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtFile[ValueParameterDescriptorImpl]

'findSuppressAnnotation' @ [100:21] ==> private final fun findSuppressAnnotation(annotated: KtAnnotated): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'suppressAt' @ [100:44] ==> value-parameter suppressAt: CaretBox<KtAnnotatedExpression> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[ValueParameterDescriptorImpl]

'expression' @ [100:55] ==> public final val expression: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'if (entry != null) {
            // already annotated with @suppress
            addArgumentToSuppressAnnotation(entry, id)
        }
        else {
            suppressAtExpression(suppressAt, id)
        }' @ [101:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'entry' @ [101:13] ==> val entry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[LocalVariableDescriptor]

'addArgumentToSuppressAnnotation' @ [103:13] ==> private final fun addArgumentToSuppressAnnotation(entry: KtAnnotationEntry, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'entry' @ [103:45] ==> val entry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[LocalVariableDescriptor]

'id' @ [103:52] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[ValueParameterDescriptorImpl]

'suppressAtExpression' @ [106:13] ==> private final fun suppressAtExpression(caretBox: CaretBox<KtExpression>, id: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'suppressAt' @ [106:34] ==> value-parameter suppressAt: CaretBox<KtAnnotatedExpression> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[ValueParameterDescriptorImpl]

'id' @ [106:46] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtAnnotatedExpression[ValueParameterDescriptorImpl]

'caretBox' @ [111:26] ==> value-parameter caretBox: CaretBox<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[ValueParameterDescriptorImpl]

'expression' @ [111:35] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'assert' @ [112:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'suppressAt' @ [112:16] ==> val suppressAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'KtPsiFactory' @ [115:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'suppressAt' @ [115:48] ==> val suppressAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'createExpression' @ [115:60] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'suppressAnnotationText' @ [115:77] ==> private final fun suppressAnnotationText(id: String, withAt: Boolean = ...): String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'id' @ [115:100] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[ValueParameterDescriptorImpl]

'placeholderText' @ [115:113] ==> val placeholderText: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'suppressAt' @ [117:20] ==> val suppressAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'copy' @ [117:31] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'suppressAt' @ [119:28] ==> val suppressAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'replace' @ [119:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'annotatedExpression' @ [119:47] ==> val annotatedExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'afterReplace' @ [120:25] ==> val afterReplace: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'findElementAt' @ [120:38] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtAnnotatedExpression[JavaMethodDescriptor]

'afterReplace' @ [120:52] ==> val afterReplace: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'textLength' @ [120:65] ==> public final val KtAnnotatedExpression.textLength: Int[MyPropertyDescriptor]

'assert' @ [121:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'toReplace' @ [121:17] ==> val toReplace: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'text' @ [121:27] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'placeholderText' @ [121:35] ==> val placeholderText: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'toReplace' @ [122:22] ==> val toReplace: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'replace' @ [122:32] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'copy' @ [122:40] ==> val copy: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'caretBox' @ [124:9] ==> value-parameter caretBox: CaretBox<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[ValueParameterDescriptorImpl]

'positionCaretInCopy' @ [124:18] ==> public final fun positionCaretInCopy(copy: PsiElement): Unit defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[SimpleFunctionDescriptorImpl]

'result' @ [124:38] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAtExpression[LocalVariableDescriptor]

'entry' @ [129:20] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[ValueParameterDescriptorImpl]

'valueArgumentList' @ [129:26] ==> public final val KtAnnotationEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'KtPsiFactory' @ [130:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'entry' @ [130:39] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[ValueParameterDescriptorImpl]

'psiFactory' @ [131:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'createCallArguments' @ [131:37] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'id' @ [131:60] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[ValueParameterDescriptorImpl]

'when {
            args == null -> // new argument list
                entry.addAfter(newArgList, entry.lastChild)
            args.arguments.isEmpty() -> // replace '()' with a new argument list
                args.replace(newArgList)
            else -> args.addArgument(newArgList.arguments[0])
        }' @ [132:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?), entry2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'args' @ [133:13] ==> val args: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'entry' @ [134:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[ValueParameterDescriptorImpl]

'addAfter' @ [134:23] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'newArgList' @ [134:32] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'entry' @ [134:44] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[ValueParameterDescriptorImpl]

'lastChild' @ [134:50] ==> public final val KtAnnotationEntry.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'args' @ [135:13] ==> val args: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'arguments' @ [135:18] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [135:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'args' @ [136:17] ==> val args: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'replace' @ [136:22] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgList' @ [136:30] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'args' @ [137:21] ==> val args: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'addArgument' @ [137:26] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgList' @ [137:38] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.addArgumentToSuppressAnnotation[LocalVariableDescriptor]

'arguments' @ [137:49] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'if (withAt) "@" else ""' @ [141:81] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withAt' @ [141:85] ==> value-parameter withAt: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAnnotationText[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [141:122] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [141:131] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'shortName' @ [141:140] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'id' @ [141:154] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.suppressAnnotationText[ValueParameterDescriptorImpl]

'annotated' @ [144:23] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'analyze' @ [144:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'findSuppressAnnotation' @ [145:16] ==> private final fun findSuppressAnnotation(context: BindingContext, annotationEntries: List<KtAnnotationEntry>): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'context' @ [145:39] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[LocalVariableDescriptor]

'annotated' @ [145:48] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'annotationEntries' @ [145:58] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationList' @ [149:23] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'analyze' @ [149:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'findSuppressAnnotation' @ [150:16] ==> private final fun findSuppressAnnotation(context: BindingContext, annotationEntries: List<KtAnnotationEntry>): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[SimpleFunctionDescriptorImpl]

'context' @ [150:39] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[LocalVariableDescriptor]

'annotationList' @ [150:48] ==> value-parameter annotationList: KtFileAnnotationList defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'annotationEntries' @ [150:63] ==> public final val KtFileAnnotationList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'annotationEntries' @ [154:16] ==> value-parameter annotationEntries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'firstOrNull' @ [154:34] ==> public inline fun <T> Iterable<KtAnnotationEntry>.firstOrNull(predicate: (KtAnnotationEntry) -> Boolean): KtAnnotationEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'context' @ [155:13] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation[ValueParameterDescriptorImpl]

'get' @ [155:21] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), p1: (KtAnnotationEntry..KtAnnotationEntry?)): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtAnnotationEntry
    <V : (Any..Any?)> -> AnnotationDescriptor

'ANNOTATION' @ [155:40] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [155:52] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction.findSuppressAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [155:60] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'FQ_NAMES' @ [155:85] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [155:94] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'if (kind.newLineNeeded) createNewLine() else createWhiteSpace()' @ [163:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'kind' @ [163:16] ==> value-parameter kind: AnnotationHostKind defined in org.jetbrains.kotlin.idea.quickfix.createWhiteSpace[ValueParameterDescriptorImpl]

'newLineNeeded' @ [163:21] ==> public final val newLineNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[PropertyDescriptorImpl]

'createNewLine' @ [163:36] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'createWhiteSpace' @ [163:57] ==> public final fun createWhiteSpace(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'-' @ [170:43] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'editor' @ [170:44] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'caretModel' @ [170:52] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [170:64] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'expression' @ [170:79] ==> public final val expression: E defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'textRange' @ [170:90] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [170:102] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'editor' @ [173:13] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'editor' @ [174:9] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

'caretModel' @ [174:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [174:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'copy' @ [174:40] ==> value-parameter copy: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CaretBox.positionCaretInCopy[ValueParameterDescriptorImpl]

'textOffset' @ [174:45] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'offsetInExpression' @ [174:58] ==> private final val offsetInExpression: Int defined in org.jetbrains.kotlin.idea.quickfix.CaretBox[PropertyDescriptorImpl]

