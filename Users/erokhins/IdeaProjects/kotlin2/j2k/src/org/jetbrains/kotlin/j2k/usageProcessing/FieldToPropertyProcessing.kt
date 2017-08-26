'this' @ [34:52] ==> <this> defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[LazyClassReceiverParameterDescriptor]

'field' @ [34:57] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'if (field.name != propertyName || replaceReadWithFieldReference || replaceWriteWithFieldReference) MyConvertedCodeProcessor() else null' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConvertedCodeProcessor?, elseBranch: ConvertedCodeProcessor?): ConvertedCodeProcessor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConvertedCodeProcessor?

'field' @ [37:17] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'name' @ [37:23] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'propertyName' @ [37:31] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'replaceReadWithFieldReference' @ [37:47] ==> private final val replaceReadWithFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'replaceWriteWithFieldReference' @ [37:80] ==> private final val replaceWriteWithFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'MyConvertedCodeProcessor' @ [37:112] ==> public constructor MyConvertedCodeProcessor() defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor[ClassConstructorDescriptorImpl]

'when {
                field.hasModifierProperty(PsiModifier.PRIVATE) -> emptyList()
                field.name != propertyName -> listOf(ElementRenamedCodeProcessor(propertyName), UseAccessorsJavaCodeProcessor())
                else -> listOf(UseAccessorsJavaCodeProcessor())
            }' @ [40:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ExternalCodeProcessor>, entry1: List<ExternalCodeProcessor>, entry2: List<ExternalCodeProcessor>): List<ExternalCodeProcessor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<ExternalCodeProcessor>

'field' @ [41:17] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'hasModifierProperty' @ [41:23] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'PRIVATE' @ [41:55] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'emptyList' @ [41:67] ==> public fun <T> emptyList(): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'field' @ [42:17] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'name' @ [42:23] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'propertyName' @ [42:31] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'listOf' @ [42:47] ==> public fun <T> listOf(vararg elements: ExternalCodeProcessor): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'ElementRenamedCodeProcessor' @ [42:54] ==> public constructor ElementRenamedCodeProcessor(newName: String) defined in org.jetbrains.kotlin.j2k.usageProcessing.ElementRenamedCodeProcessor[ClassConstructorDescriptorImpl]

'propertyName' @ [42:82] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'UseAccessorsJavaCodeProcessor' @ [42:97] ==> public constructor UseAccessorsJavaCodeProcessor() defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[ClassConstructorDescriptorImpl]

'listOf' @ [43:25] ==> public fun <T> listOf(element: FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor): List<FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UseAccessorsJavaCodeProcessor

'UseAccessorsJavaCodeProcessor' @ [43:32] ==> public constructor UseAccessorsJavaCodeProcessor() defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[ClassConstructorDescriptorImpl]

'if (field.name != propertyName)
                listOf(ElementRenamedCodeProcessor(propertyName))
            else
                emptyList()' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ElementRenamedCodeProcessor>, elseBranch: List<ElementRenamedCodeProcessor>): List<ElementRenamedCodeProcessor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ElementRenamedCodeProcessor>

'field' @ [47:17] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'name' @ [47:23] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'propertyName' @ [47:31] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'listOf' @ [48:17] ==> public fun <T> listOf(element: ElementRenamedCodeProcessor): List<ElementRenamedCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementRenamedCodeProcessor

'ElementRenamedCodeProcessor' @ [48:24] ==> public constructor ElementRenamedCodeProcessor(newName: String) defined in org.jetbrains.kotlin.j2k.usageProcessing.ElementRenamedCodeProcessor[ClassConstructorDescriptorImpl]

'propertyName' @ [48:52] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'emptyList' @ [50:17] ==> public fun <T> emptyList(): List<ElementRenamedCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementRenamedCodeProcessor

'replaceReadWithFieldReference' @ [54:37] ==> private final val replaceReadWithFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'isAccessedForReading' @ [54:78] ==> public open fun isAccessedForReading(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'expression' @ [54:99] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'replaceWriteWithFieldReference' @ [55:40] ==> private final val replaceWriteWithFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'isAccessedForWriting' @ [55:82] ==> public open fun isAccessedForWriting(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'expression' @ [55:103] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'Identifier' @ [58:30] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [58:41] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'if (useFieldReference) "field" else propertyName' @ [58:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'useFieldReference' @ [58:61] ==> val useFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'propertyName' @ [58:93] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'isNullable' @ [58:107] ==> private final val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'expression' @ [60:29] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'qualifierExpression' @ [60:40] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'if (qualifier != null && !useFieldReference) {
                return QualifiedExpression(codeConverter.convertExpression(qualifier), identifier, expression.dot())
            }
            else {
                // check if field name is shadowed
                val elementFactory = PsiElementFactory.SERVICE.getInstance(expression.project)
                val refExpr = try {
                    elementFactory.createExpressionFromText(identifier.name, expression) as? PsiReferenceExpression ?: return identifier
                }
                catch(e: IncorrectOperationException) {
                    return identifier
                }
                return if (refExpr.resolve() == null)
                    identifier
                else
                    QualifiedExpression(ThisExpression(Identifier.Empty).assignNoPrototype(), identifier, null) //TODO: this is not correct in case of nested/anonymous classes
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'qualifier' @ [61:17] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'!' @ [61:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useFieldReference' @ [61:39] ==> val useFieldReference: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'QualifiedExpression' @ [62:24] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'codeConverter' @ [62:44] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'convertExpression' @ [62:58] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'qualifier' @ [62:76] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'identifier' @ [62:88] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'expression' @ [62:100] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'dot' @ [62:111] ==> public fun PsiReferenceExpression.dot(): PsiElement? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'getInstance' @ [66:64] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'expression' @ [66:76] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'project' @ [66:87] ==> public final val PsiReferenceExpression.project: Project[MyPropertyDescriptor]

'elementFactory' @ [68:21] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'createExpressionFromText' @ [68:36] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'identifier' @ [68:61] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'name' @ [68:72] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'expression' @ [68:78] ==> value-parameter expression: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[ValueParameterDescriptorImpl]

'identifier' @ [68:127] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'identifier' @ [71:28] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'if (refExpr.resolve() == null)
                    identifier
                else
                    QualifiedExpression(ThisExpression(Identifier.Empty).assignNoPrototype(), identifier, null)' @ [73:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression?, elseBranch: Expression?): Expression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression?

'refExpr' @ [73:28] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'resolve' @ [73:36] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'identifier' @ [74:21] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'QualifiedExpression' @ [76:21] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'ThisExpression' @ [76:41] ==> public constructor ThisExpression(identifier: Identifier) defined in org.jetbrains.kotlin.j2k.ast.ThisExpression[ClassConstructorDescriptorImpl]

'Identifier' @ [76:56] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [76:67] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [76:74] ==> public fun <TElement : Element> ThisExpression.assignNoPrototype(): ThisExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ThisExpression

'identifier' @ [76:95] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.MyConvertedCodeProcessor.convertVariableUsage[LocalVariableDescriptor]

'getInstance' @ [82:57] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'field' @ [82:69] ==> private final val field: PsiField defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'project' @ [82:75] ==> public final val PsiField.project: Project[MyPropertyDescriptor]

'reference' @ [85:27] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[ValueParameterDescriptorImpl]

'element' @ [85:37] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refExpr' @ [86:29] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'qualifierExpression' @ [86:37] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'refExpr' @ [88:26] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [88:34] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is PsiAssignmentExpression -> {
                    if (refExpr == parent.lExpression) {
                        if (parent.operationTokenType == JavaTokenType.EQ) {
                            val callExpr = parent.replace(generateSetterCall(qualifier, parent.rExpression ?: return null)) as PsiMethodCallExpression
                            return arrayOf(callExpr.methodExpression)
                        }
                        else {
                            val assignmentOpText = parent.operationSign.text
                            assert(assignmentOpText.endsWith("="))
                            val opText = assignmentOpText.substring(0, assignmentOpText.length - 1)
                            return parent.replaceWithModificationCalls(qualifier, opText, parent.rExpression ?: return null)
                        }
                    }
                }

                is PsiPrefixExpression, is PsiPostfixExpression -> {
                    //TODO: what if it's used as value?
                    val operationType = (parent as? PsiPrefixExpression)?.operationTokenType
                                        ?: (parent as PsiPostfixExpression).operationTokenType
                    val opText = when (operationType) {
                        JavaTokenType.PLUSPLUS -> "+"
                        JavaTokenType.MINUSMINUS -> "-"
                        else -> null
                    }
                    if (opText != null) {
                        return (parent as PsiExpression).replaceWithModificationCalls(qualifier, opText, factory.createExpressionFromText("1", null))
                    }
                }
            }' @ [89:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [89:19] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'refExpr' @ [91:25] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [91:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'lExpression' @ [91:43] ==> public final val PsiAssignmentExpression.lExpression: PsiExpression[MyPropertyDescriptor]

'if (parent.operationTokenType == JavaTokenType.EQ) {
                            val callExpr = parent.replace(generateSetterCall(qualifier, parent.rExpression ?: return null)) as PsiMethodCallExpression
                            return arrayOf(callExpr.methodExpression)
                        }
                        else {
                            val assignmentOpText = parent.operationSign.text
                            assert(assignmentOpText.endsWith("="))
                            val opText = assignmentOpText.substring(0, assignmentOpText.length - 1)
                            return parent.replaceWithModificationCalls(qualifier, opText, parent.rExpression ?: return null)
                        }' @ [92:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'parent' @ [92:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'operationTokenType' @ [92:36] ==> public final val PsiAssignmentExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'EQ' @ [92:72] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'parent' @ [93:44] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [93:51] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'generateSetterCall' @ [93:59] ==> private final fun generateSetterCall(qualifier: PsiExpression?, value: PsiExpression): PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [93:78] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [93:89] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'rExpression' @ [93:96] ==> public final val PsiAssignmentExpression.rExpression: PsiExpression?[MyPropertyDescriptor]

'arrayOf' @ [94:36] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'callExpr' @ [94:44] ==> val callExpr: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'methodExpression' @ [94:53] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'parent' @ [97:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'operationSign' @ [97:59] ==> public final val PsiAssignmentExpression.operationSign: PsiJavaToken[MyPropertyDescriptor]

'text' @ [97:73] ==> public final val PsiJavaToken.text: (String..String?)[MyPropertyDescriptor]

'assert' @ [98:29] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assignmentOpText' @ [98:36] ==> val assignmentOpText: (String..String?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'endsWith' @ [98:53] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assignmentOpText' @ [99:42] ==> val assignmentOpText: (String..String?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'substring' @ [99:59] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assignmentOpText' @ [99:72] ==> val assignmentOpText: (String..String?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'length' @ [99:89] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'parent' @ [100:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'replaceWithModificationCalls' @ [100:43] ==> private final fun PsiExpression.replaceWithModificationCalls(qualifier: PsiExpression?, op: String, value: PsiExpression): Array<PsiReference> defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [100:72] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'opText' @ [100:83] ==> val opText: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [100:91] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'rExpression' @ [100:98] ==> public final val PsiAssignmentExpression.rExpression: PsiExpression?[MyPropertyDescriptor]

'?:' @ [107:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: IElementType?, right: IElementType): IElementType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> IElementType

'parent' @ [107:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'operationTokenType' @ [107:75] ==> public final val PsiPrefixExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'parent' @ [108:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'operationTokenType' @ [108:77] ==> public final val PsiPostfixExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'when (operationType) {
                        JavaTokenType.PLUSPLUS -> "+"
                        JavaTokenType.MINUSMINUS -> "-"
                        else -> null
                    }' @ [109:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'operationType' @ [109:40] ==> val operationType: IElementType defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'PLUSPLUS' @ [110:39] ==> public final val PLUSPLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUSMINUS' @ [111:39] ==> public final val MINUSMINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'opText' @ [114:25] ==> val opText: String? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [115:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'replaceWithModificationCalls' @ [115:58] ==> private final fun PsiExpression.replaceWithModificationCalls(qualifier: PsiExpression?, op: String, value: PsiExpression): Array<PsiReference> defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [115:87] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'opText' @ [115:98] ==> val opText: String? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'factory' @ [115:106] ==> private final val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[PropertyDescriptorImpl]

'createExpressionFromText' @ [115:114] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'refExpr' @ [120:28] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [120:36] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'generateGetterCall' @ [120:44] ==> private final fun generateGetterCall(qualifier: PsiExpression?): PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [120:63] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'arrayOf' @ [121:20] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'callExpr' @ [121:28] ==> val callExpr: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.processUsage[LocalVariableDescriptor]

'methodExpression' @ [121:37] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'generateGetterCall' @ [126:27] ==> private final fun generateGetterCall(qualifier: PsiExpression?): PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [126:46] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[ValueParameterDescriptorImpl]

'factory' @ [128:26] ==> private final val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[PropertyDescriptorImpl]

'createExpressionFromText' @ [128:34] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'op' @ [128:63] ==> value-parameter op: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[ValueParameterDescriptorImpl]

'binary' @ [129:13] ==> var binary: PsiBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'lOperand' @ [129:20] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'replace' @ [129:29] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiExpression[JavaMethodDescriptor]

'getCall' @ [129:37] ==> var getCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'binary' @ [130:13] ==> var binary: PsiBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'rOperand' @ [130:20] ==> public final val PsiBinaryExpression.rOperand: PsiExpression?[MyPropertyDescriptor]

'replace' @ [130:31] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiExpression[JavaMethodDescriptor]

'value' @ [130:39] ==> value-parameter value: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[ValueParameterDescriptorImpl]

'generateSetterCall' @ [132:27] ==> private final fun generateSetterCall(qualifier: PsiExpression?, value: PsiExpression): PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[SimpleFunctionDescriptorImpl]

'qualifier' @ [132:46] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[ValueParameterDescriptorImpl]

'binary' @ [132:57] ==> var binary: PsiBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'setCall' @ [133:13] ==> var setCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'this' @ [133:23] ==> <this> defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[ReceiverParameterDescriptorImpl]

'replace' @ [133:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiExpression[JavaMethodDescriptor]

'setCall' @ [133:36] ==> var setCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'binary' @ [135:13] ==> var binary: PsiBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'setCall' @ [135:22] ==> var setCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'argumentList' @ [135:30] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [135:43] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'single' @ [135:55] ==> public fun <T> Array<out (PsiExpression..PsiExpression?)>.single(): (PsiExpression..PsiExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'getCall' @ [136:13] ==> var getCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'binary' @ [136:23] ==> var binary: PsiBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'lOperand' @ [136:30] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'arrayOf' @ [138:20] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'getCall' @ [138:28] ==> var getCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'methodExpression' @ [138:36] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'setCall' @ [138:54] ==> var setCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.replaceWithModificationCalls[LocalVariableDescriptor]

'methodExpression' @ [138:62] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'accessorName' @ [142:24] ==> private final fun accessorName(kind: AccessorKind): String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[SimpleFunctionDescriptorImpl]

'GETTER' @ [142:50] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'if (qualifier != null)
                "${qualifier.text}.$text"
            else
                text' @ [143:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'qualifier' @ [143:38] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateGetterCall[ValueParameterDescriptorImpl]

'qualifier' @ [144:20] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateGetterCall[ValueParameterDescriptorImpl]

'text' @ [144:30] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'text' @ [144:37] ==> val text: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateGetterCall[LocalVariableDescriptor]

'text' @ [146:17] ==> val text: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateGetterCall[LocalVariableDescriptor]

'factory' @ [147:20] ==> private final val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[PropertyDescriptorImpl]

'createExpressionFromText' @ [147:28] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'expressionText' @ [147:53] ==> val expressionText: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateGetterCall[LocalVariableDescriptor]

'accessorName' @ [151:24] ==> private final fun accessorName(kind: AccessorKind): String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[SimpleFunctionDescriptorImpl]

'SETTER' @ [151:50] ==> enum entry SETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'value' @ [151:66] ==> value-parameter value: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[ValueParameterDescriptorImpl]

'text' @ [151:72] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'if (qualifier != null)
                "${qualifier.text}.$text"
            else
                text' @ [152:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'qualifier' @ [152:38] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[ValueParameterDescriptorImpl]

'qualifier' @ [153:20] ==> value-parameter qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[ValueParameterDescriptorImpl]

'text' @ [153:30] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'text' @ [153:37] ==> val text: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[LocalVariableDescriptor]

'text' @ [155:17] ==> val text: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[LocalVariableDescriptor]

'factory' @ [156:20] ==> private final val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor[PropertyDescriptorImpl]

'createExpressionFromText' @ [156:28] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'expressionText' @ [156:53] ==> val expressionText: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.UseAccessorsJavaCodeProcessor.generateSetterCall[LocalVariableDescriptor]

'+' @ [161:15] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (kind == AccessorKind.GETTER) "get" else "set"' @ [161:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'kind' @ [161:20] ==> value-parameter kind: AccessorKind defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing.accessorName[ValueParameterDescriptorImpl]

'GETTER' @ [161:41] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'propertyName' @ [161:69] ==> private final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[PropertyDescriptorImpl]

'capitalize' @ [161:82] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

