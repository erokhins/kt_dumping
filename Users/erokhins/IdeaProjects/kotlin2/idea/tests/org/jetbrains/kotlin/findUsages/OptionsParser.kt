'KotlinClassFindUsagesOptions' @ [31:20] ==> public constructor KotlinClassFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[DeserializedClassConstructorDescriptor]

'project' @ [31:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse[ValueParameterDescriptorImpl]

'apply' @ [31:58] ==> @InlineOnly public inline fun <T> KotlinClassFindUsagesOptions.apply(block: KotlinClassFindUsagesOptions.() -> Unit): KotlinClassFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinClassFindUsagesOptions

'isUsages' @ [32:17] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isSearchForTextOccurrences' @ [33:17] ==> public final var isSearchForTextOccurrences: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'searchConstructorUsages' @ [34:17] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[DeserializedPropertyDescriptor]

'iterator' @ [35:27] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findListWithPrefixes' @ [35:49] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [35:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse[ValueParameterDescriptorImpl]

'parseCommonOptions' @ [36:25] ==> protected final fun parseCommonOptions(options: JavaFindUsagesOptions, s: String): Boolean defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'this' @ [36:44] ==> <this> defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse.<anonymous>[ReceiverParameterDescriptorImpl]

's' @ [36:50] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse.<anonymous>[LocalVariableDescriptor]

'when (s) {
                        "constructorUsages" -> searchConstructorUsages = true
                        "derivedInterfaces" -> isDerivedInterfaces = true
                        "derivedClasses" -> isDerivedClasses = true
                        "functionUsages" -> isMethodsUsages = true
                        "propertyUsages" -> isFieldsUsages = true
                        else -> throw IllegalStateException("Invalid option: " + s)
                    }' @ [38:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

's' @ [38:27] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse.<anonymous>[LocalVariableDescriptor]

'searchConstructorUsages' @ [39:48] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[DeserializedPropertyDescriptor]

'isDerivedInterfaces' @ [40:48] ==> public final var isDerivedInterfaces: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isDerivedClasses' @ [41:45] ==> public final var isDerivedClasses: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isMethodsUsages' @ [42:45] ==> public final var isMethodsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isFieldsUsages' @ [43:45] ==> public final var isFieldsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'IllegalStateException' @ [44:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [44:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [44:82] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.CLASS.parse.<anonymous>[LocalVariableDescriptor]

'KotlinFunctionFindUsagesOptions' @ [52:20] ==> public constructor KotlinFunctionFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[DeserializedClassConstructorDescriptor]

'project' @ [52:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse[ValueParameterDescriptorImpl]

'apply' @ [52:61] ==> @InlineOnly public inline fun <T> KotlinFunctionFindUsagesOptions.apply(block: KotlinFunctionFindUsagesOptions.() -> Unit): KotlinFunctionFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFunctionFindUsagesOptions

'isUsages' @ [53:17] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'iterator' @ [54:27] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findListWithPrefixes' @ [54:49] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [54:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse[ValueParameterDescriptorImpl]

'parseCommonOptions' @ [55:25] ==> protected final fun parseCommonOptions(options: JavaFindUsagesOptions, s: String): Boolean defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'this' @ [55:44] ==> <this> defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse.<anonymous>[ReceiverParameterDescriptorImpl]

's' @ [55:50] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse.<anonymous>[LocalVariableDescriptor]

'when (s) {
                        "overrides" -> {
                            isOverridingMethods = true
                            isImplementingMethods = true
                        }
                        "overloadUsages" -> {
                            isIncludeOverloadUsages = true
                            isUsages = true
                        }
                        else -> throw IllegalStateException("Invalid option: " + s)
                    }' @ [57:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

's' @ [57:27] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse.<anonymous>[LocalVariableDescriptor]

'isOverridingMethods' @ [59:29] ==> public final var isOverridingMethods: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'isImplementingMethods' @ [60:29] ==> public final var isImplementingMethods: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'isIncludeOverloadUsages' @ [63:29] ==> public final var isIncludeOverloadUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'isUsages' @ [64:29] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinFunctionFindUsagesOptions[JavaPropertyDescriptor]

'IllegalStateException' @ [66:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [66:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [66:82] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.FUNCTION.parse.<anonymous>[LocalVariableDescriptor]

'KotlinPropertyFindUsagesOptions' @ [74:20] ==> public constructor KotlinPropertyFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[DeserializedClassConstructorDescriptor]

'project' @ [74:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse[ValueParameterDescriptorImpl]

'apply' @ [74:61] ==> @InlineOnly public inline fun <T> KotlinPropertyFindUsagesOptions.apply(block: KotlinPropertyFindUsagesOptions.() -> Unit): KotlinPropertyFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPropertyFindUsagesOptions

'isUsages' @ [75:17] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'iterator' @ [76:27] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findListWithPrefixes' @ [76:49] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [76:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse[ValueParameterDescriptorImpl]

'parseCommonOptions' @ [77:25] ==> protected final fun parseCommonOptions(options: JavaFindUsagesOptions, s: String): Boolean defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'this' @ [77:44] ==> <this> defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse.<anonymous>[ReceiverParameterDescriptorImpl]

's' @ [77:50] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse.<anonymous>[LocalVariableDescriptor]

'when (s) {
                        "overrides" -> searchOverrides = true
                        "skipRead" -> isReadAccess = false
                        "skipWrite" -> isWriteAccess = false
                        else -> throw IllegalStateException("Invalid option: " + s)
                    }' @ [79:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

's' @ [79:27] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse.<anonymous>[LocalVariableDescriptor]

'searchOverrides' @ [80:40] ==> public open var searchOverrides: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[DeserializedPropertyDescriptor]

'isReadAccess' @ [81:39] ==> public final var isReadAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'isWriteAccess' @ [82:40] ==> public final var isWriteAccess: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinPropertyFindUsagesOptions[JavaPropertyDescriptor]

'IllegalStateException' @ [83:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [83:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [83:82] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.PROPERTY.parse.<anonymous>[LocalVariableDescriptor]

'KotlinClassFindUsagesOptions' @ [91:20] ==> public constructor KotlinClassFindUsagesOptions(project: Project) defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[DeserializedClassConstructorDescriptor]

'project' @ [91:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse[ValueParameterDescriptorImpl]

'apply' @ [91:58] ==> @InlineOnly public inline fun <T> KotlinClassFindUsagesOptions.apply(block: KotlinClassFindUsagesOptions.() -> Unit): KotlinClassFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinClassFindUsagesOptions

'isUsages' @ [92:17] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'searchConstructorUsages' @ [93:17] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[DeserializedPropertyDescriptor]

'iterator' @ [94:27] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findListWithPrefixes' @ [94:49] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [94:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse[ValueParameterDescriptorImpl]

'parseCommonOptions' @ [95:25] ==> protected final fun parseCommonOptions(options: JavaFindUsagesOptions, s: String): Boolean defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'this' @ [95:44] ==> <this> defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse.<anonymous>[ReceiverParameterDescriptorImpl]

's' @ [95:50] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse.<anonymous>[LocalVariableDescriptor]

'when (s) {
                        "derivedInterfaces" -> isDerivedInterfaces = true
                        "derivedClasses" -> isDerivedClasses = true
                        "implementingClasses" -> isImplementingClasses = true
                        "methodUsages" -> isMethodsUsages = true
                        "fieldUsages" -> isFieldsUsages = true
                        else -> throw IllegalStateException("Invalid option: " + s)
                    }' @ [97:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

's' @ [97:27] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse.<anonymous>[LocalVariableDescriptor]

'isDerivedInterfaces' @ [98:48] ==> public final var isDerivedInterfaces: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isDerivedClasses' @ [99:45] ==> public final var isDerivedClasses: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isImplementingClasses' @ [100:50] ==> public final var isImplementingClasses: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isMethodsUsages' @ [101:43] ==> public final var isMethodsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'isFieldsUsages' @ [102:42] ==> public final var isFieldsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'IllegalStateException' @ [103:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [103:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [103:82] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_CLASS.parse.<anonymous>[LocalVariableDescriptor]

'JavaMethodFindUsagesOptions' @ [111:20] ==> public constructor JavaMethodFindUsagesOptions(@NotNull p0: Project) defined in com.intellij.find.findUsages.JavaMethodFindUsagesOptions[JavaClassConstructorDescriptor]

'project' @ [111:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse[ValueParameterDescriptorImpl]

'apply' @ [111:57] ==> @InlineOnly public inline fun <T> JavaMethodFindUsagesOptions.apply(block: JavaMethodFindUsagesOptions.() -> Unit): JavaMethodFindUsagesOptions defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethodFindUsagesOptions

'isUsages' @ [112:17] ==> public final var isUsages: Boolean defined in com.intellij.find.findUsages.JavaMethodFindUsagesOptions[JavaPropertyDescriptor]

'iterator' @ [113:27] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findListWithPrefixes' @ [113:49] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [113:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse[ValueParameterDescriptorImpl]

'parseCommonOptions' @ [114:25] ==> protected final fun parseCommonOptions(options: JavaFindUsagesOptions, s: String): Boolean defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'this' @ [114:44] ==> <this> defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse.<anonymous>[ReceiverParameterDescriptorImpl]

's' @ [114:50] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse.<anonymous>[LocalVariableDescriptor]

'when (s) {
                        "overrides" -> {
                            isOverridingMethods = true
                            isImplementingMethods = true
                        }
                        else -> throw IllegalStateException("Invalid option: " + s)
                    }' @ [116:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

's' @ [116:27] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse.<anonymous>[LocalVariableDescriptor]

'isOverridingMethods' @ [118:29] ==> public final var isOverridingMethods: Boolean defined in com.intellij.find.findUsages.JavaMethodFindUsagesOptions[JavaPropertyDescriptor]

'isImplementingMethods' @ [119:29] ==> public final var isImplementingMethods: Boolean defined in com.intellij.find.findUsages.JavaMethodFindUsagesOptions[JavaPropertyDescriptor]

'IllegalStateException' @ [121:39] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [121:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [121:82] ==> val s: (String..String?) defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_METHOD.parse.<anonymous>[LocalVariableDescriptor]

'JavaVariableFindUsagesOptions' @ [129:20] ==> public constructor JavaVariableFindUsagesOptions(@NotNull p0: Project) defined in com.intellij.find.findUsages.JavaVariableFindUsagesOptions[JavaClassConstructorDescriptor]

'project' @ [129:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_FIELD.parse[ValueParameterDescriptorImpl]

'JavaPackageFindUsagesOptions' @ [134:20] ==> public constructor JavaPackageFindUsagesOptions(@NotNull p0: Project) defined in com.intellij.find.findUsages.JavaPackageFindUsagesOptions[JavaClassConstructorDescriptor]

'project' @ [134:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.JAVA_PACKAGE.parse[ValueParameterDescriptorImpl]

'FindUsagesOptions' @ [139:20] ==> public constructor FindUsagesOptions(@NotNull p0: Project) defined in com.intellij.find.findUsages.FindUsagesOptions[JavaClassConstructorDescriptor]

'project' @ [139:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.OptionsParser.DEFAULT.parse[ValueParameterDescriptorImpl]

'when (s) {
                "usages" -> {
                    options.isUsages = true
                    return true
                }
                "skipImports" -> {
                    options.isSkipImportStatements = true
                    return true
                }
                "textOccurrences" -> {
                    options.isSearchForTextOccurrences = true
                    return true
                }
                else -> return false
            }' @ [147:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

's' @ [147:19] ==> value-parameter s: String defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion.parseCommonOptions[ValueParameterDescriptorImpl]

'options' @ [149:21] ==> value-parameter options: JavaFindUsagesOptions defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion.parseCommonOptions[ValueParameterDescriptorImpl]

'isUsages' @ [149:29] ==> public final var isUsages: Boolean defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'options' @ [153:21] ==> value-parameter options: JavaFindUsagesOptions defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion.parseCommonOptions[ValueParameterDescriptorImpl]

'isSkipImportStatements' @ [153:29] ==> public final var isSkipImportStatements: Boolean defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'options' @ [157:21] ==> value-parameter options: JavaFindUsagesOptions defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion.parseCommonOptions[ValueParameterDescriptorImpl]

'isSearchForTextOccurrences' @ [157:29] ==> public final var isSearchForTextOccurrences: Boolean defined in com.intellij.find.findUsages.JavaFindUsagesOptions[JavaPropertyDescriptor]

'when (klass) {
                KtNamedFunction::class.java -> FUNCTION
                KtProperty::class.java, KtParameter::class.java -> PROPERTY
                KtClass::class.java -> CLASS
                PsiMethod::class.java -> JAVA_METHOD
                PsiClass::class.java -> JAVA_CLASS
                PsiField::class.java -> JAVA_FIELD
                PsiPackage::class.java -> JAVA_PACKAGE
                KtTypeParameter::class.java -> DEFAULT
                else -> null
            }' @ [166:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OptionsParser?, entry1: OptionsParser?, entry2: OptionsParser?, entry3: OptionsParser?, entry4: OptionsParser?, entry5: OptionsParser?, entry6: OptionsParser?, entry7: OptionsParser?, entry8: OptionsParser?): OptionsParser?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> OptionsParser?

'klass' @ [166:26] ==> value-parameter klass: Class<out PsiElement> defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion.getParserByPsiElementClass[ValueParameterDescriptorImpl]

'java' @ [167:40] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'FUNCTION' @ [167:48] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [168:35] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [168:60] ==> public val <T> KClass<KtParameter>.java: Class<KtParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'PROPERTY' @ [168:68] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [169:32] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'CLASS' @ [169:40] ==> enum entry CLASS defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [170:34] ==> public val <T> KClass<PsiMethod>.java: Class<PsiMethod> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiMethod

'JAVA_METHOD' @ [170:42] ==> enum entry JAVA_METHOD defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [171:33] ==> public val <T> KClass<PsiClass>.java: Class<PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'JAVA_CLASS' @ [171:41] ==> enum entry JAVA_CLASS defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [172:33] ==> public val <T> KClass<PsiField>.java: Class<PsiField> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiField

'JAVA_FIELD' @ [172:41] ==> enum entry JAVA_FIELD defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [173:35] ==> public val <T> KClass<PsiPackage>.java: Class<PsiPackage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiPackage

'JAVA_PACKAGE' @ [173:43] ==> enum entry JAVA_PACKAGE defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'java' @ [174:40] ==> public val <T> KClass<KtTypeParameter>.java: Class<KtTypeParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'DEFAULT' @ [174:48] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

