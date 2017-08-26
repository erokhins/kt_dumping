'FqName' @ [42:36] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FQCN_SUPPRESS_LINT' @ [42:43] ==> public const final val FQCN_SUPPRESS_LINT: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'getLintId' @ [45:26] ==> private final fun getLintId(intentionId: String): String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[SimpleFunctionDescriptorImpl]

'id' @ [45:36] ==> public final val id: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[PropertyDescriptorImpl]

'message' @ [49:52] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in org.jetbrains.android.util.AndroidBundle[JavaMethodDescriptor]

'SUPPRESS_LINT_MESSAGE' @ [49:60] ==> public final val SUPPRESS_LINT_MESSAGE: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.Companion[PropertyDescriptorImpl]

'lintId' @ [49:83] ==> private final val lintId: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[PropertyDescriptorImpl]

'text' @ [51:36] ==> public final val SuppressLintIntentionAction.text: String[MyPropertyDescriptor]

'Cancel' @ [53:64] ==> public final val Cancel: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Actions[JavaPropertyDescriptor]

'file' @ [58:13] ==> value-parameter file: PsiFile? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[ValueParameterDescriptorImpl]

'?:' @ [62:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'findFirstParent' @ [62:47] ==> @Nullable public final fun findFirstParent(@Nullable p0: PsiElement?, p1: Boolean, p2: (((PsiElement..PsiElement?)) -> Boolean..(((PsiElement..PsiElement?)) -> Boolean)?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[SamAdapterFunctionDescriptor]

'element' @ [62:63] ==> public final val element: PsiElement defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[PropertyDescriptorImpl]

'it' @ [62:80] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke.<anonymous>[ValueParameterDescriptorImpl]

'isSuppressLintTarget' @ [62:83] ==> private final fun PsiElement.isSuppressLintTarget(): Boolean defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[SimpleFunctionDescriptorImpl]

'!' @ [63:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [63:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [63:52] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'annotationContainer' @ [63:78] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'lintId' @ [67:28] ==> private final val lintId: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[PropertyDescriptorImpl]

'when (annotationContainer) {
            is KtModifierListOwner -> annotationContainer.addAnnotation(
                    FQNAME_SUPPRESS_LINT,
                    argument,
                    whiteSpaceText = if (annotationContainer.isNewLineNeededForAnnotation()) "\n" else " ",
                    addToExistingAnnotation = { entry -> addArgumentToAnnotation(entry, argument) })
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'annotationContainer' @ [69:15] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'annotationContainer' @ [70:39] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'addAnnotation' @ [70:59] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'FQNAME_SUPPRESS_LINT' @ [71:21] ==> public final val FQNAME_SUPPRESS_LINT: FqName defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.Companion[PropertyDescriptorImpl]

'argument' @ [72:21] ==> val argument: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'if (annotationContainer.isNewLineNeededForAnnotation()) "\n" else " "' @ [73:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'annotationContainer' @ [73:42] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'isNewLineNeededForAnnotation' @ [73:62] ==> private final fun KtElement.isNewLineNeededForAnnotation(): Boolean defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[SimpleFunctionDescriptorImpl]

'addArgumentToAnnotation' @ [74:58] ==> private final fun addArgumentToAnnotation(entry: KtAnnotationEntry, argument: String): Boolean defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction[SimpleFunctionDescriptorImpl]

'entry' @ [74:82] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [74:89] ==> val argument: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.invoke[LocalVariableDescriptor]

'entry' @ [80:20] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'valueArgumentList' @ [80:26] ==> public final val KtAnnotationEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'KtPsiFactory' @ [81:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'entry' @ [81:39] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'psiFactory' @ [82:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'createCallArguments' @ [82:37] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argument' @ [82:60] ==> value-parameter argument: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'when {
            args == null -> // new argument list
                entry.addAfter(newArgList, entry.lastChild)
            args.arguments.isEmpty() -> // replace '()' with a new argument list
                args.replace(newArgList)
            args.arguments.none { it.textMatches(argument) } ->
                args.addArgument(newArgList.arguments[0])
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?), entry2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'args' @ [84:13] ==> val args: KtValueArgumentList? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'entry' @ [85:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'addAfter' @ [85:23] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'newArgList' @ [85:32] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'entry' @ [85:44] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'lastChild' @ [85:50] ==> public final val KtAnnotationEntry.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'args' @ [86:13] ==> val args: KtValueArgumentList? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'arguments' @ [86:18] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [86:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'args' @ [87:17] ==> val args: KtValueArgumentList? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'replace' @ [87:22] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgList' @ [87:30] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'args' @ [88:13] ==> val args: KtValueArgumentList? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'arguments' @ [88:18] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'none' @ [88:28] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.none(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [88:35] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'textMatches' @ [88:38] ==> public open fun textMatches(@NotNull p0: CharSequence): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [88:50] ==> value-parameter argument: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[ValueParameterDescriptorImpl]

'args' @ [89:17] ==> val args: KtValueArgumentList? defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'addArgument' @ [89:22] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgList' @ [89:34] ==> val newArgList: KtValueArgumentList defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.addArgumentToAnnotation[LocalVariableDescriptor]

'arguments' @ [89:45] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'if (intentionId.startsWith(INTENTION_NAME_PREFIX)) intentionId.substring(INTENTION_NAME_PREFIX.length) else intentionId' @ [96:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'intentionId' @ [96:17] ==> value-parameter intentionId: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.getLintId[ValueParameterDescriptorImpl]

'startsWith' @ [96:29] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INTENTION_NAME_PREFIX' @ [96:40] ==> public final val INTENTION_NAME_PREFIX: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.Companion[PropertyDescriptorImpl]

'intentionId' @ [96:64] ==> value-parameter intentionId: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.getLintId[ValueParameterDescriptorImpl]

'substring' @ [96:76] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INTENTION_NAME_PREFIX' @ [96:86] ==> public final val INTENTION_NAME_PREFIX: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.Companion[PropertyDescriptorImpl]

'length' @ [96:108] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'intentionId' @ [96:121] ==> value-parameter intentionId: String defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.getLintId[ValueParameterDescriptorImpl]

'!' @ [99:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [99:18] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'this' @ [100:18] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'this' @ [101:18] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'this' @ [105:16] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isSuppressLintTarget[ReceiverParameterDescriptorImpl]

'?:' @ [106:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'this' @ [106:17] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isSuppressLintTarget[ReceiverParameterDescriptorImpl]

'hasBackingField' @ [106:39] ==> public fun KtProperty.hasBackingField(): Boolean defined in org.jetbrains.kotlin.android in file KtPsiUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [107:16] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isSuppressLintTarget[ReceiverParameterDescriptorImpl]

'this' @ [108:16] ==> <this> defined in org.jetbrains.android.inspections.klint.SuppressLintIntentionAction.isSuppressLintTarget[ReceiverParameterDescriptorImpl]

