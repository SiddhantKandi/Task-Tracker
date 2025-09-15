package com.siddhant.tasks.mappers;

import com.siddhant.tasks.domain.dto.TaskDto;
import com.siddhant.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
