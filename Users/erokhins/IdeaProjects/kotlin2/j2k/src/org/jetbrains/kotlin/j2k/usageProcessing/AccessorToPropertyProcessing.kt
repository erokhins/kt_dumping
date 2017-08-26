'accessorMethod' @ [27:52] ==> public final val accessorMethod: PsiMethod defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'codeConverter' @ [31:30] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'typeConverter' @ [31:44] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'methodNullability' @ [31:58] ==> public final fun methodNullability(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'accessorMethod' @ [31:76] ==> public final val accessorMethod: PsiMethod defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'isNullable' @ [31:92] ==> public fun Nullability.isNullable(settings: ConverterSettings): Boolean defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]

'codeConverter' @ [31:103] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'settings' @ [31:117] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'methodCall' @ [33:30] ==> value-parameter methodCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'methodExpression' @ [33:41] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'methodCall' @ [34:29] ==> value-parameter methodCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'argumentList' @ [34:40] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [34:53] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'Identifier' @ [36:32] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [36:43] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'propertyName' @ [36:59] ==> public final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'isNullable' @ [36:73] ==> val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'methodExpr' @ [37:29] ==> val methodExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'qualifierExpression' @ [37:40] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'if (qualifier != null)
                QualifiedExpression(codeConverter.convertExpression(qualifier), propertyName, methodExpr.dot()).assignNoPrototype()
            else
                propertyName' @ [38:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'qualifier' @ [38:38] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'QualifiedExpression' @ [39:17] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'codeConverter' @ [39:37] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'convertExpression' @ [39:51] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'qualifier' @ [39:69] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'propertyName' @ [39:81] ==> val propertyName: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'methodExpr' @ [39:95] ==> val methodExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'dot' @ [39:106] ==> public fun PsiReferenceExpression.dot(): PsiElement? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [39:113] ==> public fun <TElement : Element> QualifiedExpression.assignNoPrototype(): QualifiedExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> QualifiedExpression

'propertyName' @ [41:17] ==> val propertyName: Identifier defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'if (accessorKind == AccessorKind.GETTER) {
                if (arguments.isNotEmpty()) return null // incorrect call
                return propertyAccess
            }
            else {
                if (arguments.size != 1) return null // incorrect call
                val argument = codeConverter.convertExpression(arguments[0])
                return AssignmentExpression(propertyAccess, argument, Operator.EQ)
            }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'accessorKind' @ [43:17] ==> public final val accessorKind: AccessorKind defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'GETTER' @ [43:46] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'arguments' @ [44:21] ==> val arguments: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'isNotEmpty' @ [44:31] ==> @InlineOnly public inline fun <T> Array<out (PsiExpression..PsiExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'propertyAccess' @ [45:24] ==> val propertyAccess: Expression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'arguments' @ [48:21] ==> val arguments: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'size' @ [48:31] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'codeConverter' @ [49:32] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[ValueParameterDescriptorImpl]

'convertExpression' @ [49:46] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'arguments' @ [49:64] ==> val arguments: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'AssignmentExpression' @ [50:24] ==> public constructor AssignmentExpression(left: Expression, right: Expression, op: Operator) defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[ClassConstructorDescriptorImpl]

'propertyAccess' @ [50:45] ==> val propertyAccess: Expression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'argument' @ [50:61] ==> val argument: Expression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.convertedCodeProcessor.<no name provided>.convertMethodUsage[LocalVariableDescriptor]

'Operator' @ [50:71] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Operator[FakeCallableDescriptorForObject]

'EQ' @ [50:80] ==> public final val EQ: Operator defined in org.jetbrains.kotlin.j2k.ast.Operator.Companion[PropertyDescriptorImpl]

'emptyList' @ [55:39] ==> public fun <T> emptyList(): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'if (accessorMethod.hasModifierProperty(PsiModifier.PRIVATE))
                emptyList()
            else
                listOf(AccessorToPropertyProcessor())' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<AccessorToPropertyProcessing.AccessorToPropertyProcessor>, elseBranch: List<AccessorToPropertyProcessing.AccessorToPropertyProcessor>): List<AccessorToPropertyProcessing.AccessorToPropertyProcessor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<AccessorToPropertyProcessor>

'accessorMethod' @ [58:17] ==> public final val accessorMethod: PsiMethod defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'hasModifierProperty' @ [58:32] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PRIVATE' @ [58:64] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'emptyList' @ [59:17] ==> public fun <T> emptyList(): List<AccessorToPropertyProcessing.AccessorToPropertyProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AccessorToPropertyProcessor

'listOf' @ [61:17] ==> public fun <T> listOf(element: AccessorToPropertyProcessing.AccessorToPropertyProcessor): List<AccessorToPropertyProcessing.AccessorToPropertyProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AccessorToPropertyProcessor

'AccessorToPropertyProcessor' @ [61:24] ==> public constructor AccessorToPropertyProcessor() defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor[ClassConstructorDescriptorImpl]

'reference' @ [65:28] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[ValueParameterDescriptorImpl]

'element' @ [65:38] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nameExpr' @ [66:28] ==> val nameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [66:37] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpr' @ [68:29] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'valueArguments' @ [68:38] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'KtPsiFactory' @ [70:27] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'nameExpr' @ [70:40] ==> val nameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'project' @ [70:49] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'factory' @ [71:36] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'createSimpleName' @ [71:44] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'propertyName' @ [71:61] ==> public final val propertyName: String defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'if (accessorKind == AccessorKind.GETTER) {
                if (arguments.size != 0) return null // incorrect call
                propertyNameExpr = callExpr.replace(propertyNameExpr) as KtSimpleNameExpression
                return propertyNameExpr.references
            }
            else {
                val value = arguments.singleOrNull()?.getArgumentExpression() ?: return null
                var assignment = factory.createExpression("a = b") as KtBinaryExpression
                assignment.right!!.replace(value)

                val qualifiedExpression = callExpr.parent as? KtQualifiedExpression
                return if (qualifiedExpression != null && qualifiedExpression.selectorExpression == callExpr) {
                    callExpr.replace(propertyNameExpr)
                    assignment.left!!.replace(qualifiedExpression)
                    assignment = qualifiedExpression.replace(assignment) as KtBinaryExpression
                    (assignment.left as KtQualifiedExpression).selectorExpression!!.references
                }
                else {
                    assignment.left!!.replace(propertyNameExpr)
                    assignment = callExpr.replace(assignment) as KtBinaryExpression
                    assignment.left!!.references
                }
            }' @ [72:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'accessorKind' @ [72:17] ==> public final val accessorKind: AccessorKind defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing[PropertyDescriptorImpl]

'GETTER' @ [72:46] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'arguments' @ [73:21] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'size' @ [73:31] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'propertyNameExpr' @ [74:17] ==> var propertyNameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'callExpr' @ [74:36] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [74:45] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'propertyNameExpr' @ [74:53] ==> var propertyNameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'propertyNameExpr' @ [75:24] ==> var propertyNameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'references' @ [75:41] ==> public final val KtSimpleNameExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'arguments' @ [78:29] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'singleOrNull' @ [78:39] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [78:55] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'factory' @ [79:34] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'createExpression' @ [79:42] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'assignment' @ [80:17] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'right' @ [80:28] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'replace' @ [80:36] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'value' @ [80:44] ==> val value: KtExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'callExpr' @ [82:43] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'parent' @ [82:52] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (qualifiedExpression != null && qualifiedExpression.selectorExpression == callExpr) {
                    callExpr.replace(propertyNameExpr)
                    assignment.left!!.replace(qualifiedExpression)
                    assignment = qualifiedExpression.replace(assignment) as KtBinaryExpression
                    (assignment.left as KtQualifiedExpression).selectorExpression!!.references
                }
                else {
                    assignment.left!!.replace(propertyNameExpr)
                    assignment = callExpr.replace(assignment) as KtBinaryExpression
                    assignment.left!!.references
                }' @ [83:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<PsiReference>?, elseBranch: Array<PsiReference>?): Array<PsiReference>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<PsiReference>?

'qualifiedExpression' @ [83:28] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'qualifiedExpression' @ [83:59] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'selectorExpression' @ [83:79] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'callExpr' @ [83:101] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'callExpr' @ [84:21] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [84:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'propertyNameExpr' @ [84:38] ==> var propertyNameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'assignment' @ [85:21] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'left' @ [85:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'replace' @ [85:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'qualifiedExpression' @ [85:47] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'assignment' @ [86:21] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'qualifiedExpression' @ [86:34] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [86:54] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[JavaMethodDescriptor]

'assignment' @ [86:62] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'!!' @ [87:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'assignment' @ [87:22] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'left' @ [87:33] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'selectorExpression' @ [87:64] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'references' @ [87:85] ==> public final val KtExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'assignment' @ [90:21] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'left' @ [90:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'replace' @ [90:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'propertyNameExpr' @ [90:47] ==> var propertyNameExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'assignment' @ [91:21] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'callExpr' @ [91:34] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'replace' @ [91:43] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'assignment' @ [91:51] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'assignment' @ [92:21] ==> var assignment: KtBinaryExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.AccessorToPropertyProcessing.AccessorToPropertyProcessor.processUsage[LocalVariableDescriptor]

'left' @ [92:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'references' @ [92:39] ==> public final val KtExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

