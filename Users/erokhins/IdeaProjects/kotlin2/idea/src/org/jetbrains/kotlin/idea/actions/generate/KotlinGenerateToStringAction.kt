'findDeclaredFunction' @ [48:12] ==> public tailrec fun ClassDescriptor.findDeclaredFunction(name: String, checkSuperClasses: Boolean, filter: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate in file utils.kt[SimpleFunctionDescriptorImpl]

'checkSupers' @ [48:45] ==> value-parameter checkSupers: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredToString[ValueParameterDescriptorImpl]

'it' @ [48:60] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredToString.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [48:63] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [48:79] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [48:92] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredToString.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [48:95] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [48:110] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinGenerateMemberActionBase<KotlinGenerateToStringAction.Info>' @ [51:38] ==> public constructor KotlinGenerateMemberActionBase<Info : Any>() defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateMemberActionBase[ClassConstructorDescriptorImpl]
Inferred types:
    <Info : Any> -> Info

'getInstance' @ [53:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinGenerateToStringAction' @ [53:46] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction[FakeCallableDescriptorForObject]

'java' @ [53:82] ==> public val <T> KClass<KotlinGenerateToStringAction>.java: Class<KotlinGenerateToStringAction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinGenerateToStringAction

'getValue' @ [55:52] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [55:73] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<((KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info..((KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info)?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ((org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info) -> org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info..((org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info) -> org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info)?)

'' @ [65:24] ==> private constructor Generator(text: String) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator[ClassConstructorDescriptorImpl]

'info' @ [67:33] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate[ValueParameterDescriptorImpl]

'classDescriptor' @ [67:38] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'name' @ [67:54] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [67:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'buildString' @ [69:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [70:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [70:40] ==> val className: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate[LocalVariableDescriptor]

'quoteIfNeeded' @ [70:50] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'info' @ [71:21] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate[ValueParameterDescriptorImpl]

'variablesToUse' @ [71:26] ==> public final val variablesToUse: List<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'joinTo' @ [71:41] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<VariableDescriptor>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((VariableDescriptor) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [71:48] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate.<anonymous>[ReceiverParameterDescriptorImpl]

'!!' @ [72:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiElement?): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiElement

'DescriptorToSourceUtilsIde' @ [72:36] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [72:63] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'info' @ [72:81] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate[ValueParameterDescriptorImpl]

'project' @ [72:86] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'it' @ [72:95] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [72:126] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'text' @ [72:143] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'ref' @ [73:27] ==> val ref: (String..String?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'renderVariableValue' @ [73:33] ==> protected final fun renderVariableValue(variableDescriptor: VariableDescriptor, ref: String): String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE[SimpleFunctionDescriptorImpl]

'it' @ [73:53] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [73:57] ==> val ref: (String..String?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate.<anonymous>.<anonymous>[LocalVariableDescriptor]

'append' @ [75:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'info' @ [76:25] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.SINGLE_TEMPLATE.generate[ValueParameterDescriptorImpl]

'generateSuperCall' @ [76:30] ==> public final val generateSuperCall: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'append' @ [77:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [79:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'' @ [84:27] ==> private constructor Generator(text: String) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator[ClassConstructorDescriptorImpl]

'info' @ [86:33] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[ValueParameterDescriptorImpl]

'classDescriptor' @ [86:38] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'name' @ [86:54] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [86:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'buildString' @ [88:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (info.variablesToUse.isNotEmpty()) {
                        append("return \"${className.quoteIfNeeded()}(\" +\n")
                        val varIterator = info.variablesToUse.iterator()
                        while (varIterator.hasNext()) {
                            val it = varIterator.next()
                            val ref = (DescriptorToSourceUtilsIde.getAnyDeclaration(info.project, it) as PsiNameIdentifierOwner).nameIdentifier!!.text
                            append("\"$ref=${renderVariableValue(it, ref)}")
                            if (varIterator.hasNext()) {
                                append(',')
                            }
                            append("\" +\n")
                        }
                        append("\")\"")
                    }
                    else {
                        append("return \"$className()\"")
                    }' @ [89:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'info' @ [89:25] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[ValueParameterDescriptorImpl]

'variablesToUse' @ [89:30] ==> public final val variablesToUse: List<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'isNotEmpty' @ [89:45] ==> @InlineOnly public inline fun <T> Collection<VariableDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'append' @ [90:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [90:44] ==> val className: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[LocalVariableDescriptor]

'quoteIfNeeded' @ [90:54] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'info' @ [91:43] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[ValueParameterDescriptorImpl]

'variablesToUse' @ [91:48] ==> public final val variablesToUse: List<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'iterator' @ [91:63] ==> public abstract fun iterator(): Iterator<VariableDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'varIterator' @ [92:32] ==> val varIterator: Iterator<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'hasNext' @ [92:44] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'varIterator' @ [93:38] ==> val varIterator: Iterator<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'next' @ [93:50] ==> public abstract operator fun next(): VariableDescriptor defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'!!' @ [94:39] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiElement?): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiElement

'DescriptorToSourceUtilsIde' @ [94:40] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [94:67] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'info' @ [94:85] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[ValueParameterDescriptorImpl]

'project' @ [94:90] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'it' @ [94:99] ==> val it: VariableDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'nameIdentifier' @ [94:130] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'text' @ [94:147] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'append' @ [95:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ref' @ [95:40] ==> val ref: (String..String?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'renderVariableValue' @ [95:46] ==> protected final fun renderVariableValue(variableDescriptor: VariableDescriptor, ref: String): String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES[SimpleFunctionDescriptorImpl]

'it' @ [95:66] ==> val it: VariableDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'ref' @ [95:70] ==> val ref: (String..String?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'varIterator' @ [96:33] ==> val varIterator: Iterator<VariableDescriptor> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate.<anonymous>[LocalVariableDescriptor]

'hasNext' @ [96:45] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'append' @ [97:33] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [99:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [101:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [104:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [104:43] ==> val className: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[LocalVariableDescriptor]

'info' @ [107:25] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.MULTIPLE_TEMPLATES.generate[ValueParameterDescriptorImpl]

'generateSuperCall' @ [107:30] ==> public final val generateSuperCall: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'append' @ [108:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'variableDescriptor' @ [115:24] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[ValueParameterDescriptorImpl]

'type' @ [115:43] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'when {
                KotlinBuiltIns.isArray(type) || KotlinBuiltIns.isPrimitiveArray(type) -> "\${java.util.Arrays.toString($ref)}"
                KotlinBuiltIns.isString(type) -> "'$$ref'"
                else -> "$$ref"
            }' @ [116:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isArray' @ [117:32] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [117:40] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[LocalVariableDescriptor]

'isPrimitiveArray' @ [117:64] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [117:81] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[LocalVariableDescriptor]

'ref' @ [117:121] ==> value-parameter ref: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[ValueParameterDescriptorImpl]

'isString' @ [118:32] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [118:41] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[LocalVariableDescriptor]

'ref' @ [118:54] ==> value-parameter ref: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[ValueParameterDescriptorImpl]

'ref' @ [119:28] ==> value-parameter ref: String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator.renderVariableValue[ValueParameterDescriptorImpl]

'targetClass' @ [127:16] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.isValidForClass[ValueParameterDescriptorImpl]

'!' @ [128:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [128:20] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.isValidForClass[ValueParameterDescriptorImpl]

'isAnnotation' @ [128:32] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'!' @ [129:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [129:20] ==> value-parameter targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.isValidForClass[ValueParameterDescriptorImpl]

'isInterface' @ [129:32] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'klass' @ [133:13] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'AssertionError' @ [133:38] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'klass' @ [133:69] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [133:75] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'klass' @ [135:23] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'analyzeFully' @ [135:29] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [136:31] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'get' @ [136:39] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [136:58] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'klass' @ [136:65] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'classDescriptor' @ [138:9] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'findDeclaredToString' @ [138:25] ==> private fun ClassDescriptor.findDeclaredToString(checkSupers: Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate in file KotlinGenerateToStringAction.kt[SimpleFunctionDescriptorImpl]

'let' @ [138:54] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Unit?

'!' @ [139:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'confirmMemberRewrite' @ [139:18] ==> public fun confirmMemberRewrite(targetClass: KtClass, vararg descriptors: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.actions.generate in file utils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [139:39] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'it' @ [139:46] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'runWriteAction' @ [141:13] ==> public fun <T> runWriteAction(action: () -> Unit?): Unit? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit?

'it' @ [143:21] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [143:24] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [143:31] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'delete' @ [143:41] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'LOG' @ [146:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Companion[PropertyDescriptorImpl]

'error' @ [146:25] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [146:31] ==> val e: IncorrectOperationException defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getPropertiesToUseInGeneratedMember' @ [151:26] ==> public fun getPropertiesToUseInGeneratedMember(classOrObject: KtClassOrObject): List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate in file utils.kt[SimpleFunctionDescriptorImpl]

'klass' @ [151:62] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'getApplication' @ [152:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [152:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'Info' @ [153:24] ==> public constructor Info(classDescriptor: ClassDescriptor, variablesToUse: List<VariableDescriptor>, generateSuperCall: Boolean, generator: KotlinGenerateToStringAction.Generator, project: Project) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[ClassConstructorDescriptorImpl]

'classDescriptor' @ [153:29] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'properties' @ [154:29] ==> val properties: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'map' @ [154:40] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> VariableDescriptor): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> VariableDescriptor

'context' @ [154:46] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [154:69] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [154:96] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'SINGLE_TEMPLATE' @ [156:39] ==> enum entry SINGLE_TEMPLATE defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator[FakeCallableDescriptorForObject]

'project' @ [157:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'klass' @ [158:20] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'adjuster' @ [158:26] ==> public final var KtClass.adjuster: ((KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info)? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Companion[PropertyDescriptorImpl]

'let' @ [158:36] ==> @InlineOnly public inline fun <T, R> ((KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info).let(block: ((KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info) -> KotlinGenerateToStringAction.Info): KotlinGenerateToStringAction.Info defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<Info, Info>
    <R> -> Info

'invoke' @ [158:42] ==> public abstract operator fun invoke(p1: KotlinGenerateToStringAction.Info): KotlinGenerateToStringAction.Info defined in kotlin.Function1[FunctionInvokeDescriptor]

'info' @ [158:45] ==> val info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'info' @ [158:56] ==> val info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'classDescriptor' @ [161:29] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'getSuperClassOrAny' @ [161:45] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'findDeclaredToString' @ [161:66] ==> private fun ClassDescriptor.findDeclaredToString(checkSupers: Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate in file KotlinGenerateToStringAction.kt[SimpleFunctionDescriptorImpl]

'properties' @ [163:36] ==> val properties: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'map' @ [163:47] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> DescriptorMemberChooserObject): List<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> DescriptorMemberChooserObject

'DescriptorMemberChooserObject' @ [163:53] ==> public constructor DescriptorMemberChooserObject(psiElement: PsiElement, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedClassConstructorDescriptor]

'it' @ [163:83] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [163:87] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [163:90] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [163:115] ==> public inline fun <reified T> Collection<DescriptorMemberChooserObject>.toTypedArray(): Array<DescriptorMemberChooserObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> DescriptorMemberChooserObject

'ToStringMemberChooserHeaderPanel' @ [164:27] ==> public constructor ToStringMemberChooserHeaderPanel(allowSuperCall: Boolean) defined in org.jetbrains.kotlin.idea.actions.generate.ToStringMemberChooserHeaderPanel[JavaClassConstructorDescriptor]

'!' @ [164:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'superToString' @ [164:61] ==> val superToString: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'builtIns' @ [164:75] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'isMemberOfAny' @ [164:84] ==> public open fun isMemberOfAny(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'superToString' @ [164:98] ==> val superToString: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'MemberChooser' @ [165:23] ==> public constructor MemberChooser<T : (ClassMember..ClassMember?)>(p0: (Array<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>..Array<out (DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?), p1: Boolean, p2: Boolean, @NotNull p3: Project, p4: Boolean, @Nullable p5: JComponent?) defined in com.intellij.ide.util.MemberChooser[JavaClassConstructorDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'memberChooserObjects' @ [165:68] ==> val memberChooserObjects: Array<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'project' @ [165:102] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'headerPanel' @ [165:118] ==> val headerPanel: ToStringMemberChooserHeaderPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'apply' @ [165:131] ==> @InlineOnly public inline fun <T> MemberChooser<DescriptorMemberChooserObject>.apply(block: MemberChooser<DescriptorMemberChooserObject>.() -> Unit): MemberChooser<DescriptorMemberChooserObject> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberChooser<DescriptorMemberChooserObject>

'title' @ [166:13] ==> public final var <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.title: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'setCopyJavadocVisible' @ [167:13] ==> public open fun setCopyJavadocVisible(p0: Boolean): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'selectElements' @ [168:13] ==> public open fun selectElements(p0: (Array<(ClassMember..ClassMember?)>..Array<out (ClassMember..ClassMember?)>?)): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'memberChooserObjects' @ [168:28] ==> val memberChooserObjects: Array<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'chooser' @ [171:9] ==> val chooser: MemberChooser<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'show' @ [171:17] ==> public open fun show(): Unit defined in com.intellij.ide.util.MemberChooser[JavaMethodDescriptor]

'chooser' @ [172:13] ==> val chooser: MemberChooser<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'exitCode' @ [172:21] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.exitCode: Int[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'OK_EXIT_CODE' @ [172:47] ==> public const final val OK_EXIT_CODE: Int defined in com.intellij.openapi.ui.DialogWrapper[JavaPropertyDescriptor]

'Info' @ [174:16] ==> public constructor Info(classDescriptor: ClassDescriptor, variablesToUse: List<VariableDescriptor>, generateSuperCall: Boolean, generator: KotlinGenerateToStringAction.Generator, project: Project) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[ClassConstructorDescriptorImpl]

'classDescriptor' @ [174:21] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'chooser' @ [175:21] ==> val chooser: MemberChooser<DescriptorMemberChooserObject> defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'selectedElements' @ [175:29] ==> public final val <T : (ClassMember..ClassMember?)> MemberChooser<DescriptorMemberChooserObject>.selectedElements: (MutableList<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?..List<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (ClassMember..ClassMember?)> -> DescriptorMemberChooserObject

'map' @ [175:47] ==> public inline fun <T, R> Iterable<(DescriptorMemberChooserObject..DescriptorMemberChooserObject?)>.map(transform: ((DescriptorMemberChooserObject..DescriptorMemberChooserObject?)) -> VariableDescriptor): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject..org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject?)
    <R> -> VariableDescriptor

'it' @ [175:53] ==> value-parameter it: (DescriptorMemberChooserObject..DescriptorMemberChooserObject?) defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [175:56] ==> public open val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.util.DescriptorMemberChooserObject[DeserializedPropertyDescriptor]

'emptyList' @ [175:94] ==> public fun <T> emptyList(): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'headerPanel' @ [176:21] ==> val headerPanel: ToStringMemberChooserHeaderPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'isGenerateSuperCall' @ [176:33] ==> public final val ToStringMemberChooserHeaderPanel.isGenerateSuperCall: Boolean[MyPropertyDescriptor]

'headerPanel' @ [177:21] ==> val headerPanel: ToStringMemberChooserHeaderPanel defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[LocalVariableDescriptor]

'selectedGenerator' @ [177:33] ==> public final val ToStringMemberChooserHeaderPanel.selectedGenerator: (KotlinGenerateToStringAction.Generator..KotlinGenerateToStringAction.Generator?)[MyPropertyDescriptor]

'project' @ [178:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.prepareMembersInfo[ValueParameterDescriptorImpl]

'info' @ [182:29] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[ValueParameterDescriptorImpl]

'classDescriptor' @ [182:34] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'getSuperClassOrAny' @ [182:50] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'findDeclaredToString' @ [182:71] ==> private fun ClassDescriptor.findDeclaredToString(checkSupers: Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate in file KotlinGenerateToStringAction.kt[SimpleFunctionDescriptorImpl]

'generateFunctionSkeleton' @ [183:16] ==> public fun generateFunctionSkeleton(descriptor: FunctionDescriptor, project: Project): KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate in file utils.kt[SimpleFunctionDescriptorImpl]

'superToString' @ [183:41] ==> val superToString: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[LocalVariableDescriptor]

'project' @ [183:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[ValueParameterDescriptorImpl]

'apply' @ [183:65] ==> @InlineOnly public inline fun <T> KtNamedFunction.apply(block: KtNamedFunction.() -> Unit): KtNamedFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'bodyExpression' @ [184:13] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'replace' @ [184:30] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [184:38] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [184:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[ValueParameterDescriptorImpl]

'createExpression' @ [184:60] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'info' @ [184:83] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[ValueParameterDescriptorImpl]

'generator' @ [184:88] ==> public final val generator: KotlinGenerateToStringAction.Generator defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'generate' @ [184:98] ==> public abstract fun generate(info: KotlinGenerateToStringAction.Info): String defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Generator[SimpleFunctionDescriptorImpl]

'info' @ [184:107] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateToString[ValueParameterDescriptorImpl]

'info' @ [189:27] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[ValueParameterDescriptorImpl]

'classDescriptor' @ [189:32] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.Info[PropertyDescriptorImpl]

'source' @ [189:48] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [189:55] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'generateToString' @ [190:25] ==> private final fun generateToString(project: Project, info: KotlinGenerateToStringAction.Info): KtNamedFunction? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction[SimpleFunctionDescriptorImpl]

'project' @ [190:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[ValueParameterDescriptorImpl]

'info' @ [190:51] ==> value-parameter info: KotlinGenerateToStringAction.Info defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[ValueParameterDescriptorImpl]

'emptyList' @ [190:67] ==> public fun <T> emptyList(): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'with' @ [191:22] ==> @InlineOnly public inline fun <T, R> with(receiver: List<KtDeclaration>, block: List<KtDeclaration>.() -> KtDeclaration?): KtDeclaration? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtDeclaration>
    <R> -> KtDeclaration?

'targetClass' @ [191:27] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[LocalVariableDescriptor]

'declarations' @ [191:39] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastIsInstanceOrNull' @ [191:55] ==> public inline fun <reified T : Any> Iterable<*>.lastIsInstanceOrNull(): KtNamedFunction? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtNamedFunction

'lastOrNull' @ [191:98] ==> public fun <T> List<KtDeclaration>.lastOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'insertMembersAfter' @ [192:16] ==> public fun <T : KtDeclaration> insertMembersAfter(editor: Editor?, classOrObject: KtClassOrObject, members: Collection<KtNamedFunction>, anchor: PsiElement? = ...): List<KtNamedFunction> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : KtDeclaration> -> KtNamedFunction

'editor' @ [192:35] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[ValueParameterDescriptorImpl]

'targetClass' @ [192:43] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[LocalVariableDescriptor]

'listOf' @ [192:56] ==> public fun <T> listOf(element: KtNamedFunction): List<KtNamedFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'prototype' @ [192:63] ==> val prototype: KtNamedFunction defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[LocalVariableDescriptor]

'anchor' @ [192:75] ==> val anchor: KtDeclaration? defined in org.jetbrains.kotlin.idea.actions.generate.KotlinGenerateToStringAction.generateMembers[LocalVariableDescriptor]

