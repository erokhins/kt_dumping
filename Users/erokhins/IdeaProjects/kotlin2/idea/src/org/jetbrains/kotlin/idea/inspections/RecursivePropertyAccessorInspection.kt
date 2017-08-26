'AbstractKotlinInspection' @ [35:45] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [38:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [40:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitSimpleNameExpression' @ [40:23] ==> public open fun visitSimpleNameExpression(@NotNull p0: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [40:49] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'if (isRecursivePropertyAccess(expression)) {
                    holder.registerProblem(expression,
                                           "Recursive property accessor",
                                           ProblemHighlightType.GENERIC_ERROR_OR_WARNING,
                                           ReplaceWithFieldFix())
                }
                else if (isRecursiveSyntheticPropertyAccess(expression)) {
                    holder.registerProblem(expression,
                                           "Recursive synthetic property accessor",
                                           ProblemHighlightType.GENERIC_ERROR_OR_WARNING)
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isRecursivePropertyAccess' @ [41:21] ==> public final fun isRecursivePropertyAccess(element: KtElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [41:47] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'holder' @ [42:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [42:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [42:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'GENERIC_ERROR_OR_WARNING' @ [44:65] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'ReplaceWithFieldFix' @ [45:44] ==> public constructor ReplaceWithFieldFix() defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.ReplaceWithFieldFix[ClassConstructorDescriptorImpl]

'isRecursiveSyntheticPropertyAccess' @ [47:26] ==> public final fun isRecursiveSyntheticPropertyAccess(element: KtElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [47:61] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'holder' @ [48:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [48:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [48:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.buildVisitor.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'GENERIC_ERROR_OR_WARNING' @ [50:65] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'name' @ [60:40] ==> public final val RecursivePropertyAccessorInspection.ReplaceWithFieldFix.name: String[MyPropertyDescriptor]

'descriptor' @ [63:30] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.ReplaceWithFieldFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [63:41] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KtPsiFactory' @ [64:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [64:40] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.ReplaceWithFieldFix.applyFix[LocalVariableDescriptor]

'expression' @ [65:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.ReplaceWithFieldFix.applyFix[LocalVariableDescriptor]

'replace' @ [65:24] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'factory' @ [65:32] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.ReplaceWithFieldFix.applyFix[LocalVariableDescriptor]

'createExpression' @ [65:40] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'this' @ [72:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isAssignmentTo[ReceiverParameterDescriptorImpl]

'isAssignment' @ [72:43] ==> public open fun isAssignment(@NotNull p0: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [72:56] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isAssignmentTo[ReceiverParameterDescriptorImpl]

'isAncestor' @ [72:77] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'left' @ [72:88] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [72:94] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isAssignmentTo[ValueParameterDescriptorImpl]

'expression' @ [75:30] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [75:41] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'if (isGetter) {
                if (binaryExpr.isAssignmentTo(expression)) {
                    return KtTokens.AUGMENTED_ASSIGNMENTS.contains(binaryExpr?.operationToken)
                }
                return true
            }
            else /* isSetter */ {
                if (binaryExpr.isAssignmentTo(expression)) {
                    return true
                }
                val unaryExpr = expression.getStrictParentOfType<KtUnaryExpression>()
                if (unaryExpr?.operationToken.let { it == KtTokens.PLUSPLUS || it == KtTokens.MINUSMINUS }) {
                    return true
                }
            }' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isGetter' @ [76:17] ==> value-parameter isGetter: Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[ValueParameterDescriptorImpl]

'binaryExpr' @ [77:21] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[LocalVariableDescriptor]

'isAssignmentTo' @ [77:32] ==> private final fun KtBinaryExpression?.isAssignmentTo(expression: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [77:47] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[ValueParameterDescriptorImpl]

'AUGMENTED_ASSIGNMENTS' @ [78:37] ==> public final val AUGMENTED_ASSIGNMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'contains' @ [78:59] ==> public open operator fun contains(@Nullable p0: IElementType?): Boolean defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'binaryExpr' @ [78:68] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[LocalVariableDescriptor]

'operationToken' @ [78:80] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'binaryExpr' @ [83:21] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[LocalVariableDescriptor]

'isAssignmentTo' @ [83:32] ==> private final fun KtBinaryExpression?.isAssignmentTo(expression: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [83:47] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[ValueParameterDescriptorImpl]

'expression' @ [86:33] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [86:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtUnaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUnaryExpression

'unaryExpr' @ [87:21] ==> val unaryExpr: KtUnaryExpression? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor[LocalVariableDescriptor]

'operationToken' @ [87:32] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'let' @ [87:47] ==> @InlineOnly public inline fun <T, R> IElementType?.let(block: (IElementType?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IElementType?
    <R> -> Boolean

'it' @ [87:53] ==> value-parameter it: IElementType? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor.<anonymous>[ValueParameterDescriptorImpl]

'PLUSPLUS' @ [87:68] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [87:80] ==> value-parameter it: IElementType? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isSameAccessor.<anonymous>[ValueParameterDescriptorImpl]

'MINUSMINUS' @ [87:95] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [95:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'element' @ [96:36] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'getParentOfType' @ [96:44] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclarationWithBody? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclarationWithBody

'element' @ [97:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'text' @ [97:25] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'propertyAccessor' @ [97:33] ==> val propertyAccessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'property' @ [97:50] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'name' @ [97:59] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'element' @ [98:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'analyze' @ [98:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [99:26] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [99:41] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [99:59] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'target' @ [100:17] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'bindingContext' @ [100:27] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [100:57] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'propertyAccessor' @ [100:84] ==> val propertyAccessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'property' @ [100:101] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'element' @ [101:14] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'parent' @ [101:22] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [101:57] ==> @InlineOnly public inline fun <T, R> KtQualifiedExpression.let(block: (KtQualifiedExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtQualifiedExpression
    <R> -> Unit

'it' @ [102:21] ==> value-parameter it: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [102:24] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'text' @ [102:43] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'THIS_KEYWORD' @ [102:60] ==> public final val THIS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [102:73] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'!' @ [102:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [102:83] ==> value-parameter it: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess.<anonymous>[ValueParameterDescriptorImpl]

'hasObjectReceiver' @ [102:86] ==> private final fun KtQualifiedExpression.hasObjectReceiver(context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [102:104] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'isSameAccessor' @ [104:20] ==> private final fun isSameAccessor(expression: KtSimpleNameExpression, isGetter: Boolean): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'element' @ [104:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[ValueParameterDescriptorImpl]

'propertyAccessor' @ [104:44] ==> val propertyAccessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursivePropertyAccess[LocalVariableDescriptor]

'isGetter' @ [104:61] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'element' @ [108:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'element' @ [109:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'getParentOfType' @ [109:41] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclarationWithBody? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclarationWithBody

'namedFunction' @ [110:24] ==> val namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'name' @ [110:38] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'element' @ [111:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'text' @ [111:42] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'capitalize' @ [111:47] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [112:28] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'referencedName' @ [112:41] ==> val referencedName: String defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'name' @ [113:28] ==> val name: String defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'referencedName' @ [113:41] ==> val referencedName: String defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'!' @ [114:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGetter' @ [114:18] ==> val isGetter: Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'!' @ [114:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSetter' @ [114:31] ==> val isSetter: Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'element' @ [115:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'analyze' @ [115:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [116:39] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [116:54] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [116:72] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'bindingContext' @ [117:43] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [117:58] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'namedFunction' @ [117:85] ==> val namedFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'namedFunctionDescriptor' @ [118:17] ==> val namedFunctionDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'syntheticDescriptor' @ [118:44] ==> val syntheticDescriptor: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'getMethod' @ [118:64] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'namedFunctionDescriptor' @ [119:17] ==> val namedFunctionDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'syntheticDescriptor' @ [119:44] ==> val syntheticDescriptor: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'setMethod' @ [119:64] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'isSameAccessor' @ [120:20] ==> private final fun isSameAccessor(expression: KtSimpleNameExpression, isGetter: Boolean): Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion[SimpleFunctionDescriptorImpl]

'element' @ [120:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[ValueParameterDescriptorImpl]

'isGetter' @ [120:44] ==> val isGetter: Boolean defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.isRecursiveSyntheticPropertyAccess[LocalVariableDescriptor]

'receiverExpression' @ [124:28] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'==' @ [125:20] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'context' @ [125:21] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.hasObjectReceiver[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [125:29] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [125:47] ==> val receiver: KtReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.RecursivePropertyAccessorInspection.Companion.hasObjectReceiver[LocalVariableDescriptor]

'kind' @ [125:79] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [125:97] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

