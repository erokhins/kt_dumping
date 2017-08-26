'getter' @ [38:22] ==> public final val getter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[DeserializedPropertyDescriptor]

'setter' @ [39:22] ==> public final val setter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[DeserializedPropertyDescriptor]

'ArrayList' @ [41:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'readable' @ [42:13] ==> value-parameter readable: Boolean = ... defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ValueParameterDescriptorImpl]

'getter' @ [42:25] ==> val getter: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'result' @ [42:41] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'add' @ [42:48] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getter' @ [42:52] ==> val getter: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'name' @ [42:59] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'writable' @ [43:13] ==> value-parameter writable: Boolean = ... defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ValueParameterDescriptorImpl]

'setter' @ [43:25] ==> val setter: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'result' @ [43:41] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'add' @ [43:48] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'setter' @ [43:52] ==> val setter: PsiMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'name' @ [43:59] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'result' @ [44:16] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames.toNameList[LocalVariableDescriptor]

'this' @ [47:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ReceiverParameterDescriptorImpl]

'isLocal' @ [47:45] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [47:53] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ReceiverParameterDescriptorImpl]

'emptyList' @ [47:79] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'when (this) {
        is KtProperty ->
            return LightClassUtil.getLightClassPropertyMethods(this).toNameList()
        is KtParameter ->
            if (hasValOrVar()) {
                return LightClassUtil.getLightClassPropertyMethods(this).toNameList()
            }
    }' @ [49:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [49:11] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ReceiverParameterDescriptorImpl]

'LightClassUtil' @ [51:20] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [51:35] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [51:64] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ReceiverParameterDescriptorImpl]

'toNameList' @ [51:70] ==> local final fun LightClassUtil.PropertyAccessorsPsiMethods.toNameList(): List<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[SimpleFunctionDescriptorImpl]

'hasValOrVar' @ [53:17] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'LightClassUtil' @ [54:24] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [54:39] ==> public final fun getLightClassPropertyMethods(parameter: KtParameter): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [54:68] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[ReceiverParameterDescriptorImpl]

'toNameList' @ [54:74] ==> local final fun LightClassUtil.PropertyAccessorsPsiMethods.toNameList(): List<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getAccessorNames[SimpleFunctionDescriptorImpl]

'emptyList' @ [58:24] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'if (this is KtObjectDeclaration && this.isCompanion()) {
        getNonStrictParentOfType<KtClass>()?.name
    } else {
        null
    }' @ [62:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'this' @ [62:16] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getClassNameForCompanionObject[ReceiverParameterDescriptorImpl]

'this' @ [62:47] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.getClassNameForCompanionObject[ReceiverParameterDescriptorImpl]

'isCompanion' @ [62:52] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'getNonStrictParentOfType' @ [63:9] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'name' @ [63:46] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'!' @ [70:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDataClassProperty' @ [70:10] ==> public fun KtParameter.isDataClassProperty(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file searchHelpers.kt[SimpleFunctionDescriptorImpl]

'this' @ [72:19] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[ReceiverParameterDescriptorImpl]

'analyze' @ [72:24] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [73:27] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [73:50] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [73:77] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[ReceiverParameterDescriptorImpl]

'paramDescriptor' @ [75:23] ==> val paramDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'containingDeclaration' @ [75:40] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'constructor' @ [76:17] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'valueParameters' @ [76:29] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'indexOf' @ [76:45] ==> public abstract fun indexOf(element: (ValueParameterDescriptor..ValueParameterDescriptor?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'paramDescriptor' @ [76:53] ==> val paramDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'DataClassDescriptorResolver' @ [77:38] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'createComponentName' @ [77:66] ==> public final fun createComponentName(index: Int): Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'index' @ [77:86] ==> val index: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'constructor' @ [79:21] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'containingDeclaration' @ [79:33] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'dataClass' @ [80:5] ==> val dataClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [80:15] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [80:40] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'correspondingComponentName' @ [80:64] ==> val correspondingComponentName: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'FROM_IDE' @ [80:109] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'context' @ [82:12] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'DATA_CLASS_COMPONENT_FUNCTION' @ [82:35] ==> public final val DATA_CLASS_COMPONENT_FUNCTION: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'paramDescriptor' @ [82:66] ==> val paramDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.dataClassComponentFunction[LocalVariableDescriptor]

'!' @ [86:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasValOrVar' @ [86:10] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'this' @ [87:12] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.isDataClassProperty[ReceiverParameterDescriptorImpl]

'containingClassOrObject' @ [87:17] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'hasModifier' @ [87:42] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'DATA_KEYWORD' @ [87:63] ==> public final val DATA_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

