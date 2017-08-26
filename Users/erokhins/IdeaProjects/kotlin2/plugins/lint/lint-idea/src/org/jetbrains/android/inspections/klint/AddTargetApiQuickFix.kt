'FqName' @ [37:33] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FQCN_TARGET_API' @ [37:53] ==> public const final val FQCN_TARGET_API: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'FqName' @ [38:35] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'REQUIRES_API_ANNOTATION' @ [38:42] ==> public const final val REQUIRES_API_ANNOTATION: String defined in com.android.tools.klint.checks.ApiDetector[JavaPropertyDescriptor]

'getAnnotationContainer' @ [42:13] ==> private final fun getAnnotationContainer(element: PsiElement, useRequiresApi: Boolean): PsiElement? defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'startElement' @ [42:36] ==> value-parameter startElement: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isApplicable[ValueParameterDescriptorImpl]

'useRequiresApi' @ [42:50] ==> public final val useRequiresApi: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[PropertyDescriptorImpl]

'getAnnotationValue' @ [44:38] ==> private final fun getAnnotationValue(fullyQualified: Boolean): String defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'let' @ [44:64] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (useRequiresApi) {
            // Not Available in Android plugin 2.0
            // AndroidBundle.message("android.lint.fix.add.requires.api", it)
            "Add @RequiresApi($it) Annotation"
        } else {
            AndroidBundle.message("android.lint.fix.add.target.api", it)
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'useRequiresApi' @ [45:13] ==> public final val useRequiresApi: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[PropertyDescriptorImpl]

'it' @ [48:32] ==> value-parameter it: String defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getName.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [50:27] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in org.jetbrains.android.util.AndroidBundle[JavaMethodDescriptor]

'it' @ [50:70] ==> value-parameter it: String defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getName.<anonymous>[ValueParameterDescriptorImpl]

'getAnnotationContainer' @ [55:35] ==> private final fun getAnnotationContainer(element: PsiElement, useRequiresApi: Boolean): PsiElement? defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'startElement' @ [55:58] ==> value-parameter startElement: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.apply[ValueParameterDescriptorImpl]

'useRequiresApi' @ [55:72] ==> public final val useRequiresApi: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[PropertyDescriptorImpl]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [56:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [56:52] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'annotationContainer' @ [56:78] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.apply[LocalVariableDescriptor]

'annotationContainer' @ [60:13] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.apply[LocalVariableDescriptor]

'annotationContainer' @ [61:14] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.apply[LocalVariableDescriptor]

'addAnnotation' @ [61:34] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'if (useRequiresApi) FQNAME_REQUIRES_API else FQNAME_TARGET_API' @ [62:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'useRequiresApi' @ [62:25] ==> public final val useRequiresApi: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[PropertyDescriptorImpl]

'FQNAME_REQUIRES_API' @ [62:41] ==> public final val FQNAME_REQUIRES_API: FqName defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.Companion[PropertyDescriptorImpl]

'FQNAME_TARGET_API' @ [62:66] ==> public final val FQNAME_TARGET_API: FqName defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.Companion[PropertyDescriptorImpl]

'getAnnotationValue' @ [63:21] ==> private final fun getAnnotationValue(fullyQualified: Boolean): String defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'if (annotationContainer.isNewLineNeededForAnnotation()) "\n" else " "' @ [64:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'annotationContainer' @ [64:42] ==> val annotationContainer: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.apply[LocalVariableDescriptor]

'isNewLineNeededForAnnotation' @ [64:62] ==> private final fun KtElement.isNewLineNeededForAnnotation(): Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'!' @ [68:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [68:62] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'this' @ [68:85] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'this' @ [68:112] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isNewLineNeededForAnnotation[ReceiverParameterDescriptorImpl]

'getVersionField' @ [70:63] ==> public fun getVersionField(api: Int, fullyQualified: Boolean): String defined in org.jetbrains.android.inspections.klint in file ApiUtils.kt[SimpleFunctionDescriptorImpl]

'api' @ [70:79] ==> public final val api: Int defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[PropertyDescriptorImpl]

'fullyQualified' @ [70:84] ==> value-parameter fullyQualified: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getAnnotationValue[ValueParameterDescriptorImpl]

'findFirstParent' @ [73:28] ==> @Nullable public final fun findFirstParent(@Nullable p0: PsiElement?, p1: (((PsiElement..PsiElement?)) -> Boolean..(((PsiElement..PsiElement?)) -> Boolean)?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[SamAdapterFunctionDescriptor]

'element' @ [73:44] ==> value-parameter element: PsiElement defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getAnnotationContainer[ValueParameterDescriptorImpl]

'if (useRequiresApi)
                it.isRequiresApiAnnotationValidTarget()
            else
                it.isTargetApiAnnotationValidTarget()' @ [74:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'useRequiresApi' @ [74:17] ==> value-parameter useRequiresApi: Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getAnnotationContainer[ValueParameterDescriptorImpl]

'it' @ [75:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getAnnotationContainer.<anonymous>[ValueParameterDescriptorImpl]

'isRequiresApiAnnotationValidTarget' @ [75:20] ==> private final fun PsiElement.isRequiresApiAnnotationValidTarget(): Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'it' @ [77:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.getAnnotationContainer.<anonymous>[ValueParameterDescriptorImpl]

'isTargetApiAnnotationValidTarget' @ [77:20] ==> private final fun PsiElement.isTargetApiAnnotationValidTarget(): Boolean defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix[SimpleFunctionDescriptorImpl]

'this' @ [82:16] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isRequiresApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [83:17] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isRequiresApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [83:39] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isRequiresApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [84:17] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isRequiresApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'!' @ [84:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [84:40] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'hasBackingField' @ [84:51] ==> public fun KtProperty.hasBackingField(): Boolean defined in org.jetbrains.kotlin.android in file KtPsiUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [85:16] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isRequiresApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [89:16] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isTargetApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [90:17] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isTargetApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [90:39] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isTargetApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

'this' @ [91:16] ==> <this> defined in org.jetbrains.android.inspections.klint.AddTargetApiQuickFix.isTargetApiAnnotationValidTarget[ReceiverParameterDescriptorImpl]

