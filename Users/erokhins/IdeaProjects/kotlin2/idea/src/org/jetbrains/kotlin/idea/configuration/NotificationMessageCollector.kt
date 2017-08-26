'ArrayList' @ [28:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'messages' @ [31:9] ==> private final val messages: ArrayList<String> defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'add' @ [31:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'message' @ [31:22] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector.addMessage[ValueParameterDescriptorImpl]

'this' @ [32:16] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[LazyClassReceiverParameterDescriptor]

'messages' @ [36:13] ==> private final val messages: ArrayList<String> defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'isEmpty' @ [36:22] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'notify' @ [37:27] ==> public open fun notify(@NotNull p0: Notification, @Nullable p1: Project?): Unit defined in com.intellij.notification.Notifications.Bus[JavaMethodDescriptor]

'Notification' @ [37:34] ==> public constructor Notification(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @NotNull p3: NotificationType) defined in com.intellij.notification.Notification[JavaClassConstructorDescriptor]

'groupDisplayId' @ [37:47] ==> private final val groupDisplayId: String defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'title' @ [37:63] ==> private final val title: String defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'resultMessage' @ [37:70] ==> private final val resultMessage: String defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'INFORMATION' @ [37:102] ==> enum entry INFORMATION defined in com.intellij.notification.NotificationType[FakeCallableDescriptorForObject]

'project' @ [37:116] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'messages' @ [41:29] ==> private final val messages: ArrayList<String> defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'singleOrNull' @ [41:38] ==> public fun <T> List<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'singleMessage' @ [42:13] ==> val singleMessage: String? defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector.<get-resultMessage>[LocalVariableDescriptor]

'singleMessage' @ [42:43] ==> val singleMessage: String? defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector.<get-resultMessage>[LocalVariableDescriptor]

'messages' @ [44:16] ==> private final val messages: ArrayList<String> defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[PropertyDescriptorImpl]

'joinToString' @ [44:25] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'NotificationMessageCollector' @ [49:9] ==> public constructor NotificationMessageCollector(project: Project, groupDisplayId: String, title: String) defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[ClassConstructorDescriptorImpl]

'project' @ [49:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.createConfigureKotlinNotificationCollector[ValueParameterDescriptorImpl]

