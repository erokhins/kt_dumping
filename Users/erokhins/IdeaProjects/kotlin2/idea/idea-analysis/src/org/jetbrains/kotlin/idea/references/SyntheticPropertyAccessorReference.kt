'KtSimpleReference<KtNameReferenceExpression>' @ [32:119] ==> public constructor KtSimpleReference<T : KtReferenceExpression>(expression: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.references.KtSimpleReference[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtReferenceExpression> -> KtNameReferenceExpression

'expression' @ [32:164] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.<init>[ValueParameterDescriptorImpl]

'super' @ [34:27] ==> <this> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[LazyClassReceiverParameterDescriptor]

'getTargetDescriptors' @ [34:33] ==> protected open fun getTargetDescriptors(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtSimpleReference[SimpleFunctionDescriptorImpl]

'context' @ [34:54] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'descriptors' @ [35:13] ==> val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'none' @ [35:25] ==> public inline fun <T> Iterable<DeclarationDescriptor>.none(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [35:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [35:80] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'SmartList' @ [37:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'descriptors' @ [38:28] ==> val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'descriptor' @ [39:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'if (getter) {
                    result.add(descriptor.getMethod)
                }
                else {
                    result.addIfNotNull(descriptor.setMethod)
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'getter' @ [40:21] ==> private final val getter: Boolean defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'result' @ [41:21] ==> val result: SmartList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'add' @ [41:28] ==> public open fun add(element: (FunctionDescriptor..FunctionDescriptor?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'descriptor' @ [41:32] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'getMethod' @ [41:43] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'result' @ [44:21] ==> val result: SmartList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [44:28] ==> public fun <T : Any> MutableCollection<(FunctionDescriptor..FunctionDescriptor?)>.addIfNotNull(t: FunctionDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'descriptor' @ [44:41] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'setMethod' @ [44:52] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'result' @ [48:16] ==> val result: SmartList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.getTargetDescriptors[LocalVariableDescriptor]

'element' @ [52:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isReferenceTo[ValueParameterDescriptorImpl]

'!' @ [52:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAccessorName' @ [52:39] ==> private final fun isAccessorName(name: String): Boolean defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[SimpleFunctionDescriptorImpl]

'element' @ [52:54] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isReferenceTo[ValueParameterDescriptorImpl]

'name' @ [52:62] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'super' @ [53:16] ==> <this> defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[LazyClassReceiverParameterDescriptor]

'isReferenceTo' @ [53:22] ==> public open fun isReferenceTo(element: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.references.KtSimpleReference[SimpleFunctionDescriptorImpl]

'element' @ [53:36] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isReferenceTo[ValueParameterDescriptorImpl]

'getter' @ [57:13] ==> private final val getter: Boolean defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'name' @ [58:20] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isAccessorName[ValueParameterDescriptorImpl]

'startsWith' @ [58:25] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [58:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isAccessorName[ValueParameterDescriptorImpl]

'startsWith' @ [58:51] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [60:16] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.isAccessorName[ValueParameterDescriptorImpl]

'startsWith' @ [60:21] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'TextRange' @ [63:40] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'expression' @ [63:53] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'textLength' @ [63:64] ==> public final val KtNameReferenceExpression.textLength: Int[MyPropertyDescriptor]

'KtPsiFactory' @ [68:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [68:43] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'createNameIdentifier' @ [68:55] ==> public final fun createNameIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newName' @ [68:76] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.renameByPropertyName[ValueParameterDescriptorImpl]

'expression' @ [69:9] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'getReferencedNameElement' @ [69:20] ==> public open fun getReferencedNameElement(): PsiElement defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'replace' @ [69:47] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'nameIdentifier' @ [69:55] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.renameByPropertyName[LocalVariableDescriptor]

'expression' @ [70:16] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [74:19] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newElementName' @ [74:37] ==> value-parameter newElementName: String? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[ValueParameterDescriptorImpl]

'expression' @ [74:63] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'identifier' @ [76:34] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newElementName' @ [76:45] ==> value-parameter newElementName: String? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[ValueParameterDescriptorImpl]

'if (getter) {
            SyntheticJavaPropertyDescriptor.propertyNameByGetMethodName(newNameAsName)
        }
        else {
            //TODO: it's not correct
            //TODO: setIsY -> setIsIsY bug
            SyntheticJavaPropertyDescriptor.propertyNameBySetMethodName(newNameAsName, withIsPrefix = expression.getReferencedNameAsName().asString().startsWith("is"))
        }' @ [77:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'getter' @ [77:27] ==> private final val getter: Boolean defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'SyntheticJavaPropertyDescriptor' @ [78:13] ==> public companion object defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[FakeCallableDescriptorForObject]

'propertyNameByGetMethodName' @ [78:45] ==> public final fun propertyNameByGetMethodName(methodName: Name): Name? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor.Companion[DeserializedSimpleFunctionDescriptor]

'newNameAsName' @ [78:73] ==> val newNameAsName: Name defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[LocalVariableDescriptor]

'SyntheticJavaPropertyDescriptor' @ [83:13] ==> public companion object defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[FakeCallableDescriptorForObject]

'propertyNameBySetMethodName' @ [83:45] ==> public final fun propertyNameBySetMethodName(methodName: Name, withIsPrefix: Boolean): Name? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor.Companion[DeserializedSimpleFunctionDescriptor]

'newNameAsName' @ [83:73] ==> val newNameAsName: Name defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[LocalVariableDescriptor]

'expression' @ [83:103] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'getReferencedNameAsName' @ [83:114] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'asString' @ [83:140] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'startsWith' @ [83:151] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newName' @ [85:13] ==> val newName: Name? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[LocalVariableDescriptor]

'expression' @ [85:37] ==> public final val expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[PropertyDescriptorImpl]

'renameByPropertyName' @ [87:16] ==> private final fun renameByPropertyName(newName: String): PsiElement? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[SimpleFunctionDescriptorImpl]

'newName' @ [87:37] ==> val newName: Name? defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.handleElementRename[LocalVariableDescriptor]

'identifier' @ [87:45] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'listOf' @ [91:17] ==> public fun <T> listOf(element: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [91:24] ==> public final val SyntheticPropertyAccessorReference.element: (KtNameReferenceExpression..KtNameReferenceExpression?)[MyPropertyDescriptor]

'getReferencedNameAsName' @ [91:32] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'SyntheticPropertyAccessorReference' @ [93:59] ==> private constructor SyntheticPropertyAccessorReference(expression: KtNameReferenceExpression, getter: Boolean) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[ClassConstructorDescriptorImpl]

'expression' @ [93:94] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Getter.<init>[ValueParameterDescriptorImpl]

'SyntheticPropertyAccessorReference' @ [94:59] ==> private constructor SyntheticPropertyAccessorReference(expression: KtNameReferenceExpression, getter: Boolean) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference[ClassConstructorDescriptorImpl]

'expression' @ [94:94] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Setter.<init>[ValueParameterDescriptorImpl]

