'KotlinIntentionActionsFactory' @ [50:45] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'LinkedList' @ [53:23] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntentionAction

'diagnostic' @ [55:24] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'psiFile' @ [55:35] ==> public final val Diagnostic.psiFile: PsiFile[MyPropertyDescriptor]

'analyzeFully' @ [55:54] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [57:33] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [57:44] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnosticElement' @ [58:13] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'LOG' @ [59:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion[PropertyDescriptorImpl]

'error' @ [59:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [59:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'diagnosticElement' @ [59:48] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'text' @ [59:66] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [60:20] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'when (diagnostic.factory) {
            Errors.TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = diagnosticWithParameters.b
            }
            Errors.NULL_FOR_NONNULL_TYPE -> {
                val diagnosticWithParameters = Errors.NULL_FOR_NONNULL_TYPE.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = expectedType.makeNullable()
            }
            Errors.TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = diagnosticWithParameters.b
            }
            Errors.CONSTANT_EXPECTED_TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.CONSTANT_EXPECTED_TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.b
                expressionType = context.getType(diagnosticElement).sure {
                    LOG.error("No type inferred: " + diagnosticElement.text)
                    return emptyList()
                }
            }
            else -> {
                LOG.error("Unexpected diagnostic: " + DefaultErrorMessages.render(diagnostic))
                return emptyList()
            }
        }' @ [65:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [65:15] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'factory' @ [65:26] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'TYPE_MISMATCH' @ [66:20] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TYPE_MISMATCH' @ [67:55] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [67:69] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [67:74] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'expectedType' @ [68:17] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [68:32] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'a' @ [68:57] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'expressionType' @ [69:17] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [69:34] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'b' @ [69:59] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.b: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'NULL_FOR_NONNULL_TYPE' @ [71:20] ==> public final val NULL_FOR_NONNULL_TYPE: (DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NULL_FOR_NONNULL_TYPE' @ [72:55] ==> public final val NULL_FOR_NONNULL_TYPE: (DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [72:77] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [72:82] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'expectedType' @ [73:17] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [73:32] ==> val diagnosticWithParameters: DiagnosticWithParameters1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'a' @ [73:57] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtConstantExpression..org.jetbrains.kotlin.psi.KtConstantExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'expressionType' @ [74:17] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [74:34] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'makeNullable' @ [74:47] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH' @ [76:20] ==> public final val TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH: (DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH' @ [77:55] ==> public final val TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH: (DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [77:93] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [77:98] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'expectedType' @ [78:17] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [78:32] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'a' @ [78:57] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'expressionType' @ [79:17] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [79:34] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'b' @ [79:59] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.b: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'CONSTANT_EXPECTED_TYPE_MISMATCH' @ [81:20] ==> public final val CONSTANT_EXPECTED_TYPE_MISMATCH: (DiagnosticFactory2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'CONSTANT_EXPECTED_TYPE_MISMATCH' @ [82:55] ==> public final val CONSTANT_EXPECTED_TYPE_MISMATCH: (DiagnosticFactory2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [82:87] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [82:92] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'expectedType' @ [83:17] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticWithParameters' @ [83:32] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'b' @ [83:57] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtConstantExpression..KtConstantExpression?), (String..String?), (KotlinType..KotlinType?)>.b: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtConstantExpression..org.jetbrains.kotlin.psi.KtConstantExpression?)
    <A : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'expressionType' @ [84:17] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'context' @ [84:34] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getType' @ [84:42] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'diagnosticElement' @ [84:50] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'sure' @ [84:69] ==> public inline fun <T : Any> KotlinType?.sure(message: () -> String): KotlinType defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'LOG' @ [85:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion[PropertyDescriptorImpl]

'error' @ [85:25] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [85:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'diagnosticElement' @ [85:54] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'text' @ [85:72] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [86:28] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'LOG' @ [90:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion[PropertyDescriptorImpl]

'error' @ [90:21] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [90:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'render' @ [90:76] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'diagnostic' @ [90:83] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'emptyList' @ [91:24] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'expressionType' @ [95:13] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [95:28] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [95:55] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [95:68] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'diagnosticElement' @ [97:17] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'!' @ [97:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isChar' @ [97:78] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [97:85] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'wrongPrimitiveLiteralFix' @ [98:17] ==> var wrongPrimitiveLiteralFix: WrongPrimitiveLiteralFix? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'WrongPrimitiveLiteralFix' @ [98:44] ==> public constructor WrongPrimitiveLiteralFix(element: KtConstantExpression, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.WrongPrimitiveLiteralFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [98:69] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [98:88] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [99:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [99:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'wrongPrimitiveLiteralFix' @ [99:29] ==> var wrongPrimitiveLiteralFix: WrongPrimitiveLiteralFix? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [101:13] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [101:21] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'NumberConversionFix' @ [101:25] ==> public constructor NumberConversionFix(element: KtExpression, type: KotlinType, disableIfAvailable: IntentionAction? = ...) defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [101:45] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [101:64] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'wrongPrimitiveLiteralFix' @ [101:78] ==> var wrongPrimitiveLiteralFix: WrongPrimitiveLiteralFix? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isCharSequenceOrNullableCharSequence' @ [104:28] ==> public open fun isCharSequenceOrNullableCharSequence(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [104:65] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isStringOrNullableString' @ [105:31] ==> public open fun isStringOrNullableString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [105:56] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [106:13] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [106:21] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'AddToStringFix' @ [106:25] ==> public constructor AddToStringFix(element: KtExpression, nullable: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [106:40] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [107:17] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isMarkedNullable' @ [107:30] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'expressionType' @ [107:50] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isMarkedNullable' @ [107:65] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'actions' @ [108:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [108:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'AddToStringFix' @ [108:29] ==> public constructor AddToStringFix(element: KtExpression, nullable: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [108:44] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [112:13] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isInterface' @ [112:26] ==> public fun KotlinType.isInterface(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [113:45] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'constructor' @ [113:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [113:72] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [113:95] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [114:17] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [114:41] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [114:65] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'expressionTypeDeclaration' @ [116:13] ==> val expressionTypeDeclaration: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'let' @ [116:40] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Boolean

'actions' @ [116:46] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [116:54] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'LetImplementInterfaceFix' @ [116:58] ==> public constructor LetImplementInterfaceFix(element: KtClassOrObject, expectedType: KotlinType, expressionType: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.LetImplementInterfaceFix[ClassConstructorDescriptorImpl]

'it' @ [116:83] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'expectedType' @ [116:87] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expressionType' @ [116:101] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'this' @ [120:35] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[ReceiverParameterDescriptorImpl]

'qualifiedOrThis' @ [122:31] ==> var qualifiedOrThis: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'qualifiedOrThis' @ [123:17] ==> var qualifiedOrThis: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'element' @ [123:35] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'getQualifiedExpressionForSelectorOrThis' @ [123:43] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'qualifiedOrThis' @ [124:22] ==> var qualifiedOrThis: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'element' @ [124:42] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'qualifiedOrThis' @ [125:20] ==> var qualifiedOrThis: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.getTopMostQualifiedForSelectorIfAny[LocalVariableDescriptor]

'diagnosticElement' @ [129:13] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [129:68] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'parent' @ [129:86] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'actions' @ [130:13] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [130:21] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'CastExpressionFix' @ [130:25] ==> public constructor CastExpressionFix(element: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.CastExpressionFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [130:43] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getTopMostQualifiedForSelectorIfAny' @ [130:61] ==> local final fun KtExpression.getTopMostQualifiedForSelectorIfAny(): KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[SimpleFunctionDescriptorImpl]

'expectedType' @ [130:100] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'!' @ [133:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [133:14] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isMarkedNullable' @ [133:27] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isNullableType' @ [133:84] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expressionType' @ [133:99] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [134:36] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'makeNullable' @ [134:49] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [135:17] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isSubtypeOf' @ [135:32] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'nullableExpected' @ [135:44] ==> val nullableExpected: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [136:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [136:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'AddExclExclCallFix' @ [136:29] ==> public constructor AddExclExclCallFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [136:48] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getTopMostQualifiedForSelectorIfAny' @ [136:66] ==> local final fun KtExpression.getTopMostQualifiedForSelectorIfAny(): KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[SimpleFunctionDescriptorImpl]

'getParentOfType' @ [141:36] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtProperty..KtProperty?)>): KtProperty? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'diagnosticElement' @ [141:52] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'java' @ [141:89] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'property' @ [142:13] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'property' @ [143:26] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getter' @ [143:35] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'property' @ [144:31] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'initializer' @ [144:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'canEvaluateTo' @ [145:30] ==> public open fun canEvaluateTo(p0: (KtExpression..KtExpression?), p1: (KtExpression..KtExpression?)): Boolean defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'initializer' @ [145:44] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [145:57] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getter' @ [145:79] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'canFunctionOrGetterReturnExpression' @ [145:110] ==> public open fun canFunctionOrGetterReturnExpression(@NotNull p0: KtDeclaration, @NotNull p1: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'getter' @ [145:146] ==> val getter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [145:154] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'property' @ [146:29] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionScope' @ [146:38] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [146:57] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'property' @ [146:66] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionFacade' @ [146:75] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [147:36] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'approximateWithResolvableType' @ [147:51] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'scope' @ [147:81] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [148:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [148:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeVariableTypeFix' @ [148:29] ==> public constructor ChangeVariableTypeFix(element: KtVariableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableTypeFix[ClassConstructorDescriptorImpl]

'property' @ [148:51] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'typeToInsert' @ [148:61] ==> val typeToInsert: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [152:32] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'parent' @ [152:50] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (expressionParent is KtReturnExpression)
            expressionParent.getTargetFunction(context)
        else
            PsiTreeUtil.getParentOfType(diagnosticElement, KtFunction::class.java, true)' @ [156:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCallableDeclaration?, elseBranch: KtCallableDeclaration?): KtCallableDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCallableDeclaration?

'expressionParent' @ [156:28] ==> val expressionParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expressionParent' @ [157:13] ==> val expressionParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getTargetFunction' @ [157:30] ==> public fun KtReturnExpression.getTargetFunction(context: BindingContext): KtCallableDeclaration? defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [157:48] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParentOfType' @ [159:25] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtFunction..KtFunction?)>, p2: Boolean): KtFunction? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtFunction..org.jetbrains.kotlin.psi.KtFunction?)

'diagnosticElement' @ [159:41] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'java' @ [159:78] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'function' @ [160:13] ==> val function: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'canFunctionOrGetterReturnExpression' @ [160:52] ==> public open fun canFunctionOrGetterReturnExpression(@NotNull p0: KtDeclaration, @NotNull p1: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'function' @ [160:88] ==> val function: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [160:98] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'function' @ [161:25] ==> val function: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionScope' @ [161:34] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [161:53] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'function' @ [161:62] ==> val function: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionFacade' @ [161:71] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [162:32] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'approximateWithResolvableType' @ [162:47] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'scope' @ [162:77] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [163:13] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [163:21] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ForEnclosing' @ [163:53] ==> public constructor ForEnclosing(element: KtFunction, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing[ClassConstructorDescriptorImpl]

'function' @ [163:66] ==> val function: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'typeToInsert' @ [163:76] ==> val typeToInsert: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [167:13] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [168:32] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolvedCall' @ [168:50] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [168:66] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'resolvedCall' @ [169:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getFunctionDeclaration' @ [170:35] ==> private final fun getFunctionDeclaration(resolvedCall: ResolvedCall<*>): KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [170:58] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'declaration' @ [171:21] ==> val declaration: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [172:21] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [172:29] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ForCalled' @ [172:61] ==> public constructor ForCalled(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[ClassConstructorDescriptorImpl]

'declaration' @ [172:71] ==> val declaration: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [172:84] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [178:13] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [179:32] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolvedCall' @ [179:50] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [179:66] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'resolvedCall' @ [180:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getFunctionDeclaration' @ [181:35] ==> private final fun getFunctionDeclaration(resolvedCall: ResolvedCall<*>): KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [181:58] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'declaration' @ [182:21] ==> val declaration: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [183:21] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [183:29] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ForCalled' @ [183:61] ==> public constructor ForCalled(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[ClassConstructorDescriptorImpl]

'declaration' @ [183:71] ==> val declaration: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [183:84] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParentOfType' @ [189:43] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtAnnotationEntry..KtAnnotationEntry?)>): KtAnnotationEntry? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'diagnosticElement' @ [189:59] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'java' @ [189:103] ==> public val <T> KClass<KtAnnotationEntry>.java: Class<KtAnnotationEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'annotationEntry' @ [190:13] ==> val annotationEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isArray' @ [191:32] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [191:40] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expressionType' @ [191:57] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'isSubtypeOf' @ [191:72] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [191:84] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'arguments' @ [191:97] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [191:110] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'isPrimitiveArray' @ [191:134] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [191:151] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [192:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [192:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'AddArrayOfTypeFix' @ [192:29] ==> public constructor AddArrayOfTypeFix(expression: KtExpression, expectedType: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.AddArrayOfTypeFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [192:47] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expectedType' @ [192:66] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [196:9] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getStrictParentOfType' @ [196:27] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'let' @ [196:65] ==> @InlineOnly public inline fun <T, R> KtParameter.let(block: (KtParameter) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> Unit

'it' @ [197:17] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [197:20] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'diagnosticElement' @ [197:36] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [198:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [198:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeParameterTypeFix' @ [198:29] ==> public constructor ChangeParameterTypeFix(element: KtParameter, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[ClassConstructorDescriptorImpl]

'it' @ [198:52] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'expressionType' @ [198:56] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [202:28] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParentResolvedCall' @ [202:46] ==> public fun KtElement?.getParentResolvedCall(context: BindingContext, strict: Boolean = ...): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [202:68] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'resolvedCall' @ [203:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParentIfForBranch' @ [206:41] ==> @Nullable public open fun getParentIfForBranch(@Nullable p0: KtExpression?): KtIfExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'diagnosticElement' @ [206:62] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'parentIf' @ [207:38] ==> val parentIf: KtIfExpression? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'diagnosticElement' @ [207:50] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'resolvedCall' @ [208:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'call' @ [208:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'getValueArgumentForExpression' @ [208:51] ==> public fun Call.getValueArgumentForExpression(expression: KtExpression): ValueArgument? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [208:81] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'valueArgument' @ [209:17] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'resolvedCall' @ [210:56] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParameterForArgument' @ [210:69] ==> public fun <D : CallableDescriptor> ResolvedCall<out CallableDescriptor>.getParameterForArgument(valueArgument: ValueArgument?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(out CallableDescriptor)

'valueArgument' @ [210:93] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'safeGetDeclaration' @ [211:59] ==> @Nullable public open fun safeGetDeclaration(@Nullable p0: CallableDescriptor?): PsiElement? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'correspondingParameterDescriptor' @ [211:78] ==> val correspondingParameterDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'valueArgument' @ [212:46] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getArgumentExpression' @ [212:60] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'if (diagnostic.factory === Errors.NULL_FOR_NONNULL_TYPE)
                    expressionType
                else
                    expressionFromArgument?.let { context.getType(it) }' @ [213:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'diagnostic' @ [213:45] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[ValueParameterDescriptorImpl]

'factory' @ [213:56] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'NULL_FOR_NONNULL_TYPE' @ [213:75] ==> public final val NULL_FOR_NONNULL_TYPE: (DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'expressionType' @ [214:21] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expressionFromArgument' @ [216:21] ==> val expressionFromArgument: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'let' @ [216:45] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [216:51] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getType' @ [216:59] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [216:67] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'valueArgumentType' @ [217:21] ==> val valueArgumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'correspondingParameter' @ [218:25] ==> val correspondingParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getParentOfType' @ [219:52] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtCallableDeclaration..KtCallableDeclaration?)>, p2: Boolean): KtCallableDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)

'correspondingParameter' @ [219:68] ==> val correspondingParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'java' @ [219:121] ==> public val <T> KClass<KtCallableDeclaration>.java: Class<KtCallableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'callable' @ [220:37] ==> val callable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionScope' @ [220:47] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [220:66] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'callable' @ [220:75] ==> val callable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getResolutionFacade' @ [220:84] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'valueArgumentType' @ [221:44] ==> val valueArgumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'approximateWithResolvableType' @ [221:62] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'scope' @ [221:92] ==> val scope: LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [222:25] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [222:33] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeParameterTypeFix' @ [222:37] ==> public constructor ChangeParameterTypeFix(element: KtParameter, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[ClassConstructorDescriptorImpl]

'correspondingParameter' @ [222:60] ==> val correspondingParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'typeToInsert' @ [222:84] ==> val typeToInsert: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'correspondingParameterDescriptor' @ [224:25] ==> val correspondingParameterDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'varargElementType' @ [224:59] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'isArray' @ [225:43] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'valueArgumentType' @ [225:51] ==> val valueArgumentType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'expressionType' @ [226:28] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'arguments' @ [226:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [226:53] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'expressionType' @ [227:28] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'arguments' @ [227:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [227:56] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [227:61] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'expectedType' @ [227:76] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'constructor' @ [227:89] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'actions' @ [228:25] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'add' @ [228:33] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeToUseSpreadOperatorFix' @ [228:37] ==> public constructor ChangeToUseSpreadOperatorFix(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.ChangeToUseSpreadOperatorFix[ClassConstructorDescriptorImpl]

'diagnosticElement' @ [228:66] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'actions' @ [233:16] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.doCreateActions[LocalVariableDescriptor]

'getInstance' @ [237:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'QuickFixFactoryForTypeMismatchError' @ [237:46] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError[FakeCallableDescriptorForObject]

'java' @ [237:89] ==> public val <T> KClass<QuickFixFactoryForTypeMismatchError>.java: Class<QuickFixFactoryForTypeMismatchError> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> QuickFixFactoryForTypeMismatchError

'safeGetDeclaration' @ [240:39] ==> @Nullable public open fun safeGetDeclaration(@Nullable p0: CallableDescriptor?): PsiElement? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'resolvedCall' @ [240:58] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion.getFunctionDeclaration[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [240:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'result' @ [241:17] ==> val result: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion.getFunctionDeclaration[LocalVariableDescriptor]

'result' @ [242:24] ==> val result: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.QuickFixFactoryForTypeMismatchError.Companion.getFunctionDeclaration[LocalVariableDescriptor]

