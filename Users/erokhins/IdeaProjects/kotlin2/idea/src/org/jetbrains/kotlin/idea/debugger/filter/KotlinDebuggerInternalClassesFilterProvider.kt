'listOf' @ [23:23] ==> public fun <T> listOf(vararg elements: ClassFilter): List<ClassFilter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassFilter

'ClassFilter' @ [24:9] ==> public constructor ClassFilter(p0: (String..String?)) defined in com.intellij.ui.classFilter.ClassFilter[JavaClassConstructorDescriptor]

'ClassFilter' @ [25:9] ==> public constructor ClassFilter(p0: (String..String?)) defined in com.intellij.ui.classFilter.ClassFilter[JavaClassConstructorDescriptor]

'ClassFilter' @ [26:9] ==> public constructor ClassFilter(p0: (String..String?)) defined in com.intellij.ui.classFilter.ClassFilter[JavaClassConstructorDescriptor]

'ClassFilter' @ [27:9] ==> public constructor ClassFilter(p0: (String..String?)) defined in com.intellij.ui.classFilter.ClassFilter[JavaClassConstructorDescriptor]

'ClassFilter' @ [28:9] ==> public constructor ClassFilter(p0: (String..String?)) defined in com.intellij.ui.classFilter.ClassFilter[JavaClassConstructorDescriptor]

'if (KotlinDebuggerSettings.getInstance().DEBUG_DISABLE_KOTLIN_INTERNAL_CLASSES) FILTERS else listOf()' @ [33:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ClassFilter>?, elseBranch: List<ClassFilter>?): List<ClassFilter>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ClassFilter>?

'KotlinDebuggerSettings' @ [33:20] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[FakeCallableDescriptorForObject]

'getInstance' @ [33:43] ==> public final fun getInstance(): KotlinDebuggerSettings defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings.Companion[SimpleFunctionDescriptorImpl]

'DEBUG_DISABLE_KOTLIN_INTERNAL_CLASSES' @ [33:57] ==> public final var DEBUG_DISABLE_KOTLIN_INTERNAL_CLASSES: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinDebuggerSettings[PropertyDescriptorImpl]

'FILTERS' @ [33:96] ==> private val FILTERS: List<ClassFilter> defined in org.jetbrains.kotlin.idea.debugger.filter in file KotlinDebuggerInternalClassesFilterProvider.kt[PropertyDescriptorImpl]

'listOf' @ [33:109] ==> @InlineOnly public inline fun <T> listOf(): List<ClassFilter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassFilter

